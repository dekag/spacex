package org.test.spacex.util;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiUtil {
	
	public static RequestSpecification requestSpecification;
	
	public static Response response;
	
	public void setBaseUri(String baseUri) {
		RestAssured.baseURI = baseUri;
		requestSpecification = RestAssured.given();
	}
	
	public void validateResponseCode(String code) {
		Assert.assertEquals(String.valueOf(response.getStatusCode()),code);		
	}	

}
