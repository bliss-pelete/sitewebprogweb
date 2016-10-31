package fr.esiea.web;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 








import org.hibernate.Criteria;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.esiea.web.People;

@Repository
public class ManagePeople implements PeopleDAO{

	@Autowired
	private static SessionFactory factory; 

	public ManagePeople() {

	}
	public ManagePeople(SessionFactory sessionFactory) {
		this.factory = sessionFactory; 
	}

	@Transactional
	public List<People> list() {
		
		 @SuppressWarnings({ "unchecked", "deprecation" })
	        List<People> listUser = (List<People>) factory.getCurrentSession()
	                .createCriteria(People.class)
	                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	 
	        return listUser;
		// TODO Auto-generated method stub

	}
	@Transactional
	public People get(int id) {
		 String hql = "from People where id=" + id;
	        Query query = factory.getCurrentSession().createQuery(hql);
	         
	        @SuppressWarnings("unchecked")
	        List<People> listUser = (List<People>) query.list();
	         
	        if (listUser != null && !listUser.isEmpty()) {
	            return listUser.get(0);
	        }
	         
	        return null;
	    }
	
	
	 @Transactional
	public void saveOrUpdate(People people) {
		
		  factory.getCurrentSession().saveOrUpdate(people);

	}
	 @Transactional
	public void delete(int id) {
		 People userToDelete = new People();
	        userToDelete.setId(id);
	        factory.getCurrentSession().delete(userToDelete);

	}

}
