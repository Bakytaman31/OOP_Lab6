package com.example.repo;

import com.example.task.AirTicket;
import org.springframework.data.repository.CrudRepository;

public interface AirTicketRepo extends CrudRepository<AirTicket, Long> {
}
