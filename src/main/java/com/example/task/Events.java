package com.example.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "events")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "city")
    private String city;
    @Column(name = "place")
    private String place;
    @Column(name = "start_time", columnDefinition = "DATE")
    private Date startTime;
    @Column(name = "event_name")
    private String eventName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_id")
    private Tour tour;
    @OneToMany(mappedBy = "events")
    private List<EventTickets> eventTicketsList;

}
