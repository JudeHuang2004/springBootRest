package springBootRest.services;

import springBootRest.pojo.User;

public class UserService {
	
	private static User defaultUser = new User("001", "Jude");
	
	public static User getUser(String id) {
		if(defaultUser.getUserid().equals(id)) {
			return defaultUser;
		}
		return new User(id, "UNKNOWN");
	}
	
}
