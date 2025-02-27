package Mapping.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Students", schema = "jpa")
public class Laptop {

      @Id
      private int laptopId;

      private String laptopModel;

      private String laptopBrand;

      @OneToOne
      @JoinColumn(name="laptopId")
      private Student student;

      public int getLaptopId() {
            return laptopId;
      }

      public void setLaptopId(int laptopId) {
            this.laptopId = laptopId;
      }

      public String getLaptopModel() {
            return laptopModel;
      }

      public void setLaptopModel(String laptopModel) {
            this.laptopModel = laptopModel;
      }

      public String getLaptopBrand() {
            return laptopBrand;
      }

      public void setLaptopBrand(String laptopBrand) {
            this.laptopBrand = laptopBrand;
      }

      public Student getStudent() {
            return student;
      }

      public void setStudent(Student student) {
            this.student = student;
      }

      @Override
      public String toString() {
            return "Laptop{" + "laptopId=" + laptopId + ", laptopModel='" + laptopModel + '\'' + ", laptopBrand='" + laptopBrand + '\'' + ", student=" + student + '}';
      }
}
