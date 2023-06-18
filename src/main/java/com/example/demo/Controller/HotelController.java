package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Hotel;
import com.example.demo.Service.HotelService;

@RestController
public class HotelController {
	@Autowired
	private HotelService service;
	@PostMapping("/ah")
	public Hotel addHotel(@RequestBody Hotel ht) {
		return service.saveHotel(ht);
		
	}
	@PostMapping("/ahs")
	public List<Hotel> addHotels(@RequestBody List<Hotel> ht){
		return service.saveHotels(ht);
	}
	@GetMapping("/gh")
	public  List<Hotel> getHotels(){
		return service.getHotels();
	}
	@GetMapping("/gh/{Id}")
	public Hotel getHotelById(@PathVariable int Id) {
		return service.getHotelById(Id);
	}
	@PutMapping("/update")
	public Hotel updateHotel(@RequestBody Hotel ht) {
		return service.updateHotel(ht);
	}
	

}
