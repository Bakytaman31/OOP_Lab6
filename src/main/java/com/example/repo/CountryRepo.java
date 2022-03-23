package com.example.repo;

import com.example.task.Contract;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepo extends CrudRepository<Contract, Long> {

}
