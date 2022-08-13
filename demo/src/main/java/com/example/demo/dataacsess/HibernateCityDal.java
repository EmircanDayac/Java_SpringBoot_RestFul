package com.example.demo.dataacsess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.City;

@Repository

public class HibernateCityDal implements ICityDal {

	   EntityManager _manager;
	    
	@Transactional
	@Override
	public List<City> Getall() {
	 

     Session _session = _manager.unwrap(Session.class); 
    	 List<City> cities = _session.createQuery("from City",City.class).getResultList();
    	 System.out.println(cities);
	
 
		return cities;
	}
@Autowired
	public HibernateCityDal(EntityManager _manager) {

		this._manager = _manager;
	}
@Transactional
	@Override
	public void add(City city) {
	 Session _session = _manager.unwrap(Session.class);
	 _session.saveOrUpdate(city);
		
	}
@Transactional
	@Override
	public void delete(City city) {
	 Session _session = _manager.unwrap(Session.class);
	 _session.delete(city);
		
		
	}
@Transactional
	@Override
	public void Update(City city) {
	 Session _session = _manager.unwrap(Session.class);
	 _session.saveOrUpdate(city);
		
		
	}
@Override
public City Getİd(int id) {
	   Session _session = _manager.unwrap(Session.class); 
	 City _city =   _session.get(City.class, id);
	return _city;
	
}

}
