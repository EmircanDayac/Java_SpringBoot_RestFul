package com.example.demo.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.*;
import com.example.demo.api.buisness.ICityService;

@Component
@RestController
@RequestMapping("/api")
public class CityController {

	
	private ICityService _service;

	@Autowired
	public CityController(ICityService _service) {
	
		this._service = _service;
	}
	
	@GetMapping("/cities")
	public List<City> get(){
		return this._service.Getall();
		
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city){
		_service.delete(city);
		
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City city){
		_service.Update(city);
		
	}
	
	@PostMapping("/add")
	public void add(@RequestBody City city){
		_service.add(city);
		
	}
	
	
	@GetMapping("/cities/{id}")
	public City getid(@PathVariable int id){
		return _service.Getİd(id);
		
	}
	
	
	
	
	
}
