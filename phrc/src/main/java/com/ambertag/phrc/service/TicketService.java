package com.ambertag.phrc.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ambertag.phrc.model.AdminAction;
import com.ambertag.phrc.model.Ticketdetail;

public interface TicketService {

	Ticketdetail saveTicket(Ticketdetail ticketdetail);

	List<Ticketdetail> getAllTickets();

	Ticketdetail getTicketById(Long ticketId);

	
	 List<Ticketdetail> getOpenTickets();

	Ticketdetail updateTicket(Long ticketId, Ticketdetail ticketdetail);
	 
	 
	
	 
	 
	 /*
	 * AdminAction updateTicket(Long ticketId, AdminAction action);
	 */

//	Object findById(Long ticketId);
//
//	Ticketdetail updateTicket(Ticketdetail existingTicket);

	
//	Ticketdetail findById(Long ticketId);
//	AdminAction updateTicket(Long ticketId, AdminAction action);

	

//	Object updateTicket(Long ticketId);
//
//	Object updateTicket(Long ticketId, Long seniorDoctorId, Long juniorDoctorId, Long selectedBedId, Long nurseId,
//			String commonAsset);

	

//	List<Ticketdetail> getTicketWithStatus(String status);

}
