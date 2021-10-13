package com.ticket.book.app;

import com.ticket.book.app.entities.Ticket;
import com.ticket.book.app.services.TicketBookingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

@SpringBootApplication
public class TicketBookingManagementApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagementApp.class, args);
        TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);

        Ticket ticket = new Ticket();
        ticket.setBookingDate(new Date());
        ticket.setSourceStation("DDU");
        ticket.setDestStation("SBC");
        ticket.setPassengerName("AA");
        ticket.setEmail("aa@aa.com");
        ticketBookingService.createTicket(ticket);
    }

}
