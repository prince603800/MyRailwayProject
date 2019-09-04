package com.bookticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookticket.entity.PassengerInfo;
import com.bookticket.service.BookticketService;

@Controller
@RequestMapping("/passenger")
public class BookticketController {

	//injecting customer service
	@Autowired
	private BookticketService bookticketService;
	
	
	@GetMapping("/bookTicketForm")
	public String  bookTicketForm(Model theModel) {
		
		PassengerInfo passengerInfo=new PassengerInfo();
		theModel.addAttribute("passengerInfo", passengerInfo);
		return "bookTicketForm";
		
	}
	
	@PostMapping("/savePassengerInfo")
	public String bookticket(@ModelAttribute ("passengerInfo") PassengerInfo passenger ) {
		
	  bookticketService.bookticket(passenger);
		return "confirmationPage";
	}
	

	@GetMapping("/getPassengerTicketForm")
	public String getPassengerTicket() {	   
	   return "getPassengerTicket-form";
	}
	
	@GetMapping("/confirmationPage")
	public String ticketConfirmation() {
		return "confirmationPage";
	}
}
