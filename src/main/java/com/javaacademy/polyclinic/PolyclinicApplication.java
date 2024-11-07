package com.javaacademy.polyclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PolyclinicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PolyclinicApplication.class, args);
		Clinic clinic = context.getBean(Clinic.class);
		clinic.toTreatTherapist();
		clinic.toTreatDentist();
		clinic.toTreatJuniorSurgeon();
		clinic.toTreatSeniorSurgeon();
//		CashDesk cashDesk = context.getBean(CashDesk.class);
//		cashDesk.infoIncome();
	}
}
