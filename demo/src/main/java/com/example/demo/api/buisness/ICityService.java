package com.example.demo.api.buisness;

import java.util.List;

import com.example.demo.entities.City;

public interface ICityService {
	List<City> Getall();
	void add(City city);
	void delete(City city);
	void Update(City city);
	City Getİd(int id);
}
