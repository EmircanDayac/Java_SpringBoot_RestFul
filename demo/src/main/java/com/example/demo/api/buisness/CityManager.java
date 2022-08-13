package com.example.demo.api.buisness;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dataacsess.ICityDal;
import com.example.demo.entities.City;

@Service
public class CityManager implements ICityService {

	ICityDal _citydal;
	@Autowired
	public CityManager(ICityDal _city) {
	
		this._citydal = _city;
	}

	@Transactional
	@Override
	public List<City> Getall() {
		// TODO Auto-generated method stub
		return this._citydal.Getall();
	}
	@Transactional
	@Override
	public void add(City city) {
		this._citydal.add(city);
		
	}
	@Transactional
	@Override
	public void delete(City city) {
		this._citydal.delete(city);
		
	}
	@Transactional
	@Override
	public void Update(City city) {
		this._citydal.Update(city);
		
	}

	@Override
	public City Getİd(int id) {
		return 	this._citydal.Getİd(id)	;
	}

}
