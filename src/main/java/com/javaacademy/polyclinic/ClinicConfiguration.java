package com.javaacademy.polyclinic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;


@Configuration
public class ClinicConfiguration {

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(BigDecimal.valueOf(700),
            DoctorsSpecialization.SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(BigDecimal.valueOf(2000),
            DoctorsSpecialization.SURGEON);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(BigDecimal.valueOf(500),
            DoctorsSpecialization.THERAPIST);
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(BigDecimal.valueOf(1500),
            DoctorsSpecialization.DENTIST);
    }

}
