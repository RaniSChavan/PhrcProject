package com.ambertag.phrc.service;

public class TicketNotFoundException extends RuntimeException {
 public TicketNotFoundException(String message) {
	 super(message);
 }
}
