package com.demoTest;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class DemoMail {
	static Message message;
	public static void main(String[] args){
//		Email mail = new SimpleEmail();
//		mail.setHostName("smtp.gmail.com");
//		mail.setSmtpPort(465);
//
//		mail.setAuthenticator(new DefaultAuthenticator("sk0788amantya@gmail.com", "zgvgcmodsurtyvfi"));
//		
//		mail.setSSLOnConnect(true);
//		mail.setFrom("sk0788amantya@gmail.com");
//		mail.setSubject("This is subject");
//		mail.setMsg("This is msg");
//		mail.addTo("sk0788amantya@gmail.com");
//		mail.send();
		 Properties props;
		props = System.getProperties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587"); 
		final String username ="sk0788amantya@gmail.com";
		final String password="zgvgcmodsurtyvfi";

		Session session = Session.getInstance(props,
		    new javax.mail.Authenticator() {
		        protected PasswordAuthentication getPasswordAuthentication() {
		            return new PasswordAuthentication(username, password);
		        }
		      });
		try {
		        
				message.setFrom(new InternetAddress("sk0788amantya@gmail.com"));
		        message.addRecipient(Message.RecipientType.TO, new InternetAddress("sk0788amantya@gmail.com"));
		        message.setSubject("SUBJECT");

		        message.setText("THE EMAIL TEXT");
		        Transport.send(message);
		    } catch (MessagingException e) {e.printStackTrace();}
		}
	}


