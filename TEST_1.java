package com.kimi.tmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kimi")
public class SpringTemplateApplication {
	
	/**
	* @wi. TEST1/TEST-440 Returns author of this book
	**/
public String getAuthor() {
return this.author;
} 


	public static void main(String[] args) {
		//hello
		SpringApplication.run(SpringTemplateApplication.class, args);
		
	}

}
