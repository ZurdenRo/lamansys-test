package com.challenge.rest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.challenge.model.Photos;
import com.challenge.model.Users;
import com.challenge.service.ServicePhotos;
import com.challenge.service.ServiceUsers;

public class TestServices {

	ServiceUsers serviceUsers;
	ServicePhotos servicePhotos;
	
	Photos photos;
	Users users;
	
	@Test(groups = "user")
	public void testUser() {
		serviceUsers = new ServiceUsers();
		users = serviceUsers.getUserById(1);
		Assert.assertEquals(users.getEmail(), "Sincere@april.biz");
	}
	
	@Test(groups = "userAll")
	public void testUserAll() {
		serviceUsers = new ServiceUsers();
		List<Users> ls = serviceUsers.getAllUsers();
		Assert.assertNotEquals(ls.size(), 0);
	}
	
	@Test(groups = "photo")
	public void testPhotos() {
		servicePhotos = new ServicePhotos();
		photos = servicePhotos.getPhotoById(1);
		Assert.assertEquals(photos.getTitle(), "accusamus beatae ad facilis cum similique qui sunt");
	}
	
	@Test(groups = "photoAll")
	public void testAllPhoto() {
		servicePhotos = new ServicePhotos();
		List<Photos> ls = servicePhotos.getAllPhotos();
		Assert.assertNotEquals(ls.size(), 0);
	}
	
	
}
