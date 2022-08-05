package com.Socios.socios.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Response.sociosResponse;


import Json.SociosJson;
import SociosService.sociosService;
import exeption.sociosExceptions;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "socios"+ "/v1")
public class sociosControll {
	
	@Autowired 
	private sociosService sociosService; 
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/socios", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public sociosResponse<List<SociosJson>> getSocios() throws sociosExceptions{		
		return new sociosResponse<>("Succes", String.valueOf(HttpStatus.OK), "OK", sociosService.getSocios());
	}
	
}
