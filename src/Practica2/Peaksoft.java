package Practica2;

import java.util.Arrays;

public class Peaksoft {
    private String name;
    private String address;
    private Mentor[] mentors;
    private Student[] students;

    public Peaksoft(String name, String address, Mentor[] mentors, Student[] students) {
        this.name = name;
        this.address = address;
        this.mentors = mentors;
        this.students = students;

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

    public Mentor[] getMentor() {
        return mentors;
    }

    public void setMentor(Mentor[] mentor) {
        this.mentors = mentor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    //   ToDo
    public void getAllMentors(String name) {
        for (Mentor mentor : mentors) {
            if (mentor.getName().equalsIgnoreCase(name)) {
                System.out.println(" mentor  " + mentor);
            }
        }

    }

    public void getAllStudents() {
        for (Student student : students) {
            System.out.println("Students: " + student);
        }
    }

    public String searchByStudentname(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("student = " + student);
                return "student: " + student.getName();
            }
        }
        return "Мындай студент жок!";
    }

    public void getByMentorsByEmail(String email) {
        boolean found = false;
        for (Mentor mentor : mentors) {
            if (mentor.getEmail().equals(email)) {
                System.out.println("Ментор: " + mentor);
                found = true;
            }
        }
        if (!found) {
            System.out.println(" not found !! ");

        }
    }

    public void searchFemaleAndMaleByGender(String gender) {
        boolean found = false;
        for (Student student : students) {


            if (student.getGender().equals(gender)) {
                System.out.println("Gender: " + student);
                found = true;
            }else if (student.getGender().equals(gender)){
                System.out.println("Gender: " + student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Мындай Gender жок");
        }
    }
    public void searchByA(String name){
        for (Student student : students) {
            if (student.getName().contains(name)) {
                System.out.println("Студенттер: " + student);
            }
        }

    }


    @Override
    public String toString() {
        return "Peaksoft{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mentor=" + Arrays.toString(mentors) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}