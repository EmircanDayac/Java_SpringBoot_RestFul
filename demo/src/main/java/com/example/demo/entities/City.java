package com.example.demo.entities;
import javax.persistence.*;
@Entity
@Table(name = "City")
public class City {
@Id
@Column(name = "ID")
	public int id;
@Column(name = "Name")
	public String Name;
@Column(name = "CountryCode")
	public String CountryCode;
@Column(name = "Info")
	public String Info;
@Column(name = "District")
	public String District;
	public City(int id, String name, String countryCode, String info, String district) {
		
		this.id = id;
		Name = name;
		CountryCode = countryCode;
		Info = info;
		District = district;
	}
	
	public City(){};
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getInfo() {
		return Info;
	}
	public void setInfo(String info) {
		Info = info;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	
	
	
}
