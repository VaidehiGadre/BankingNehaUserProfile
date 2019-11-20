package org.cap.dao;

import org.cap.entities.User;
import org.cap.entities.User_Profiles;


import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


	@Repository
	public class User_ProfilesDaoImpl implements IUser_ProfilesDao {

	    @PersistenceContext
	    private EntityManager em;

	    public User_ProfilesDaoImpl(){
	    }
	
	    @Override
	    public User_Profiles createUser_Profiles(User_Profiles user_p){
	        user_p=em.merge(user_p);
	        return user_p;
	    }

	    @Override
	    public User_Profiles createUser(String name) {
	    	User_Profiles user_p=new User_Profiles();
	        user_p.setF_name(name);
	        user_p=em.merge(user_p);
	        return user_p;
	    }

		@Override
		public User_Profiles createUser(User user_p) {
			// TODO Auto-generated method stub
			return null;
		}
}

