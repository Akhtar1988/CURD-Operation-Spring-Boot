package com.ticket.book.app.dao;

import com.ticket.book.app.entities.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket,Integer> {
}
