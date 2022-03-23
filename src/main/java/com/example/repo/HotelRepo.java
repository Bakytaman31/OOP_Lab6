package com.example.repo;

import com.example.task.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepo extends CrudRepository<Hotel, Long> {


}
