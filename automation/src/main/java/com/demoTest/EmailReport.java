package com.demoTest;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.sql.DataSource;
public class EmailReport {
	static Message message;
	private Properties props = System.getProperties();
   public static void main(String[] args) {
      // instance of Properties class
      Properties p = new Properties();
      // configure host server
      p.put("mail.smtp.host", "smtp.yahoo.com");
      // configure socket port p.put("mail.smtp.socketFactory.port", "529");
      // configure socket factory
      p.put ("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
      // configure true authentication p.put("mail.smtp.auth", "true");
      // configure smtp port
      p.put("mail.smtp.port", "465");
      // authentication with Session class
      Session s= Session.getDefaultInstance(p, new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("sk0788amantya@gmail.com", "zgvgcmodsurtyvfi");
         }
      });
      try {
    	  
		message.setFrom(new InternetAddress("sk0788amantya@gmail.com"));
          message.addRecipient(Message.RecipientType.TO, new InternetAddress("sk0788amantya@gmail.com"));
          message.setSubject("SUBJECT");

          message.setText("THE EMAIL TEXT");
          Transport.send(message);
      } catch (MessagingException ex) {
         throw new RuntimeException(ex);
      }
   }

}
