package com.smart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.enities.Notes;
import com.smart.enities.User;

public interface NotesRepository extends JpaRepository<Notes, Integer> {
	
	public  List<Notes> findByUser(User user);
	

}
