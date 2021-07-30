package usersystem.user.database;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import usersystem.user.model.User;

/* Static Class that contains static Maps to simulate data storage */
public class DatabaseClass {

	/* Static Map that maps id to user */
	private static Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());
	
	/* Access UserMap by calling this static method */
	public static Map<Long, User> getUsers(){
		return users;
	}
	
}
