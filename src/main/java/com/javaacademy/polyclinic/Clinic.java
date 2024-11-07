package com.javaacademy.polyclinic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Clinic {
    private CashDesk cashDesk;
    private Doctor therapist;
    private Doctor dentist;
    private Doctor juniorSurgeon;
    private Doctor seniorSurgeon;

    public Clinic(@Qualifier("therapist") Doctor therapist, @Qualifier("dentist") Doctor dentist, @Qualifier("juniorSurgeon") Doctor juniorSurgeon, @Qualifier("seniorSurgeon") Doctor seniorSurgeon) {
        this.therapist = therapist;
        this.dentist = dentist;
        this.juniorSurgeon = juniorSurgeon;
        this.seniorSurgeon = juniorSurgeon;
    }

    public void toTreatTherapist() {
        therapist.toTreat();
        cashDesk.takePayment(therapist);
    }

    public void toTreatDentist() {
        dentist.toTreat();
        cashDesk.takePayment(dentist);
    }

    public void toTreatJuniorSurgeon() {
        juniorSurgeon.toTreat();
        cashDesk.takePayment(juniorSurgeon);
    }

    public void toTreatSeniorSurgeon() {
        seniorSurgeon.toTreat();
        cashDesk.takePayment(seniorSurgeon);
    }
}
