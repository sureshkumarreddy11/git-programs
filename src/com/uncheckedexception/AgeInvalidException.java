package com.uncheckedexception;

public class AgeInvalidException extends RuntimeException {
private String message;
public AgeInvalidException(String message) {
	this.message = message;

}
public String getmessage() {
	return message;
}
}
