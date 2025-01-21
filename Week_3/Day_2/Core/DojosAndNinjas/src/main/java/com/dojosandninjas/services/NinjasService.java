package com.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojosandninjas.models.Ninjas;
import com.dojosandninjas.repositories.NinjasRepository;

@Service
public class NinjasService {

	@Autowired
	NinjasRepository ninjasRepo;

	//Get all ninjas
	public List<Ninjas> getNinjas(){
		return ninjasRepo.findAll();	
		}
	
	//Create Ninja
	public Ninjas createNinja(Ninjas ninja) {
		return ninjasRepo.save(ninja);
	}

}
