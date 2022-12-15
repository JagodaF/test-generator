import java.util.List;

public class University {
    String name;
    String address;
    String phoneNumber;
    List<Subject> subjects;

    public University(String name, String address, String phoneNumber, List<Subject> subjects) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.subjects = subjects;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
