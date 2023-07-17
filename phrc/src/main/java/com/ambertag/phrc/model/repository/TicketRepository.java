package com.ambertag.phrc.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ambertag.phrc.model.Ticketdetail;

public interface TicketRepository extends JpaRepository<Ticketdetail, Long> {

	@Query("SELECT ts FROM Ticketdetail ts WHERE ts.ticketStatus = :ticketStatus ORDER BY ts.ticketId")
	List<Ticketdetail> findByStatus(@Param("ticketStatus") String ticketStatus);


}
