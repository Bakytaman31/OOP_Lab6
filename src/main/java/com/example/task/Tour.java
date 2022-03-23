package com.example.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "tour_tasks")
@AllArgsConstructor
@NoArgsConstructor
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "tour_number")
    private int tourNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_type")
    private TypeOfTour tourType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country")
    private Country country;
    @Column(name = "start_date", columnDefinition = "data")
    private Date startDate;
    @Column(name = "end_date", columnDefinition = "data")
    private Date endDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="program_number", columnDefinition = "INTEGER")
    private TourProgram programNumber;

    @Column(name = "tour_name")
    private String tour_name;
    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
    private List<Events> eventsList;

    @OneToOne(mappedBy = "tour")
    private TourTasks tourTasks;

    @OneToOne(mappedBy = "tour")
    private Order orders;

    @OneToMany(mappedBy = "tour")
    private List<TourFlights> tourFlightsList;

    @OneToMany(mappedBy = "tour")
    private List<Hotel> hotelList;

    @OneToMany(mappedBy = "tour")
    private List<Contract> contractList;
}
