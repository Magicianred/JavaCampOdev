package business.concretes;

import java.util.List;

import Core.concretes.GoogleAuthenticationManagerAdapter;
import Core.concretes.MailVerificationService;
import Entities.concretes.User;
import business.abstracts.UserService;
import dataAccess.concretes.HibernateUserDao;

public class UserManager implements UserService {
	private HibernateUserDao hibernateUserDao;
	private GoogleAuthenticationManagerAdapter googleAuthenticationManagerAdapter;
	private MailVerificationService mailVerificationService;

	public UserManager(HibernateUserDao hibernateUserDao,
			GoogleAuthenticationManagerAdapter googleAuthenticationManagerAdapter,
			MailVerificationService mailVerificationService) {
		this.hibernateUserDao = hibernateUserDao;
		this.googleAuthenticationManagerAdapter = googleAuthenticationManagerAdapter;
		this.mailVerificationService = mailVerificationService;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(User user) {
		if(user.getFirstName().length() >= 2) {
			System.out.println("Kayýt Baþarýlý  :" + user.getFirstName());
		}

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
