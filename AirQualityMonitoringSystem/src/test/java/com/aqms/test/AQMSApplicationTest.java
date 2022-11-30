package com.aqms.test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;


public class AQMSApplicationTest {
  
	@Test
	public void getAllTest() {
		
		given()
			.baseUri("http://localhost:8080").
		when()
			.get("/all").
		then()
			.statusCode(200);
	}
	
	@Test
	public void getOneGasData() {
		
		given()
			.baseUri("http://localhost:8080").
		when()
			.get("/all/1").
		then()
			.statusCode(200);
	}
	
	@Test
	public void addGasData() {
		
		File file = new File("PostDataTestFile.json");
		
			given()
			.baseUri("http://localhost:8080")
			.contentType(ContentType.JSON)
			.body(file).
		when()
			.post("/all").
		then()
			.statusCode(200);
	}
	
	@Test
	public void updateGasData() {
		
		File file = new File("PutDataTestFile.json");
		
			given()
			.baseUri("http://localhost:8080")
			.contentType(ContentType.JSON)
			.body(file).
		when()
			.put("/all/1").
		then()
			.statusCode(200);
	}
	
	@Test
	public void deleteGasData() {
	
				given()
				.baseUri("http://localhost:8080").
			when()
				.delete("/all/4").
			then()
				.statusCode(200);
	}
	
	
}



















