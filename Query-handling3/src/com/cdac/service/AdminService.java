package com.cdac.service;

import java.util.ArrayList;

import com.cdac.model.Faculty;
import com.cdac.model.NontechnicalQuery;
import com.cdac.model.User;
 

public interface AdminService {
	boolean registerStudent(User user);
	boolean registerFaculty(User user);
	ArrayList<NontechnicalQuery> getQueries();
	ArrayList<NontechnicalQuery> getQueries2();
	boolean updateStatus(int id);
	ArrayList<Faculty> getFaculty();
	boolean removeFaculty(int faculty_id);
}
