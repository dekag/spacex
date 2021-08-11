package org.test.spacex.stepDefs;

import org.test.spacex.apiImpl.SpaceXimpl;

import io.cucumber.java8.En;

public class SpaceXapiSpec implements En {

	SpaceXimpl spaceXimpl = new SpaceXimpl();

	public SpaceXapiSpec() {
		Given("user sets the base uri for the request as {string}", (String baseUri) -> {
			spaceXimpl.setBaseUri(baseUri);
		});
		When("user performs get request for {string}", (String path) -> {
			spaceXimpl.performGetRequest(path);
		});
		Then("validate the response code is {string}", (String code) -> {
			spaceXimpl.validateResponseCode(code);
		});

		Then("validate that {string} is set to {string} in the response", (String key, String value) -> {
			spaceXimpl.validateReponse(key,value);
		});
		
		Then("validate {string} value is not null", (String path) -> {
			spaceXimpl.validateReponseField(path);
		});

	}

}
