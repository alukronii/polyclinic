package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@AllArgsConstructor
@Data
public class Doctor {
    private BigDecimal costOfDoctorsAppointment;
    private DoctorsSpecialization doctorsSpecialization;

    public BigDecimal toTreat() {
        log.info("{} вылечил человека", doctorsSpecialization);
        return costOfDoctorsAppointment;
    }
}
