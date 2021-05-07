package Core.concretes;

import Entities.concretes.User;
import dataAccess.abstracts.VerificationService;

public class MailVerificationService implements VerificationService {

	@Override
	public void sendVerification(User user) {
		  System.out.println("mail do�rulamas� i�in " + user.getId() + " g�nderildi : " + user.getEmail());		
	}

}
