package com.demoTest;

import java.util.Properties;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class TestMailClass {
	public static void main(String[] args) {
		// Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("sk0788amantya@gmail.com", "zgvgcmodsurtyvfi"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("sk0788amantya@gmail.com");
			email.setSubject("TestMail");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("sk0788amantya@gmail.com");
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
		
	}
	

}
