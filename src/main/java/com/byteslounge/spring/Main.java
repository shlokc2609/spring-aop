package com.byteslounge.spring;

import java.util.List;

import com.byteslounge.model.test.Account1;
import com.byteslounge.model.test.Account2;
import com.byteslounge.service.test.ExampleService1;
import com.byteslounge.service.test.ExampleService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.byteslounge.model.Account;
import com.byteslounge.service.ExampleService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-config.xml");
//		ExampleService exampleService = (ExampleService) ctx
//				.getBean("exampleService");
//
//		Account account = new Account("000001", "Account 1");
//		exampleService.updateAccountBalance(account, 100L);
//
//		List<Account> accounts = exampleService.findCustomerAccounts(1L);
//
//		account.setAccountDescription("Test Description");
//		exampleService.updateAccountDescription(account);
//
//		exampleService.methodUsingGenerics(account);

		ExampleService1 ex1 = (ExampleService1) ctx.getBean("exampleService1");
		Account1 acc1 = new Account1();
		ex1.testSave(acc1);

		ExampleService2 ex2 = (ExampleService2) ctx.getBean("exampleService2");
		Account2 acc2 = new Account2();
		ex2.testSave(acc2);

	}
}
