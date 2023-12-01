package com.coreym.mvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coreym.mvcdemo.services.EncryptionService;

@SpringBootApplication
public class MvcdemoApplication {

	public static void main(String[] args) {
		
		EncryptionService eService = new EncryptionService();
		String encryptedPassword = eService.encryptPassword("123456");
//		System.out.println(eService.encryptPassword("12345"));
		String unencryptedPassword = eService.unencryptPassword(encryptedPassword);
		System.out.println(unencryptedPassword);
		SpringApplication.run(MvcdemoApplication.class, args);
	}
	
	

}
