package com.ticket.book.app.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ticket_id")
    private Integer ticketId;

    @Column(name = "passenger_name", nullable = false)
    private String passengerName;

    @Column(name = "booking_date")
    private Date bookingDate;

    @Column(name = "source_station")
    private String sourceStation;

    @Column(name = "dest_station")
    private String destStation;

    @Column(name = "email")
    private String email;

}
