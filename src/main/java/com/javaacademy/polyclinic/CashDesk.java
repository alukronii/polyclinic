package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

@Component
@Slf4j
public class CashDesk {
    private BigDecimal fullIncome = ZERO;

    public void takePayment(BigDecimal income) {
        fullIncome = fullIncome.add(income);
    }

    public void infoIncome() {
        log.info("Заработала поликлиника: {}", fullIncome);
    }
}
