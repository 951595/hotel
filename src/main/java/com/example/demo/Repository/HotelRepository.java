package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Hotel;
@Repository
public interface HotelRepository  extends JpaRepository<Hotel, Integer>{

	//Hotel findById(Id);

}