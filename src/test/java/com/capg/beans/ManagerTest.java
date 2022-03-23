package com.capg.beans;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {
	Manager manager;
	
	@BeforeEach
	void init() {
		manager=new Manager();
		manager.setId(788777);
		manager.setName("Ananya sharma");
		manager.setLoaction("mathura");
		manager.setSalary(20000);
		manager.setPf(5);
		manager.setHra(10);
	}

	@Test
	void testEmpInfo() {
		manager.empInformation();
	}

}
