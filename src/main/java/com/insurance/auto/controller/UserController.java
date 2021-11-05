package com.insurance.auto.controller;
import com.insurance.auto.repository.UserRepository;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.insurance.auto.model.User;
import com.insurance.auto.model.Zipext;
import com.insurance.auto.model.Places;
import java.util.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@CrossOrigin
	@PostMapping("/user")
	public User createUser(@Valid @RequestBody User user ) {
	
		User user1 = userRepository.save(user);
		return user;
		
	}
	
	@CrossOrigin
	@GetMapping("/users")
	public Page<User> listUsers(Pageable pageable)
	{
		return userRepository.findAll(pageable);
	}
	
	@CrossOrigin
	@GetMapping("/user/{id}")
	public User getByID(@PathVariable Long id )
	{
		User user =  userRepository.getOne(id);
		return user;
	}
	
	
	@CrossOrigin
	@GetMapping(value="/pinverify/{id}")
	public String[] getPin(@PathVariable("id") String id){
		RestTemplate resttemplate = new RestTemplate();
		Zipext zipext = resttemplate.getForObject("http://api.zippopotam.us/us/" + id, Zipext.class);
		String zipext2[] = new String[]{zipext.getPost_code(),zipext.getPlaces().get(0).getState()  ,zipext.getPlaces().get(0).getPlacename()};
		return zipext2;
	}
}
