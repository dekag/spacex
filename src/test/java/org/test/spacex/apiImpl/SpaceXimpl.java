package org.test.spacex.apiImpl;

import org.junit.Assert;
import org.test.spacex.util.ApiUtil;


public class SpaceXimpl extends ApiUtil{
	
	public void performGetRequest(String path) {
		response = requestSpecification.get(path);	
	}

	public void validateReponse(String key, String value) {		
		Assert.assertEquals(response.jsonPath().get(key).toString(), value);		
	}

	public void validateReponseField(String path) {
		Assert.assertTrue(response.jsonPath().get(path) != null);		
	}	

}
