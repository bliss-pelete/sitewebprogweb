package fr.esiea.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.esiea.web.ManagePeople;
import fr.esiea.web.People;
import fr.esiea.web.PeopleDAO;


@Controller
public class MySiteController {
	
	 @Autowired
	 private PeopleDAO peopleDao;
	
	@RequestMapping("/mysite")
	public String mainpage(Model model ) {
		
		String my_list=null; 
		
		StringBuilder sb = new StringBuilder(); 
		ManagePeople manager = new ManagePeople(); 
		
		List<People> list = peopleDao.list();  
		
		for(People people : list) {
			
			sb.append(people.getName());
			sb.append("\n"); 
		}
		
		my_list= sb.toString(); 
		
		
		model.addAttribute("name",my_list); 
		
		return "mysite"; 
	}

}
