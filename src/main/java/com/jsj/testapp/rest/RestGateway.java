package com.jsj.testapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.jsj.testapp.rest.IRestGateway;

public class RestGateway implements IRestGateway {
	
	@Autowired
    private RestClient restClient;
	
	public ResponseEntity<String> getContents(String url) {
		return restClient.getContents(url);
	}

	/**
	 * @return the restClient
	 */
	public RestClient getRestClient() {
		return restClient;
	}

	/**
	 * @param restClient the restClient to set
	 */
	public void setRestClient(RestClient restClient) {
		this.restClient = restClient;
	}

}
