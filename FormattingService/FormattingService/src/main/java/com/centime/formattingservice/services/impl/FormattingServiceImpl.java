package com.centime.formattingservice.services.impl;

import org.springframework.stereotype.Service;

import com.centime.formattingservice.dto.UserDto;
import com.centime.formattingservice.services.FormattingService;

import lombok.extern.slf4j.Slf4j;

/**
 * The formatting service concatenates the name and surname and returns the
 * response to the user.
 * 
 * @author prkala
 *
 */
@Service
@Slf4j
public class FormattingServiceImpl implements FormattingService {

	@Override
	public String formatData(UserDto userDto) {
		log.debug("Formatting service called. It will concatenate the name and surname");
		return new StringBuilder(userDto.getName()).append(" ").append(userDto.getSurname()).toString();
	}
}
