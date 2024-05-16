package com.challenge.client;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;



import com.challenge.model.Users;

public class ClientUser {

	
	public Users getUserById(Integer id) {
		return RestAssured
		.given().contentType(ContentType.JSON)
		.when().get("https://jsonplaceholder.typicode.com/users/" + id)
		.then().assertThat().statusCode(200).extract().as(Users.class);
	}
	
	public Users[] getAllUser(){
		return RestAssured
				.given().contentType(ContentType.JSON)
				.when().get("https://jsonplaceholder.typicode.com/users/")
				.then().assertThat().statusCode(200).extract().as(Users[].class);
	}
}
