package com.formation.service.testunitaire;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import com.formation.service.interfaces.IMemberService;
import com.formation.service.implementations.MemberServiceImpl;

public class RegexTest {
	
	MemberServiceImpl memberService = new MemberServiceImpl();

	public RegexTest() { }

	@BeforeClass
	public static void setUpClass() {	}

	@AfterClass
	public static void tearDownClass() {	}

	@Before
	public void setUp() {	}

	@After
	public void tearDown() {	}

	@Test
	public void isEmailReg() throws Exception {
		assertTrue(memberService.validEmail("ab@cd.ef"));
		assertTrue(memberService.validEmail("abcdef@ghij.klmn"));
		assertTrue(memberService.validEmail("ab.c@f.ef"));
		assertTrue(memberService.validEmail("a@ghij.klmn"));
		
		assertFalse(memberService.validEmail("ab@c@d.e"));
		assertFalse(memberService.validEmail("abcdefghij"));
		assertFalse(memberService.validEmail("abcdefghij.kl"));
		assertFalse(memberService.validEmail("ab@cdef"));
	}
}
