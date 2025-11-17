package homeworks.medicalCenter.util;


import homeworks.medicalCenter.storage.DoctorStorage;
import homeworks.medicalCenter.storage.PatientStorage;

import java.io.*;

public abstract class FileUtil {
        private static final String DOCTOR_DATA_FILE = "C:\\Users\\samve\\JavaCore\\src\\homeworks\\medicalCenter\\data\\doctorData";
        private static final String PATIENT_DATA_FILE = "C:\\Users\\samve\\JavaCore\\src\\homeworks\\medicalCenter\\data\\patientData";

        public static void serializeDoctorData(DoctorStorage doctorStorage) {
            try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DOCTOR_DATA_FILE))) {
                out.writeObject(doctorStorage);
            } catch (
                    FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            }
        }

        public static void serializePatientData(PatientStorage patientStorage) {
            try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATIENT_DATA_FILE))) {
                out.writeObject(patientStorage);
            } catch (
                    FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            }
        }

        public static DoctorStorage deserializeDoctorData() {
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(DOCTOR_DATA_FILE))) {
                Object obj = in.readObject();
                if (obj instanceof DoctorStorage doctorStorage) {
                    return doctorStorage;
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }

        public static PatientStorage deserializePatientData() {
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATIENT_DATA_FILE))) {
                Object obj = in.readObject();
                if (obj instanceof PatientStorage patientStorage) {
                    return patientStorage;
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return null;
    }
}
