package com.ambertag.phrc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ambertag.phrc.model.PhrcConstants.TicketStatus;
import com.ambertag.phrc.model.Ticketdetail;
import com.ambertag.phrc.model.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	private TicketRepository ticketRepository;

	public TicketServiceImpl(TicketRepository ticketRepository) {
//		super();
		this.ticketRepository = ticketRepository;
	}

	@Override
	public Ticketdetail saveTicket(Ticketdetail ticketdetail) {
		// TODO Auto-generated method stub
		return ticketRepository.save(ticketdetail);
	}

	@Override
	public List<Ticketdetail> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketRepository.findAll();
	}

	@Override
	public Ticketdetail getTicketById(Long ticketId) {
		Optional<Ticketdetail> ticketOptional = ticketRepository.findById(ticketId);
		if (ticketOptional.isPresent()) {
			return ticketOptional.get();
		} else {
			throw new TicketNotFoundException("Ticket not found for ID: " + ticketId);
		}
	}

	/*
	 * @Override public List<Ticketdetail> getTicketWithStatus() { // TODO
	 * Auto-generated method stub return
	 * ticketRepository.getTicketsWithStatus(TicketStatus.Open.name()); }
	 */
	/*
	 * @Override public List<Ticketdetail> getTicketWithStatus() { // TODO
	 * Auto-generated method stub
	 * 
	 * Optional<Ticketdetail> ticketOptional =
	 * ticketRepository.findByStatus(TicketStatus.Open.name()); if
	 * (ticketOptional.isPresent()) { return (List<Ticketdetail>)
	 * ticketOptional.get(); } else { throw new
	 * TicketNotFoundException("Ticket not found " + ticketStatus); }
	 * 
	 * return ticketRepository.getTicketsWithStatus(TicketStatus.Open.name()); }
	 */
	
	 public List<Ticketdetail> getTicketWithStatus() {
	        return ticketRepository.findByStatus("Open");
	    }
}