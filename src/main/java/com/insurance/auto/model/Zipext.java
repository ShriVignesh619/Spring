package com.insurance.auto.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Zipext {
	private String post_code;
	private String country;
	private String CountryAB;
	private List<Places> places;
	@JsonProperty("post code")
	public String getPost_code() {
		return post_code;
	}
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@JsonProperty("country abbreviation")
	public String getCountryAB() {
		return CountryAB;
	}
	public void setCountryAB(String countryAB) {
		CountryAB = countryAB;
	}
	public List<Places> getPlaces() {
		return places;
	}
	public void setPlaces(List<Places> places) {
		this.places = places;
	}
	@Override
	public String toString() {
		return "Zipext [post_code=" + post_code + ", country=" + country + ", CountryAB=" + CountryAB + ", places="
				+ places + "]";
	}
}
