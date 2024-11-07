package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Data
@AllArgsConstructor
@Slf4j
public class CashDesk {
    private BigDecimal fullIncome;

    public void takePayment(BigDecimal income) {
        fullIncome = fullIncome.add(income);
    }

    public void infoIncome() {
        log.info("Заработала поликлиника: {}", fullIncome);
    }
}
