package business.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserService {
	 
		  void add(User user);
		  List<User> getAll();
		}