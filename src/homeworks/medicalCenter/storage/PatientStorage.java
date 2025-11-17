package homeworks.medicalCenter.storage;

import homeworks.medicalCenter.persons.Doctor;
import homeworks.medicalCenter.persons.Patient;

import java.io.Serializable;

public class PatientStorage implements Serializable {
    private Patient[] patientStorage = new Patient[20];
    private int size = 0;

    public void addPatient(Patient patient) {
        if (size == patientStorage.length) {
            extend();
        }
        patientStorage[size++] = patient;
    }

    private void extend() {
        Patient[] newPatientStorage = new Patient[size + 20];
        System.arraycopy(patientStorage, 0, newPatientStorage, 0, size);
        patientStorage = newPatientStorage;
    }

    public void printAllPatients() {
        for (int i = 0; i < size; i++) {
            System.out.println(patientStorage[i]);
        }
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (patientStorage[i].getDoctor().equals(doctor)) {
                System.out.println(patientStorage[i]);
            }
        }
    }
}
