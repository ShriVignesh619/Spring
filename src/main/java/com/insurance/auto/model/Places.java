package com.insurance.auto.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Places {
	private String placename;
	private String longitude;
	private String state;
	private String stateAB;
	private String latitude;
	@JsonProperty("place name")
	public String getPlacename() {
		return placename;
	}
	public void setPlacename(String placename) {
		this.placename = placename;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@JsonProperty("state abbreviation")
	public String getStateAB() {
		return stateAB;
	}
	public void setStateAB(String stateAB) {
		this.stateAB = stateAB;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "Places [placename=" + placename + ", longitude=" + longitude + ", state=" + state + ", stateAB="
				+ stateAB + ", latitude=" + latitude + "]";
	}
}

