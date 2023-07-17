package com.ambertag.phrc.controller;

import com.ambertag.phrc.model.Ticketdetail;
import com.ambertag.phrc.service.TicketNotFoundException;
import com.ambertag.phrc.service.TicketService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phrc/api/v1/main")
public class TicketController {

	@Autowired
	private TicketService ticketService;

//    public TicketController(TicketService ticketService) {
//        this.ticketService = ticketService;
//    }

	@PostMapping("/saveTicket")
	public ResponseEntity<Ticketdetail> saveTicket(@RequestBody Ticketdetail ticketdetail) {
		Ticketdetail savedTicket = ticketService.saveTicket(ticketdetail);
//    	 System.out.println(savedTicket);
		return new ResponseEntity<>(savedTicket, HttpStatus.CREATED);
	}

	@GetMapping("/getAllTickets")
	public List<Ticketdetail> getAllTickets() {
		return ticketService.getAllTickets();
	}

	@GetMapping("/getTicket/{ticketId}")
	public ResponseEntity<Ticketdetail> getTicketById(@PathVariable Long ticketId) {
//    	return new ResponseEntity<Ticketdetail>(ticketService.getTicketById(ticketId), HttpStatus.OK);
		try {
			Ticketdetail ticketdetail = ticketService.getTicketById(ticketId);
			return new ResponseEntity<Ticketdetail>(ticketdetail, HttpStatus.OK);
		} catch (TicketNotFoundException e) {
			// TODO: handle exception
			String errorMessage = "Invalid ticket ID " + ticketId;
			return new ResponseEntity(errorMessage, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/getTicketsWithStatus?status=Open")
	public List<Ticketdetail> getTicketWithStatus(){
		return ticketService.getTicketWithStatus();
	}
}
