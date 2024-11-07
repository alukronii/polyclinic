package com.javaacademy.polyclinic;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(value = DoctorProperty.class)
public class DoctorConfiguration {
    private DoctorProperty doctorProperty;

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(doctorProperty.getJuniorSurgeon(),
            DoctorsSpecialization.SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(doctorProperty.getSeniorSurgeon(),
            DoctorsSpecialization.SURGEON);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(doctorProperty.getTherapist(),
            DoctorsSpecialization.THERAPIST);
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(doctorProperty.getDentist(),
            DoctorsSpecialization.DENTIST);
    }

}
