package usersystem.user.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import usersystem.user.model.User;
import usersystem.user.service.UserService;

/* Annotate class with @Path annotation to map to /users */
@Path("/users")

/* Specifies accepted and returned format */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

/* Class that handles users */
public class UserResource {
	
	/* Create new instance of UserService */
	UserService userService = new UserService();
	
	/* Maps GET to Java Method 
	 * Returns all users
	 */
	@GET
	public List<User> getUser() {
		return userService.getAllUsers();
	}
	
	/* Maps POST to Java Method 
	 * Returns the newly added user
	 */
	@POST
	public User addUser(User user) {	
		return userService.addUser(user);
	}
	
	/* Maps PUT to Java Method 
	 * Returns a specific user with the updated data
	 */
	@PUT
	@Path("/{userId}")
	public User updateUser(@PathParam("userId") long id, User user) {
		user.setId(id);
		return userService.updateUser(user);
	}
	
	/* Maps DELETE to Java Method 
	 * Returns nothing (void) and removes user with specified id
	 */
	@DELETE
	@Path("/{userId}")
	public void deleteUser(@PathParam("userId") long id) {
		userService.removeUser(id);
	}
	
	/* Maps GET to Java Method 
	 * Returns a specific user (id)
	 */
	@GET
	@Path("/{userId}")
	public User getUser(@PathParam("userId") long id) {
		return userService.getUser(id);
	}
	
	/* Maps GET to Java Method 
	 * Generates JSON from Java Object
	 * Returns the users email
	 */
	@GET
	@Path("/{userId}/email")
	public String getEmail(@PathParam("userId") long id) {
		User user = userService.getUser(id);
		Gson gson = new Gson();
		return gson.toJson(user.getEmail());
	}
	
	/* Maps GET to Java Method 
	 * Generates JSON from Java Object
	 * Returns the users password
	 */
	@GET
	@Path("/{userId}/password")
	public String getPassword(@PathParam("userId") long id) {
		User user = userService.getUser(id);
		Gson gson = new Gson();
		return gson.toJson(user.getPassword());
	}
	
	/* Maps GET to Java Method 
	 * Generates JSON from Java Object
	 * Returns the users name
	 */
	@GET
	@Path("/{userId}/name")
	public String getName(@PathParam("userId") long id) {
		User user = userService.getUser(id);
		Gson gson = new Gson();
		return gson.toJson(user.getName());
	}
	
}
