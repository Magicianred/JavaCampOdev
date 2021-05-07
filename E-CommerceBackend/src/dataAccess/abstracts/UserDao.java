package dataAccess.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserDao {
	 void add(User user);
	  void delete(User user);
	  
	User get (int id);
	List<User> getAll();
	List<String> getAllEmails();
	  }

