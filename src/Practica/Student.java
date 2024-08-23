package Practica;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surName;
    private String gender;
    private LocalDate dateOfStart;
    private EducationCentre educationCentre;

    public Student(String name, String surName, String gender, LocalDate dateOfStart, EducationCentre educationCentre) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCentre = educationCentre;
    }

    public  int getAge(){
        return  2024- dateOfStart.getYear();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", Education Centre: " + educationCentre.getName() + " " +
                educationCentre.getCountry() + " " + educationCentre.getFoundationYear() +
                '}';
    }
}
