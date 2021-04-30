package ödev3;


public class UserManager {
	  public void add(User user){
	        System.out.println("Ders eklendi"+ user.getId());
	    }
	  
	  public void addMultiple(User[] users) {
		  for(User user : users) {
			  add(user);
}
}
}