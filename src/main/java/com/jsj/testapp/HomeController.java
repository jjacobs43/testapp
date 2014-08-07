package com.jsj.testapp;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jsj.testapp.service.ITestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private static final String POST_URL = "http://www.fantasyguru.com/football/subscribers/ftdb.php?page=projections&position=WR&sid=36515&tag=&week=0&print=N";
	
	@Autowired
	ITestService testService; 

	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("home page");
		
		model.addAttribute("url",POST_URL);
		model.addAttribute("contents","");
		
		return "home";
	}
	
	@RequestMapping(value = "/postUrl", method = RequestMethod.POST)
	public String getContents(Locale locale, Model model) {
		logger.info("getContents");
		
		ResponseEntity<String> response = testService.getUrlContents(POST_URL);
		
		String status = response.getStatusCode().toString();
		String contents = response.getBody();
		
		model.addAttribute("url",POST_URL);
		model.addAttribute("status",status);
		model.addAttribute("contents",contents);
		
		return "home";
	}
	
	
}
