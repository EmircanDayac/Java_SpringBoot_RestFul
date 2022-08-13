package com.example.demo.dataacsess;
import java.util.List;
import com.example.demo.entities.*;

public interface ICityDal {

	List<City> Getall();
	void add(City city);
	void delete(City city);
	void Update(City city);
	City Getİd(int id);
	
	
}
