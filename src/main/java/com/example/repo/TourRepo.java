package com.example.repo;

import com.example.task.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepo extends CrudRepository<Tour, Long> {

}
