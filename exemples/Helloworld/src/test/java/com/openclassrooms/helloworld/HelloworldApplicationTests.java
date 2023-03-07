package com.openclassrooms.helloworld;

import com.openclassrooms.helloworld.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	private BusinessService bs;
	@Test
	void contextLoads() {
	}

	@Test
	public void testBusinessService () {
		String sExpected = "Hello World!";
		String sResulted = bs.getHelloWorld().getValue();

		assertEquals(sExpected, sResulted);
	}

}
