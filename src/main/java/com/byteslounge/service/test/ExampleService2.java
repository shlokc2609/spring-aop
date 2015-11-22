package com.byteslounge.service.test;

import com.byteslounge.model.test.Account2;
import org.springframework.stereotype.Service;

@Service
public class ExampleService2 {

	public void testSave(Account2 entity){
		System.out.println("Inside ExampleService2.testSave");
	}

}
