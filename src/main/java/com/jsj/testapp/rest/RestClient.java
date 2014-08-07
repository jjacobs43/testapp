package com.jsj.testapp.rest;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class RestClient {
	private RestTemplate restTemplate;
    
    public RestClient(RestTemplate template) {
        this.restTemplate = template;
    }
    
    public ResponseEntity<String> getContents(String url) {
		final MultiValueMap<String, String> postParams = new LinkedMultiValueMap<String, String>();
		String attrib1[] = new String[]{"jjacobs43%40hotmail.com"};
		postParams.put("email", Arrays.asList(attrib1));
		String attrib2[] = new String[]{"Cougar94"};
		postParams.put("password", Arrays.asList(attrib2));
		String attrib3[] = new String[]{"http%3A%2F%2Fwww.fantasyguru.com%2Ffootball%2Fsubscribers%2Fftdb.php%3Fpage%3Dprojections"};
		postParams.put("redirect", Arrays.asList(attrib3));
		
		ResponseEntity<String> response = restTemplate.postForEntity(url, postParams, String.class); 
        
		return response;
    }

}
