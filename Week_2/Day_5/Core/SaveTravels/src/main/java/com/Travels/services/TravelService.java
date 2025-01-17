package com.Travels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Travels.models.Travel;
import com.Travels.repositories.TravelRepo;

@Service
public class TravelService {
	@Autowired
	TravelRepo travelRepo;
	
	public List<Travel> AllTravels(){
		return travelRepo.findAll();
	}
	
	
	
	public Travel getOneTravel(long id) {
		Optional<Travel> travel=travelRepo.findById(id);
		if(travel.isEmpty()) {
			return null;
		}
		return travel.get();
	}
	
	public Travel updateTravel(Long id,Travel newTravel) {
		newTravel.setId(id);
		return travelRepo.save(newTravel);
	}
	
	public Travel createTravel(Travel travel) {
		return travelRepo.save(travel);
	}
	
	
	
	public void delete(Long id) {
		travelRepo.deleteById(id);
	}
}
