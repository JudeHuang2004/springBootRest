package springBootRest.pojo;

import java.io.Serializable;


public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 464340820928306653L;
	
	private String userid;
	private String username;
	
	public User(String userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
//	@Override
//    public String toString() {
//        return "{\"userid\":\"" + userid + "\",\"username\":\"" + username + "\"}";
//        return "{'userid':'" + userid + "','username':'" + username + "'}";
//    }
	
}
