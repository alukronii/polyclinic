package com.javaacademy.polyclinic.doctor;

public enum DoctorsSpecialization {
    DENTIST("Дантист"),
    THERAPIST("Терапевт"),
    SURGEON("Хирург");
    private String name;
    DoctorsSpecialization(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
