package homeworks.medicalCenter;

import homeworks.medicalCenter.persons.Doctor;
import homeworks.medicalCenter.persons.Patient;
import homeworks.medicalCenter.storage.DoctorStorage;
import homeworks.medicalCenter.storage.PatientStorage;
import homeworks.medicalCenter.util.FileUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MedicalDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage =
            FileUtil.deserializeDoctorData() != null ? FileUtil.deserializeDoctorData() : new DoctorStorage();
    private static PatientStorage patientStorage =
            FileUtil.deserializePatientData() != null ? FileUtil.deserializePatientData() : new PatientStorage();


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case SEARCH_DOCTOR:
                    System.out.println("Enter doctor's profession");
                    String profession = scanner.nextLine();
                    doctorStorage.searchByProf(profession);
                    break;
                case DELETE_DOCTOR:
                    System.out.println("Enter doctor's id");
                    doctorStorage.printAllDoctors();
                    String doctorId = scanner.nextLine();
                    doctorStorage.deleteDoctorById(doctorId);
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case CHANGE_DOCTOR:
                    System.out.println("Enter doctor's id");
                    doctorStorage.printAllDoctors();
                    String changeDoctorId = scanner.nextLine();
                    doctorStorage.changeDoctorById(changeDoctorId);
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case ADD_PATIENT:
                    System.out.println("Enter doctor's id");
                    doctorStorage.printAllDoctors();
                    String docId = scanner.nextLine();
                    Doctor doctor = doctorStorage.getDoctor(docId);
                    addPatient(doctor);
                    FileUtil.serializePatientData(patientStorage);
                    break;
                case PRINT_PATIENT_BY_DOC:
                    System.out.println("Enter doctor's id");
                    doctorStorage.printAllDoctors();
                    String searchDoctorId = scanner.nextLine();
                    Doctor doctor2 = doctorStorage.getDoctor(searchDoctorId);
                    if (doctor2 == null) {
                        System.out.println("Doctor not found");
                        break;
                    }
                    patientStorage.printAllPatientsByDoctor(doctor2);
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.printAllPatients();
                    break;
            }
        }
    }

    public static void printCommand() {
        System.out.println("Please input 0 to exit");
        System.out.println("Please input 1 to add doctor");
        System.out.println("Please input 2 to search doctor by profession");
        System.out.println("Please input 3 to delete doctor by id");
        System.out.println("Please input 4 to change doctor by id");
        System.out.println("Please input 5 to add patient");
        System.out.println("Please input 6 to print all patients by doctor");
        System.out.println("Please input 7 to print all patients");
    }

    public static void addDoctor() {
        System.out.println("Please input doctor name");
        String name = scanner.nextLine();
        if (name.isEmpty() || name.length() <= 2) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Please input doctor surname");
        String surname = scanner.nextLine();
        if (surname.isEmpty() || surname.length() <= 2) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Please input doctor id. Example ---> AX12345678");
        String id = scanner.nextLine();
        if (id.isEmpty() || id.length() < 10) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Please input doctor profession");
        String profession = scanner.nextLine();
        if (profession.isEmpty() || profession.length() <= 2) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Please input doctor phone number. Example ---> 37412345678");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.isEmpty() || phoneNumber.length() < 11) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Please input doctor email");
        String email = scanner.nextLine();
        if (email.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }
        Doctor doctor = new Doctor(id, name, surname, phoneNumber, email, profession);
        doctorStorage.addDoc(doctor);
    }

    public static void addPatient(Doctor doctor) {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        if (name.isEmpty() || name.length() <= 2) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        if (surname.isEmpty() || surname.length() <= 2) {
            System.out.println("Invalid input");
        }
        System.out.println("Please input id. Example ---> AX12345678");
        String id = scanner.nextLine();
        if (id.isEmpty() || id.length() <= 10) {
            System.out.println("Invalid input");
        }
        System.out.println("Please input phone number. Example ---> 37412345678");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.isEmpty() || phoneNumber.length() <= 10) {
            System.out.println("Invalid input");
        }
        System.out.println("Please input registration date (yyyy-MM-dd)");
        String registrationDateStr = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date registrationDate;
        try {
            registrationDate = sdf.parse(registrationDateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format using current date");
            registrationDate = new Date();
        }

        Patient patient = new Patient(name, surname, id, phoneNumber, doctor, registrationDate);
        patientStorage.addPatient(patient);
    }
}
