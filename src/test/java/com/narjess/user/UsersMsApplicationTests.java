package com.narjess.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.narjess.user.entities.User;

@SpringBootTest
class UsersMsApplicationTests {
     @Autowired
     UserRepository userRep;
     
	@Test
	void contextLoads() {
	}
	@Test
	void testUsername() {
		User u=userRep.findByUsername("narjess");
		System.out.println(u);
	
		
	}
}
