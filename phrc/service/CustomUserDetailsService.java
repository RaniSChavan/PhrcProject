package com.phrc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.phrc.model.User;
import com.phrc.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService{
    
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=repository.getUserByUsername (username);
		if(user==null) {	
		throw new UsernameNotFoundException("User Not Exits with name:"+username);
		}
		
		return new CustomUserDetails(user);
	}

}
