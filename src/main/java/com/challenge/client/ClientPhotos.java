package com.challenge.client;

import com.challenge.model.Photos;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ClientPhotos {


	public Photos getPhotoById(Integer id) {
		return RestAssured
		.given().contentType(ContentType.JSON)
		.when().get("https://jsonplaceholder.typicode.com/photos/" + id)
		.then().assertThat().statusCode(200).extract().as(Photos.class);
	}
	
	public Photos[] getAllPhotos(){
		return RestAssured
				.given().contentType(ContentType.JSON)
				.when().get("https://jsonplaceholder.typicode.com/photos/")
				.then().assertThat().statusCode(200).extract().as(Photos[].class);
	}
	
}
