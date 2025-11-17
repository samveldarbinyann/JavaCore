package homeworks.medicalCenter.storage;

import homeworks.medicalCenter.persons.Doctor;

import java.io.Serializable;
import java.util.Scanner;

public class DoctorStorage implements Serializable {
    private static Scanner scanner = new Scanner(System.in);
    private Doctor[] doctorsStorage = new Doctor[20];
    private int size = 0;

    public Doctor getDoctor(String doctorId) {
        for (Doctor doctor : doctorsStorage) {
            if (doctor != null && doctor.getId().equals(doctorId)) return doctor;
        }
        return null;
    }

    public void addDoc(Doctor doctor) {
        if (size == doctorsStorage.length) {
            extend();
        }
        doctorsStorage[size++] = doctor;
    }

    private void extend() {
        Doctor[] temp = new Doctor[size + 20];
        System.arraycopy(doctorsStorage, 0, temp, 0, size);
        doctorsStorage = temp;
    }

    public void searchByProf(String profession) {
        for (int i = 0; i < size; i++) {
            if (doctorsStorage[i].getProfession().equals(profession)) {
                System.out.println(doctorsStorage[i]);
            }
        }
    }

    public void deleteDoctorById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if(doctorsStorage[i] != null && doctorsStorage[i].getId().equals(doctorId)) {
                for (int j = i; j < size; j++) {
                    doctorsStorage[j] = doctorsStorage[j + 1];
                }
                doctorsStorage[size - 1] = null;
                size--;
                return;
            }

        }
    }

    public void changeDoctorById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if(doctorsStorage[i].getId().equals(doctorId)) {
                System.out.println("Please input new name");
                String newName = scanner.nextLine();
                System.out.println("Please input new surname");
                String newSurname = scanner.nextLine();
                System.out.println("Please input new profession");
                String newProfession = scanner.nextLine();
                System.out.println("Please input new phone number");
                int newPhoneNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please input new email");
                String newEmail = scanner.nextLine();
                doctorsStorage[i].setName(newName);
                doctorsStorage[i].setSurname(newSurname);
                doctorsStorage[i].setProfession(newProfession);
                doctorsStorage[i].setPhoneNumber(newPhoneNumber);
                doctorsStorage[i].setEmail(newEmail);
            }
        }
    }

    public void printAllDoctors() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctorsStorage[i]);
        }
    }

}
