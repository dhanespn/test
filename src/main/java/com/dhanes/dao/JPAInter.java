package com.dhanes.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.dhanes.entity.Jpa1Entity;

public interface JPAInter extends Repository<Jpa1Entity, Long>{
	List<Jpa1Entity> findAll();
}


