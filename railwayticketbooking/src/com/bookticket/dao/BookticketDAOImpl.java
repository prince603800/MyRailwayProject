package com.bookticket.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookticket.entity.PassengerInfo;

@Repository
public class BookticketDAOImpl implements BookticketDAO{

	@Autowired
	SessionFactory sessionFactory ;
	
	@Override
	public void bookticket(PassengerInfo passengerInfo) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(passengerInfo);
	}

	@Override
	public void getticket() {
		
		
	}

}
