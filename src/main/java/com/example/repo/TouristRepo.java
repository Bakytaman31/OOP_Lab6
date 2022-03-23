package com.example.repo;

import com.example.task.Tourist;
import org.springframework.data.repository.CrudRepository;

public interface TouristRepo extends CrudRepository<Tourist, Long> {

}
