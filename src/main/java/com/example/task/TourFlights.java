package com.example.task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tour_flight")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourFlights {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "flight_code")
    private int flightCode;
    @Column(name = "airline")
    private String airline;
    @Column(name = "departure_date")
    private Date departureDate;
    @Column(name = "departure_time")
    private Date departureTime;
    @Column(name = "city_of_arrival")
    private String cityOfArrival;
    @Column(name = "departure_city")
    private String departureCity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_id")
    private Tour tour;




}
