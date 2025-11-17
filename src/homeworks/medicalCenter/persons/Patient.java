package homeworks.medicalCenter.persons;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Patient extends Person implements Serializable {
    private Doctor doctor;
    private Date registrationDate;

    Patient() {

    }

    public Patient(String name, String surname, String id, String phoneNumber, Doctor doctor, Date registrationDate) {
        super(id, name, surname, phoneNumber);
        this.doctor = doctor;
        this.registrationDate = registrationDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Patient patient)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(doctor, patient.doctor) && Objects.equals(registrationDate, patient.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor, registrationDate);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor='" + doctor + '\'' +
                ", registrationDate=" + registrationDate +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", surname='" + surname + '\'' +
                '}';
    }
}

