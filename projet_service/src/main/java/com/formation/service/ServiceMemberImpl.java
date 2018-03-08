package com.formation.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dao.IDaoMember;
import com.formation.entity.Member;

@Service
public class ServiceMemberImpl implements IServiceMember {

    @Autowired
    IDaoMember iDaoMember;

    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static Pattern pattern;
    private Matcher matcher;
    
    

    @Override
    public void insert(Member member) {
        iDaoMember.insert(member);
    }

    @Override
    public Member findById(int memberId) {
        return iDaoMember.findById(memberId);
    }

    @Override
    public boolean findByEmail(String email) {
        List<Member> listeMembres = iDaoMember.findByEmail(email);
        if (listeMembres.size() == 0)
            return false;
        else
            return true;
    }

    @Override
    public List<Member> findAll() {
        return iDaoMember.findAll();
    }

    @Override
    public void update(Member member) {
        iDaoMember.update(member);
    }

    @Override
    public void delete(int memberId) {
        iDaoMember.delete(memberId);
    }

    @Override
    public boolean emailIsCorrect(String email) {
        pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public Member passwordRecovery(String email) {
        return iDaoMember.passwordRecovery(email);
    }
}
