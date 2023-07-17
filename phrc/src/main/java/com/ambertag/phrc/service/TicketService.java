package com.ambertag.phrc.service;

import java.util.List;

import com.ambertag.phrc.model.Ticketdetail;

public interface TicketService {

	Ticketdetail saveTicket(Ticketdetail ticketdetail);

	List<Ticketdetail> getAllTickets();

	Ticketdetail getTicketById(Long ticketId);

	List<Ticketdetail> getTicketWithStatus();


}
