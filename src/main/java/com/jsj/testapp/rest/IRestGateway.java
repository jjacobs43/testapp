package com.jsj.testapp.rest;

import org.springframework.http.ResponseEntity;

public interface IRestGateway {

	public ResponseEntity<String> getContents(String url);

}
