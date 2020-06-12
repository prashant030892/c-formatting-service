package com.centime.formattingservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centime.formattingservice.dto.UserDto;
import com.centime.formattingservice.services.FormattingService;

/**
 * Formatting controller has one API post method. It returns the formatted
 * response for the input received.
 * 
 * @author prkala
 *
 */
@RestController
@RequestMapping(value = "/v1/formatting")
public class FormattingController {

	@Autowired
	private FormattingService formattingService;

	@PostMapping
	public ResponseEntity<String> formatData(@RequestBody UserDto userDto) {
		return new ResponseEntity<String>(formattingService.formatData(userDto), HttpStatus.OK);

	}
}
