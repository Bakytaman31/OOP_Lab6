package com.example.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "air_tickets_class")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClassOfAirTickets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private long id;
    @Column(name = "service_class")
    private String serviceClass;
    @OneToMany(mappedBy = "classOfService", fetch = FetchType.EAGER)
    private List<AirTicket> airTicketList;
}
