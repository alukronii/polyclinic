package com.javaacademy.polyclinic;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@Data
@ConfigurationProperties(prefix = "cost")
public class DoctorProperty {
    private BigDecimal therapist;
    private BigDecimal dentist;
    private BigDecimal juniorSurgeon;
    private BigDecimal seniorSurgeon;
}
