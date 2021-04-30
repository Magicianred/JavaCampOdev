package ödev3;


public class Main {

	public static void main(String[] args) {
		
		Instructor enginDemirog=new Instructor();
		enginDemirog.setId(1);
		
		Student haticeKiziltas=new Student();
		haticeKiziltas.setId(2);
		
		
		
		 UserManager userManager = new UserManager();
		    User[] users = {haticeKiziltas,enginDemirog}; 
		    
		    userManager.addMultiple(users);;

	}

}
