package com.coreym.mvcdemo.services;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class EncryptionService {

	public String salt = "rip3DX2Y";
	public Integer key = 3;

	public String encryptPassword(String unencryptedPassword) {
		String encryptedPassword = "";

		for (int i = 0; i < unencryptedPassword.length(); i++) {

			if (i == 4) {
				encryptedPassword += salt;
			}

			Integer currentNum = Character.getNumericValue(unencryptedPassword.charAt(i));
			Integer newValue = currentNum + key;
			encryptedPassword += newValue;
		}

		return encryptedPassword;
	}
	
	public String unencryptPassword(String encryptedPassword) {
		String unencryptedPassword = "";
		
		for (int i = 0; i < encryptedPassword.length(); i++) {
			if (i == 4) {
				i += salt.length();
			}
			
			Integer currentNum = Character.getNumericValue(encryptedPassword.charAt(i));
			Integer newValue = currentNum - key;
			unencryptedPassword += newValue;
			
			
		}
		return unencryptedPassword;
		
		
	}
}
