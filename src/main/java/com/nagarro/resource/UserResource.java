package com.nagarro.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nagarro.model.Order;
import com.nagarro.model.User;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserResource{
	
	@Autowired
	private UserService userService;
    
	@RequestMapping(method=RequestMethod.GET, value="/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    
	@RequestMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUser(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/users")
	public void addOrder(@RequestBody User user) {
		userService.addUser(user);
	}
    
    @RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable int id) {
		userService.updateUser(id, user);
	}
    
    @RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
}