package com.jsj.testapp.service;

import org.springframework.http.ResponseEntity;

import com.jsj.testapp.rest.RestGateway;

public class TestService implements ITestService {
	
	private RestGateway restGateway;


	@Override
	public ResponseEntity<String> getUrlContents(String url) {
		return restGateway.getContents(url);
	}


	/**
	 * @return the restGateway
	 */
	public RestGateway getRestGateway() {
		return restGateway;
	}


	/**
	 * @param restGateway the restGateway to set
	 */
	public void setRestGateway(RestGateway restGateway) {
		this.restGateway = restGateway;
	}

}
