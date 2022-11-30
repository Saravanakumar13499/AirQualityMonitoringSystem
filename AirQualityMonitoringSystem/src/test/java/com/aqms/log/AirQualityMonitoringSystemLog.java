package com.aqms.log;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class AirQualityMonitoringSystemLog {
  
  @Test
  public void getAllLog() {
	  given()
		.baseUri("http://localhost:8080").
	when()
		.get("/all").
	then()
		.log().all();
  }
  
  @Test
  public void getHeadersLog() {
	  given()
		.baseUri("http://localhost:8080").
	when()
		.get("/all").
	then()
		.log().headers();
  }
  
  
  @Test
  public void getBodyLog() {
	  given()
		.baseUri("http://localhost:8080").
	when()
		.get("/all").
	then()
		.log().body();
  }
  
  @Test
  public void getCookiesLog() {
	  given()
		.baseUri("http://localhost:8080").
	when()
		.get("/all").
	then()
		.log().cookies();
  }
  
  @Test
  public void logIfError() {
	  given()
		.baseUri("http://localhost:8080").
	when()
		.get("/all").
	then()
		.log().ifError();
  }
  
  @Test
  public void logIfValidationFails() {
	  given()
		.baseUri("http://localhost:8080").
	when()
		.get("/all").
	then()
		.log().ifValidationFails()
		.statusCode(200);
  }
  
}



















