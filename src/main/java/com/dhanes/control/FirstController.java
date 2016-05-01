package com.dhanes.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhanes.dao.JPAInter;
import com.dhanes.entity.Jpa1Entity;

@RestController
public class FirstController {
	@Autowired
	JPAInter jpaInter;
	
	@RequestMapping("/test")
	public List<Jpa1Entity> getJPAData(){
		return jpaInter.findAll();
	}
}
