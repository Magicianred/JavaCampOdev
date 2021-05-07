package dataAccess.abstracts;

import Entities.concretes.User;

public interface VerificationService {
 void sendVerification(User user);
}
