package com.bookticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookticket.dao.BookticketDAO;
import com.bookticket.entity.PassengerInfo;

@Service
public class BookticketServiceImpl implements BookticketService {

	@Autowired
	BookticketDAO bookticketDAO;
	
	@Override
	@Transactional
	public void bookticket(PassengerInfo passengerInfo) {
		
		bookticketDAO.bookticket(passengerInfo);
		
	}

	@Override
	@Transactional
	public void getticket() {
		
		
	}

}
