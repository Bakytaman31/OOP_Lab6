package com.example.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hotel_class")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private long id;
    @Column(name = "hotel_class")
    private String hotel_class;
    @OneToMany(mappedBy = "hotelClass")
    private List<Hotel> hotelList;
}
