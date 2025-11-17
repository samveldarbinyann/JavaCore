package homeworks.medicalCenter.persons;

import java.io.Serializable;
import java.util.Objects;

public class Doctor extends Person implements Serializable {
    private String email;
    private String profession;

    Doctor() {
    }

    public Doctor(String id, String name, String surname, String phonNumber, String email, String profession) {
        super(id, name, surname, phonNumber);
        this.email = email;
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Doctor doctor)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(email, doctor.email) && Objects.equals(profession, doctor.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession);
    }

    @Override
    public String toString() {
        return name + " " + surname + " | ID: " + id + " | Profession: " + profession + " | Email: " + email + " | Phone: " + phoneNumber;
    }
}
