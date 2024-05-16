package com.challenge.service;

import java.util.Arrays;
import java.util.List;

import com.challenge.client.ClientPhotos;
import com.challenge.model.Photos;

public class ServicePhotos {

	private ClientPhotos clientPhotos;
	
	public Photos getPhotoById(Integer id) {
		clientPhotos = new ClientPhotos();
		return clientPhotos.getPhotoById(id);
	}
	
	public List<Photos> getAllPhotos() {
		clientPhotos = new ClientPhotos();
		return Arrays.asList(clientPhotos.getAllPhotos());
	}
	
}
