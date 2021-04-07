package handleselenium;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSend {

	public static void main(String[] args) throws EmailException  {

	System.out.println("--------Tests Started---------");
	

	Email email = new SimpleEmail();
	email.setHostName("	smtp.live.com");
	email.setSmtpPort(587);
	email.setAuthenticator(new DefaultAuthenticator("fbfaisal.eee@outlook.com", "Shakilamonjil_1983"));
	email.setSSLOnConnect(true);
	email.setFrom("fbfaisal.eee@outlook.com");
	email.setSubject("TestMail");
	email.setMsg("This is a test mail ... :-)");
	email.addTo("pranmamun07@gmail.com");
	email.send();
			

	System.out.println("--------Tests Ended---------");	
		

	}

}
