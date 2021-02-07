package com.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.demo.controller.base.CompanyBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/demo.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class CompanyController extends CompanyBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
