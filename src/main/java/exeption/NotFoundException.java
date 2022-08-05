package exeption;

import java.util.Arrays;

import org.springframework.http.HttpStatus;

import ErrorDtos.ErrorDto;


public class NotFoundException extends sociosExceptions{

	private static final long serialVersionUID = 1L;

	public NotFoundException(String code, String message) {
		super(code, HttpStatus.NOT_FOUND.value(), message);
	}

	public NotFoundException(String code, String message, ErrorDto data) {
		super(code, HttpStatus.NOT_FOUND.value() , message, Arrays.asList(data));
	}
}
