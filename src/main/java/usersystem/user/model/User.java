package usersystem.user.model;

import javax.xml.bind.annotation.XmlRootElement;

/* Model Class for the User Instance */
@XmlRootElement
public class User {

	/* Declaring Member Variables */
	private long id;
	private String email;
	private String password;
	private String name;
	
	/* Empty constructor */
	public User() {
		
	}
	
	/* Constructor for creating new instances of the class */
	public User(long id, String email, String password, String name) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
	}
	
	/* Getters and Setters */
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
