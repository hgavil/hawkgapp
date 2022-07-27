package com.example.main;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UnitRepository extends PagingAndSortingRepository<Unit, Long> {

}
