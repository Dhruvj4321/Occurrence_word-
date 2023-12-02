package com.wordCount.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.wordCount.demo.count.wordCountMethod;

@SpringBootTest
class DemoApplicationTests {
	
	

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testWordCount() {
		
		String st = "This This This";
		
//		wordCountMethod.wordCount(st);
		
		 
		
		assertEquals("{This=3}", wordCountMethod.wordCount(st).toString());
		
	}


	
}
