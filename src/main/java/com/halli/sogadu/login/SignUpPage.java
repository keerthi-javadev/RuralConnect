package com.halli.sogadu.login;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class SignUpPage {

	@GetMapping("/generate-otp")
	private static char[] generateOTP() {
		int length = 6;
		String numbers = "1234567890";
		Random random = new Random();
		char[] otp = new char[length];

		for(int i = 0; i< length ; i++) {
			otp[i] = numbers.charAt(random.nextInt(numbers.length()));
		}
		return otp;
	}

}
