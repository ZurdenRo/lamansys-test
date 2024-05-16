package com.challenge.service;

import java.util.Arrays;
import java.util.List;

import com.challenge.client.ClientUser;
import com.challenge.model.Users;

public class ServiceUsers {

	private ClientUser clientUser;
	
	public Users getUserById(Integer id) {
		clientUser = new ClientUser();
		return clientUser.getUserById(id);
	}
	
	public List<Users> getAllUsers() {
		clientUser = new ClientUser();
		return Arrays.asList(clientUser.getAllUser());
	}
	
}
