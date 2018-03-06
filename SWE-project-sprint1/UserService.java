package storePlat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import storePlat.User;
import storePlat.UserRepository;

@Service("userService")
public class UserService {
	private UserRepository userRepository;
	
	@Autowired
    public UserService(UserRepository userRepository) { 
      this.userRepository = userRepository;
    }
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

}
