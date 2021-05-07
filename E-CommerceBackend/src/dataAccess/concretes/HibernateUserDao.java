package dataAccess.concretes;

import java.util.List;

import Entities.concretes.User;
import dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Mail doðrulandý : " + user.getEmail());
		
	}

	@Override
	public void delete(User user) {
	
		
	}

	@Override
	public User get(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {

		return null;
	}

	@Override
	public List<String> getAllEmails() {
	
		return null;
	}

}
