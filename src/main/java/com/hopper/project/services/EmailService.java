package com.hopper.project.services;

import org.springframework.mail.SimpleMailMessage;

import com.hopper.project.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
