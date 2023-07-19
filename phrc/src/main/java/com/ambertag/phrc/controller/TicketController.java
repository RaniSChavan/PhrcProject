package com.ambertag.phrc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ambertag.phrc.model.AdminAction;
import com.ambertag.phrc.model.PhrcConstants.TicketStatus;
import com.ambertag.phrc.model.Ticketdetail;
import com.ambertag.phrc.service.TicketNotFoundException;
import com.ambertag.phrc.service.TicketService;

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
		ticketdetail.setTicketStatus(TicketStatus.Open.name());
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

//	@GetMapping("/getTicketsWithStatus")
//    public List<Ticketdetail> getTicketWithStatus(@RequestParam(value = "status") String status) {
//        return ticketService.getTicketWithStatus(status);
//    }

	@GetMapping("/getOpenTickets")
	public List<Ticketdetail> getOpenTickets() {
		return ticketService.getOpenTickets();
	}

//	@PutMapping("update/{ticketId}")
//    public ResponseEntity<AdminAction> updateTicket(@PathVariable("ticketId") Long ticketId, @RequestBody AdminAction action) {
//        try {
//            Ticketdetail ticketDetail = ticketService.findById(ticketId).orElseThrow(()-> new TicketNotFoundException("Ticket Not Found"));
//            
//            if (ticketDetail.getTicketStatus().equals(TicketStatus.Open.name())) {
//                AdminAction updatedAction = ticketService.updateTicket(ticketId, action);
//                return new ResponseEntity<>(updatedAction, HttpStatus.OK);
//            } else {
//                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//            }
//        } catch (TicketNotFoundException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }

	/*
	 * @PutMapping("update/{ticketId}") public ResponseEntity<AdminAction>
	 * updateTicket(@PathVariable("ticketId") Long ticketId, @RequestBody
	 * AdminAction action){ try { AdminAction
	 * updatedAction=ticketService.updateTicket(ticketId, action); return new
	 * ResponseEntity<AdminAction>(updatedAction, HttpStatus.OK);
	 * }catch(TicketNotFoundException e) { return new
	 * ResponseEntity<AdminAction>(HttpStatus.NOT_FOUND); } }
	 */

	@PutMapping("update/{ticketId}")
	public ResponseEntity<Ticketdetail> updateTicket(@PathVariable("ticketId") Long ticketId,
			@RequestBody Ticketdetail ticketdetail) {

		return new ResponseEntity<Ticketdetail>(ticketService.updateTicket(ticketId, ticketdetail), HttpStatus.OK);

//	    Ticketdetail existingTicket = ticketService.findById(ticketId)
//	            .orElseThrow(() -> new TicketNotFoundException("Ticket Not Found"));

		/*
		 * // Check ticket status if
		 * (existingTicket.getTicketStatus().equals(TicketStatus.Open.name())) { //
		 * Update the ticket details
		 * existingTicket.setSeniorDoctor(ticketdetail.getSeniorDoctor());
		 * existingTicket.setJuniorDoctor(ticketdetail.getJuniorDoctor());
		 * existingTicket.setSelectBed(ticketdetail.getSelectBed());
		 * existingTicket.setNurse(ticketdetail.getNurse());
		 * existingTicket.setCommonAsset(ticketdetail.getCommonAsset());
		 * 
		 * // Save the updated ticket Ticketdetail updatedTicket =
		 * ticketService.updateTicket(existingTicket);
		 * 
		 * return new ResponseEntity<>(updatedTicket, HttpStatus.OK); } else { // Handle
		 * the case when the ticket status is not 'Open' return new
		 * ResponseEntity<>(HttpStatus.BAD_REQUEST); } }
		 */
	}
}
