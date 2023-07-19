package com.ambertag.phrc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ambertag.phrc.model.AdminAction;
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

	@Override
	public List<Ticketdetail> getOpenTickets() {
		// TODO Auto-generated method stub
		return ticketRepository.getTicketsWithStatus(TicketStatus.Open.name());
	}

	public Ticketdetail getTicketDetail(Long ticketId) {
		return ticketRepository.findById(ticketId).orElseThrow(() -> new TicketNotFoundException("Ticket Not Found"));
	}

	@Override
	public Ticketdetail updateTicket(Long ticketId, Ticketdetail ticketdetail) {
		// TODO Auto-generated method stub
		Ticketdetail existigTicketdetail = ticketRepository.findById(ticketId)
				.orElseThrow(() -> new TicketNotFoundException("Ticket Not Found"));
		if (existigTicketdetail.getTicketStatus().equals(TicketStatus.Open.name())) {
			existigTicketdetail.setSeniorDoctor(ticketdetail.getSeniorDoctor());
			existigTicketdetail.setJuniorDoctor(ticketdetail.getJuniorDoctor());
			existigTicketdetail.setNurse(ticketdetail.getNurse());
			existigTicketdetail.setSelectBed(ticketdetail.getSelectBed());
			existigTicketdetail.setCommonAsset(ticketdetail.getCommonAsset());
			ticketRepository.save(existigTicketdetail);

			return existigTicketdetail;
		} else {
			// Handle the case when the ticket status is not 'Open'
			throw new TicketNotFoundException("Cannot update a closed ticket.");
		}
	}

	/*
	 * @Override public AdminAction updateTicket(Long ticketId, AdminAction action)
	 * { // TODO Auto-generated method stub
	 * 
	 * Ticketdetail
	 * ticketdetail=ticketRepository.findById(ticketId).orElseThrow(()-> new
	 * TicketNotFoundException("Ticket Not Found"));
	 * if(ticketdetail.getTicketStatus().equals(TicketStatus.Open.name())) {
	 * ((AdminAction) ticketdetail).setSeniorDoctor(action.getSeniorDoctor());
	 * ((AdminAction) ticketdetail).setJuniorDoctor(action.getJuniorDoctor());
	 * ((AdminAction) ticketdetail).setSelectBed(action.getSelectBed());
	 * ((AdminAction) ticketdetail).setNurse(action.getNurse()); ((AdminAction)
	 * ticketdetail).setCommonAsset(action.getCommonAsset());
	 * 
	 * Ticketdetail updaTicketdetail=ticketRepository.save(ticketdetail);
	 * 
	 * AdminAction updatedAction= new AdminAction(updaTicketdetail); return
	 * updatedAction; }else { throw new
	 * IllegalArgumentException("Cannot update a closed ticket."); } }
	 */

//	    public AdminAction updateTicket(Long ticketId, AdminAction action) {
//	        AdminAction ticketDetail = (AdminAction) getTicketDetail(ticketId);
//	        
//	        // Perform the necessary updates to the ticket details
//	        // based on the provided AdminAction
//	        
//	        // Example:
//	        ticketDetail.setSeniorDoctor(action.getSeniorDoctor());
//	        ticketDetail.setJuniorDoctor(action.getJuniorDoctor());
//	        ticketDetail.setSelectBed(action.getSelectBed());
//	        ticketDetail.setNurse(action.getNurse());
//	        ticketDetail.setCommonAsset(action.getCommonAsset());
//	        
//	        // Save the updated ticket detail
//	        ticketRepository.save(ticketDetail);
//	        
//	        return action;
//	    }

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
	/*
	 * @Override public List<Ticketdetail> getTicketWithStatus(String status) { try
	 * { TicketStatus ticketStatus = TicketStatus.valueOf(status); return
	 * ticketRepository.findByStatus(ticketStatus); } catch
	 * (IllegalArgumentException e) { throw new
	 * IllegalArgumentException("Invalid status"); } }
	 */
}