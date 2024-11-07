package com.javaacademy.polyclinic;

import com.javaacademy.polyclinic.doctor.Doctor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Clinic {
    private CashDesk cashDesk;
    private Doctor therapist;
    private Doctor dentist;
    private Doctor juniorSurgeon;
    private Doctor seniorSurgeon;

    public Clinic(CashDesk cashDesk,
                  @Qualifier("therapist") Doctor therapist,
                  @Qualifier("dentist") Doctor dentist,
                  @Qualifier("juniorSurgeon") Doctor juniorSurgeon,
                  @Qualifier("seniorSurgeon") Doctor seniorSurgeon) {
        this.cashDesk = cashDesk;
        this.therapist = therapist;
        this.dentist = dentist;
        this.juniorSurgeon = juniorSurgeon;
        this.seniorSurgeon = seniorSurgeon;
    }

    public void toTreatTherapist() {
        cashDesk.takePayment(therapist.toTreat());
    }

    public void toTreatDentist() {
        cashDesk.takePayment(dentist.toTreat());
    }

    public void toTreatJuniorSurgeon() {
        cashDesk.takePayment(juniorSurgeon.toTreat());
    }

    public void toTreatSeniorSurgeon() {
        cashDesk.takePayment(seniorSurgeon.toTreat());
    }
}
