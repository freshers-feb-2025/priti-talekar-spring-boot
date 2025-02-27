package Mapping;

import Mapping.Entity.Laptop;
import Mapping.Entity.Student;
import Mapping.Repository.LaptopRepository;
import Mapping.Repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
     @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private LaptopRepository laptopRepository;

    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student=new Student();
        student.setStudentId(101);
        student.setStudentName("Ruhi");
        student.setAbout("software engineer");

        Laptop laptop=new Laptop();
        laptop.setLaptopId(1);
        laptop.setLaptopBrand("dell");
        laptop.setLaptopModel("12341");

        student.setLaptop(laptop);
        laptop.setStudent(student);

        Student savedStudent=studentRepository.save(student);
        logger.info("Saved student: {}", savedStudent);

    }
}
