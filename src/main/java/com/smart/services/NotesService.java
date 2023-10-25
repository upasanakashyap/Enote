package com.smart.services;

import java.util.List;

import com.smart.enities.Notes;
import com.smart.enities.User;

public interface NotesService {
	
	public Notes saveNotes(Notes notes);
	
	public Notes getNotesById(int id);
	
	public List<Notes> getNotesByUser(User user);
	
	public Notes updateNotes (Notes notes);
	
	public boolean deleteNotes(int id);

}
