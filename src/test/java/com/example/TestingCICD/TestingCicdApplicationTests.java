package com.example.TestingCICD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestingCicdApplicationTests {

	@Test
	public void contextLoads() {
		assertEquals(2 + 2, 4);
	}

}
