package com.ticket.book.app.controller;

import com.ticket.book.app.entities.Ticket;
import com.ticket.book.app.services.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {

    @Autowired
    private TicketBookingService tService;

    @PostMapping(value = "/create")
    public Ticket createTicket(@RequestBody Ticket ticket){
        return tService.createTicket(ticket);
    }

    @GetMapping(value = "/ticket/{ticketId}")
    public Optional<Ticket> getTicketId(@PathVariable("ticketId") Integer ticketId){
       return tService.getTicket(ticketId);

    }

    @GetMapping(value = "/ticket/alltickets")
    public Iterable<Ticket> getAllBookedTickets(){
        return tService.getAllTicket();
    }

    @DeleteMapping(value = "/ticket/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId") Integer ticketId){
        tService.removeTicket(ticketId);
    }

    @PutMapping(value = "/ticket/{ticketId}/{email:.+}")
    public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId , @PathVariable("email") String email){
       return tService.updateEmail(ticketId , email);
    }
}
