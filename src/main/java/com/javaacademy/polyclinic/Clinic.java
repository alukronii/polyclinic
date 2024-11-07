package com.javaacademy.polyclinic;

import org.springframework.stereotype.Component;

@Component
public class Clinic {
    private CashDesk income;
    private Doctor therapist;
    private Doctor dentist;
    private Doctor juniorSurgeon;
    private Doctor seniorSurgeon;

    public void toTreatTherapist(Doctor therapist) {
        therapist.toTreat();
        income.takePayment(therapist);
    }

    public void toTreatDentist(Doctor dentist) {
        dentist.toTreat();
        income.takePayment(dentist);
    }

    public void toTreatJuniorSurgeon(Doctor juniorSurgeon) {
        juniorSurgeon.toTreat();
        income.takePayment(juniorSurgeon);
    }

    public void toTreatSeniorSurgeon(Doctor seniorSurgeon) {
        seniorSurgeon.toTreat();
        income.takePayment(seniorSurgeon);
    }
}
