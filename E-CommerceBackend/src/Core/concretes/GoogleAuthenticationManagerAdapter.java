package Core.concretes;

import Core.abstracts.AuthenticationService;
import Entities.concretes.User;

public class GoogleAuthenticationManagerAdapter implements AuthenticationService{

	@Override
	public void register(User user) {
		System.out.println("Google ile kayýt olundu  :" + user.getEmail());
		
	}

}
