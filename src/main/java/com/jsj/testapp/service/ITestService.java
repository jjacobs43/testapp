package com.jsj.testapp.service;

import org.springframework.http.ResponseEntity;

public interface ITestService {

	public ResponseEntity<String> getUrlContents(String url);
}
