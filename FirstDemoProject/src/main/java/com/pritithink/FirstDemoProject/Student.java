package com.pritithink.FirstDemoProject;

public class Student {
    private int Stud_Id;

    private String Stud_Name;

    private String Stud_Address;

    public Student(int stud_Id, String stud_Name, String stud_Address) {
        Stud_Id = stud_Id;
        Stud_Name = stud_Name;
        Stud_Address = stud_Address;
    }
    public Student(){
        super();
    }

    public int getStud_Id() {
        return Stud_Id;
    }

    public void setStud_Id(int stud_Id) {
        Stud_Id = stud_Id;
    }

    public String getStud_Name() {
        return Stud_Name;
    }

    public void setStud_Name(String stud_Name) {
        Stud_Name = stud_Name;
    }

    public String getStud_Address() {
        return Stud_Address;
    }

    public void setStud_Address(String stud_Address) {
        Stud_Address = stud_Address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Stud_Id=" + Stud_Id +
                ", Stud_Name='" + Stud_Name + '\'' +
                ", Stud_Address='" + Stud_Address + '\'' +
                '}';
    }
}
