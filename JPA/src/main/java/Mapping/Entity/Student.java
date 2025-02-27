package Mapping.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students", schema = "jpa")
public class Student {
    @Id
    private int studentId;

    private String studentName;

    private String about;

    @OneToOne(mappedBy = "student")
    private Laptop laptop;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName='" + studentName + '\'' + ", about='" + about + '\'' + ", laptop=" + laptop + '}';
    }
}
