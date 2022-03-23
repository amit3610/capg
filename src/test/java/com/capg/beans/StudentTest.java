package com.capg.beans;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {
	
	Student student;

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}

	@BeforeEach
	void setUp() throws Exception {
		student= new Student();
		student.setRoll(1001);
		student.setName("ram kumar");
		student.setMarks(56f);
		
		}

	@AfterEach
	void tearDown() throws Exception {
		student= null;
	}

	@Test
	void testRoll() {
		assertEquals(1001,student.getRoll());
	}
	@Test
	void testName() {
		assertNotNull(student.getName());
		assertEquals("ram kumar",student.getName());
		assertTrue(student.getName().length()>=5);
		
		
	}
	@Test
	void testMarks() {
		assertEquals(56f,student.getMarks());
	}

}