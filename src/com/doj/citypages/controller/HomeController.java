package com.doj.citypages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doj.citypages.utils.CPConstants;

@Controller
public class HomeController {
	
	@RequestMapping(value = CPConstants.ROOTPAGE)
	public String index(Model model) {
		return CPConstants.HOME;
	}
	
	/*@RequestMapping(value = CPConstants.ABOUTPAGE)
	public String aboutUs(Model model) {
		return CPConstants.ABOUT;
	}
*/
}