package com.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Data
@Entity
@Table(name = "booking_service")
public class BookingService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Double price;

    private Date createdDate;

    private Time createdTime;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "services_id")
    private Services services;
}
