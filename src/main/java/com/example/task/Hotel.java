package com.example.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "hotel")
@Data@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="city", columnDefinition = "varchar(20)")
    private String city;
    @Column(name="name", columnDefinition = "varchar(20)")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_class")
    private HotelClass hotelClass;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_id")
    private Tour tour;




}
