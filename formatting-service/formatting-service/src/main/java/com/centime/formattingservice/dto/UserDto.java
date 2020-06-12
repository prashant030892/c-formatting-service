package com.centime.formattingservice.dto;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

	@JsonProperty(value = "Name")
	@NotEmpty
	private String name;

	@JsonProperty(value = "Surname")
	private String surname;

}
