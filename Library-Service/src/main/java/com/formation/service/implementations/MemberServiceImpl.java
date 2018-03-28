package com.formation.service.implementations;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.entities.Member;
import com.formation.dao.interfaces.IGenericDao;
import com.formation.dao.interfaces.IMemberDao;
import com.formation.service.exceptions.ErrorConstants;
import com.formation.service.exceptions.ServiceException;
import com.formation.service.interfaces.IMemberService;

@Service
@Transactional
public class MemberServiceImpl implements IMemberService {
	@Autowired
	private IMemberDao memberDao;
	@Autowired
	private IGenericDao genericDao;
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
					Pattern.CASE_INSENSITIVE);

	@Override
	public void insert(Member member) throws Exception {
		genericDao.save(member);
	}

	@Override
	public Member getById(int memberId) throws Exception {
		return genericDao.getById(Member.class, memberId);
	}
	@Override
	public List<Member> getAll() throws Exception {
		return genericDao.getAll(Member.class);
	}

	@Override
	public void update(Member member) throws Exception {
		genericDao.saveOrUpdate(member);
	}

	@Override
	public void delete(Member member) throws Exception {

		genericDao.delete(member);
	}

	@Override
	public boolean isEmailExist(String email) throws Exception {
		List<Member> members = memberDao.getListMemberByEmail(email);
		if (members.isEmpty()) return true;
		else return false;
	}
	@Override
	public String passwordEncoding(String password) throws Exception {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] passBytes = password.getBytes();
			md.reset();
			byte[] digested = md.digest(passBytes);
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<digested.length;i++){
				sb.append(Integer.toHexString(0xff & digested[i]));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException ex) {
			// Logger.getLogger(CryptWithMD5.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println(ex);
		}
		return null;
	}

	@Override
	public Member login(String email, String password) throws Exception {
		if (!memberDao.isUserExist(email, passwordEncoding(password))) //password
			throw new ServiceException(ErrorConstants.ACCCOUNT_NOT_EXISTING);
		else
			return memberDao.getMemberByEmail(email);
	}
	@Override
	public boolean validEmail(String email) throws Exception {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
		return matcher.find();
	}
}
