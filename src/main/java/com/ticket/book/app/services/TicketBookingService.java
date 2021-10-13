package com.ticket.book.app.services;

import com.ticket.book.app.dao.TicketBookingDao;
import com.ticket.book.app.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TicketBookingService {
    @Autowired
    private TicketBookingDao ticketBookingDao;

    public Ticket createTicket(Ticket ticket) {
        return ticketBookingDao.save(ticket);
    }

    public Optional<Ticket> getTicket(Integer ticketId) {
        return ticketBookingDao.findById(ticketId);
    }

    public Iterable<Ticket> getAllTicket() {

        return ticketBookingDao.findAll();
    }

    public void removeTicket(Integer ticketId) {
        ticketBookingDao.deleteById(ticketId);
    }

    public Ticket updateEmail(Integer ticketId, String email) {
        Optional<Ticket> ticket = ticketBookingDao.findById(ticketId);
        ticket.ifPresent(ticket1 -> {
            ticket1.setEmail(email);
            System.out.println("email=====>>" + ticket.get().getEmail());
        });
        return ticketBookingDao.save(ticket.get());
    }
}
