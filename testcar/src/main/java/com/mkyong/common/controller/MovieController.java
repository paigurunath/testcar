package com.mkyong.common.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

@RestController
@RequestMapping("/carpool")
public class MovieController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {

		model.addAttribute("movie", name);
		return "list";

	}

	@RequestMapping(value="/userDetails", method=RequestMethod.POST )
	public String indexDbQueryData(@RequestBody JsonNode jsonNode ) {
		try {
			System.out.println(jsonNode);

			return "Database data indexed successfully to searchly";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "FAIL";
	}
	
	
}