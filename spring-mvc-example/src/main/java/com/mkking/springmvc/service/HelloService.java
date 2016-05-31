package com.mkking.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService{
	
	private List<String> listFruits;
	
	private HelloService(){
		listFruits = new ArrayList<>();
		listFruits.add("Apple");
		listFruits.add("Banana");
		listFruits.add("Cherry");
	}

	public List<String> getListFruits() {
		return listFruits;
	}

}
