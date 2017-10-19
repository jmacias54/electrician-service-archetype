package mx.com.archetype.electricianservice.service;

import mx.com.archetype.electricianservice.model.User;

public interface UserService {

	public User findUserByEmail(String email);
	public void saveUser(User user);
}
