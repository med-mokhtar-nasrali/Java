package com.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojosandninjas.models.Dojo;
import com.dojosandninjas.repositories.DojosRepository;

@Service
public class DojoService {
	@Autowired
	DojosRepository dojoRepo;
	
	//Get all dojos
	public List<Dojo> getDojos(){
		return dojoRepo.findAll();	
		}
	
	//Create Dojo
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	

}
