package com.nagarro.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.nagarro.model.Order;
import com.nagarro.model.User;

@Service
public class UserService {


	private List<User> users = new ArrayList<>(
			Arrays.asList(new User(1, "Joe Bloggs", "Product A"), 
					new User(2, "Jane Doe", "Product B")));


	public List<User> getAllUsers() {
		return users;
	}
	

	public User getUser(int id) {
		 return users.stream().filter(u -> u.getId()==id).findFirst().get();
	}
//		for (int i = 0; i < users.size(); i++) {
//			User u = users.get(i);
//			if (u.getId() == id) {
//				Order order = restTemplate.getForObject("http://localhost:8083/ordersByCust/" + u.getId(), Order.class);
//				User k = new User(u.getId(), u.getName(), order.getName());
//				users_prod.add(k);
//			}
//		}
//		return users_prod;

	public void addUser(User user) {
		users.add(user);
	}

	public void updateUser(int id, User user) {
		for (int i = 0; i < users.size(); i++) {
			User u = users.get(i);
			if (u.getId() == id) {
				users.set(i, user);
				return;
			}
		}
	}

	public void deleteUser(int id) {
		users.removeIf(u -> u.getId() == id);
	}
}