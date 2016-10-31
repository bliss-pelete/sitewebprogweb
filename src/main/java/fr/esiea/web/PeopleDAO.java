package fr.esiea.web;

import java.util.List;

public interface PeopleDAO {

	
	 public List<People> list();
     
	    public People get(int id);
	     
	    public void saveOrUpdate(People people);
	     
	    public void delete(int id);
}
