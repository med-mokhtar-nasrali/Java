package com.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojosandninjas.models.Dojo;

@Repository
public interface DojosRepository extends CrudRepository<Dojo,Long> {
	List<Dojo> findAll();
}
