package com.example.repo;

import com.example.task.Events;
import org.springframework.data.repository.CrudRepository;

public interface EventsRepo extends CrudRepository<Events, Long> {
}
