package usersystem.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import usersystem.user.database.DatabaseClass;
import usersystem.user.model.User;

/* Service Class with Methods that return users and userdata */
public class UserService {

	/* Local member variable that gets users from static instance */
	private Map<Long, User> users = DatabaseClass.getUsers();
	
	/* Constructor to see a testuser */
	public UserService() {
		users.put(1L, new User(1, "test@gmail.com", "test", "Testuser"));
	}
	
	/* Method that returns a list of User instances */
	public List<User> getAllUsers(){
		return new ArrayList<User>(users.values());
	}
	
	/* Method that accepts id and returns a specific user */
	public User getUser(long id) {
		return users.get(id);
	}

	/* Method that accepts email and returns a specific email */
	public User getEmail(String email) {
		return users.get(email);
	}
	
	/* Method that accepts password and returns a specific password */
	public User getPassword(String password) {
		return users.get(password);
	}
	
	/* Method that accepts name and returns a specific name */
	public User getName(String name) {
		return users.get(name);
	}
	
	/* Takes in a User object and returns added user */
	public User addUser(User user) {
		synchronized (users) {
			user.setId(users.size() +1);
			users.put(user.getId(), user);
		}	
		return user;
	}
	
	/* Takes User as an argument and returns updated user */
	public User updateUser(User user) {
		if (user.getId() <= 0) {
			return null;
		}
		users.put(user.getId(), user);
		return user;
	}
	
	/* Takes an id, removes user and returns removed user */
	public User removeUser(long id) {
		return users.remove(id);
	}
	
}
