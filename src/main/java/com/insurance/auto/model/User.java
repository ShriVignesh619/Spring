package com.insurance.auto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="personal2") 
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class User {
	@Id
	@Column(name="appId",nullable=false)
	@SequenceGenerator(name="user_Seq",sequenceName="appId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator ="user_seq")

	private long appId;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="address")
	private String address;
	
	@Column(name="zipcode")
	private String zipcode;
	
	@Column(name="dob")
	private String dob;
	
}
