//package com.formation.web.controllers;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.formation.dao.entities.Registration;
//import com.formation.service.interfaces.IRegistrationService;
//import com.formation.web.controller.dto.MemberDto;
//import com.formation.web.controller.dto.RegistrationDto;
//
//@RestController
//@RequestMapping("/registration")
//public class RegistrationController {
//
//	@Autowired
//	IRegistrationService registrationService;
//
//	/*********************** CREATE **************************************/
//	@PutMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
//	private Resultat putRegistration(@RequestBody RegistrationDto registrationDto) {
//
//		Resultat resultat = new Resultat();
//		try {
//			Registration registration = new Registration(registrationDto.getRegistrationDate(), registrationDto.getRegistrationLibraryId(), registrationDto.getRegistrationMemberId());
//			registrationService.insert(registration);
//
//			resultat.setPayload(registration); //
//			resultat.setSuccess(true);
//			resultat.setMessage(ConstantsController.ADD_REGISTRATION_SUCCESS);
//		} catch (ServiceException se) {
//			resultat.setSuccess(false);
//			resultat.setMessage(se.getMessage());
//		} catch (Exception e) {
//			resultat.setSuccess(false);
//			resultat.setMessage(ConstantsController.ADD_REGISTRATION_ERRORS);
//			e.printStackTrace();
//		}
//		return resultat;
//	}
//
//	/*********************** READ ALL ************************************/
//	@GetMapping(value = "/getAll")
//	private Resultat getAllMembers() {
//
//		Resultat resultat = new Resultat();
//		List<MemberDto> listMembers = new ArrayList<MemberDto>();
//
//		try {
//			List<Member> members = memberService.getAll();
//			members.forEach(member -> {
//				MemberDto memberDto = new MemberDto(member.getFirstname(), member.getLastname(), member.getEmail(), member.getPhone(), member.getAddress(), member.isAdmin());
//				memberDto.setMemberId(member.getMemberId());
//				listMembers.add(memberDto);
//				resultat.setPayload(listMembers);
//			});
//
//			resultat.setSuccess(true);
//			resultat.setMessage(ConstantsController.LIST_MEMBER_SUCCESS);
//		} catch (ServiceException se) {
//			resultat.setSuccess(false);
//			resultat.setMessage(se.getMessage());
//		} catch (Exception e) {
//			resultat.setSuccess(false);
//			resultat.setMessage(ConstantsController.LIST_MEMBER_ERRORS);
//			e.printStackTrace();
//		}
//		return resultat;
//	}
//
//	/************************* READ ************************************/
//	@GetMapping(value = "/get/{id}")
//	private Resultat getMemberById(@PathVariable(value = "id") int id) {
//
//		Resultat resultat = new Resultat();
//		try {
//			Member member = memberService.getById(id);
//			MemberDto memberById = new MemberDto(member.getFirstname(), member.getLastname(), member.getEmail(), member.getPhone(), member.getAddress(), member.isAdmin());
//			memberById.setMemberId(member.getMemberId());
//
//			resultat.setPayload(memberById);
//			resultat.setSuccess(true);
//			resultat.setMessage(ConstantsController.READ_MEMBER_SUCCESS);
//		} catch (ServiceException se) {
//			resultat.setSuccess(false);
//			resultat.setMessage(se.getMessage());
//		} catch (Exception e) {
//			resultat.setSuccess(false);
//			resultat.setMessage(ConstantsController.READ_MEMBER_ERRORS);
//			e.printStackTrace();
//		}
//		return resultat;
//	}
//
//	/************************* UPDATE ************************************/
//	@PostMapping(value = "/update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
//	private Resultat updateMember(@RequestBody MemberDto memberDto, @PathVariable(value = "id") int id) {
//
//		Resultat resultat = new Resultat();
//		try {
//			Member member = memberService.getById(id);
//			member.setFirstname(memberDto.getFirstname());
//			member.setLastname(memberDto.getLastname());
//			member.setEmail(memberDto.getEmail());
//			member.setPhone(memberDto.getPhone());
//			member.setAddress(memberDto.getAddress());
//			member.setActive(memberDto.isActive());
//			member.setAdmin(memberDto.isAdmin());
//
//			memberService.update(member);
//
//			resultat.setPayload(member); //
//			resultat.setSuccess(true);
//			resultat.setMessage(ConstantsController.UPDATE_MEMBER_SUCCESS);
//		} catch (ServiceException se) {
//			resultat.setSuccess(false);
//			resultat.setMessage(se.getMessage());
//		} catch (Exception e) {
//			resultat.setSuccess(false);
//			resultat.setMessage(ConstantsController.UPDATE_MEMBER_ERRORS);
//			e.printStackTrace();
//		}
//		return resultat;
//	}
//
//	/************************* DELETE ************************************/
//	@DeleteMapping(value = "/delete/{id}")
//	private Resultat deleteMember(@PathVariable(value = "id") int id) {
//
//		Resultat resultat = new Resultat();
//		try {
//			memberService.delete(memberService.getById(id));
//
//			String message = "Deleted";
//			resultat.setPayload(message); //
//			resultat.setSuccess(true);
//			resultat.setMessage(ConstantsController.DELETE_MEMBER_SUCCESS);
//		} catch (ServiceException se) {
//			resultat.setSuccess(false);
//			resultat.setMessage(se.getMessage());
//		} catch (Exception e) {
//			resultat.setSuccess(false);
//			resultat.setMessage(ConstantsController.DELETE_MEMBER_ERRORS);
//			e.printStackTrace();
//		}
//		return resultat;
//	}
//}
