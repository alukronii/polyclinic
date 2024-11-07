package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

@Data
@AllArgsConstructor
@Slf4j
@Component
public class CashDesk {
    private BigDecimal income = ZERO;

    public void takePayment(Doctor doctor) {
        income = income.add(doctor.getCostOfDoctorsAppointment());
    }

    public void infoIncome() {
        log.info("Заработала поликлиника: {}", income);
    }
}
