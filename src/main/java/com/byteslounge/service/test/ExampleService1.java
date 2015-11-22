package com.byteslounge.service.test;

import com.byteslounge.model.test.Account1;
import org.springframework.stereotype.Service;

@Service
public class ExampleService1 {

	public void testSave(Account1 entity){
		System.out.println("Inside ExampleService1.testSave");
	}

}
