import Core.concretes.GoogleAuthenticationManagerAdapter;
import Core.concretes.MailVerificationService;
import Entities.concretes.User;
import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		UserService userService = ( new UserManager(new HibernateUserDao(), new GoogleAuthenticationManagerAdapter(),
				new MailVerificationService()) );
		User user = new User(1, "Hatice", "Kýzýltaþ", "hatice@gmail.com", "123456", true);
		userService.add(user);
		GoogleAuthenticationManagerAdapter googleAuthenticationManagerAdapter = new GoogleAuthenticationManagerAdapter();
		googleAuthenticationManagerAdapter.register(user);

	}

}
