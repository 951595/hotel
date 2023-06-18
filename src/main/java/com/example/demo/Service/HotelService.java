package com.example.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Hotel;
import com.example.demo.Repository.HotelRepository;

@Service
public class HotelService {
	@Autowired
	private HotelRepository Hrepo;
	
	public Hotel saveHotel(Hotel ht) {
		return Hrepo.save(ht);
	}
	
	public List<Hotel> saveHotels(List<Hotel> ht){
		return Hrepo.saveAll(ht);
	}
	public List<Hotel> getHotels(){
		return Hrepo.findAll();
	}
	public Hotel getHotelById(int Id) {
		return Hrepo.findById(Id).orElse(null);
	}
	public Hotel updateHotel(Hotel ht) {
		Hotel h = Hrepo.findById(ht.getId()).orElse(null);
		h.setName(ht.getName());
		h.setCity(ht.getCity());
		h.setState(ht.getState());
		return Hrepo.save(h);
	}

}
