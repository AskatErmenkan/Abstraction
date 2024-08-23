package Practica2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Adilet", "male", "adilet@gmail.com");
        Student student2 = new Student("Babakhan", "male", "Babkhan@gmail.com");
        Student student3 = new Student("Nuradil", "male", "nuradil@gmail.com");
        Student student4 = new Student("Asyl", "male", "asyl@gmail.com");
        Student student5 = new Student("Nurdin", "male", "nurdin@gmail.com");
        Student student6 = new Student("Askat", "male", "askat@gmail.com");
        Student student7 = new Student("Maksat", "male", "maksat@gmail.com");
        Student student8 = new Student("Kylychbek", "Female", "kalybek@gmail.com");
        Student student9 = new Student("Sapar", "male", "sapar@gmail.com");
        Student student10 = new Student("Turat", "Female", "Turat@gmail.com");

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        for (Student student : students) {
        }

        Group group1 = new Group("Java-15", students, 15);
        Group group2 = new Group("Java-16", students, 20);
        Group group3 = new Group("Java-17", students, 20);

        Group[] groups = {group1, group2, group3};


        Mentor mentor1 = new Mentor("Urmat", "male", "urmat@gmail.com", groups);
        Mentor mentor2 = new Mentor("Aigan", "female", "aijan@gmail.com", groups);
        Mentor mentor3 = new Mentor("Mukhammed", "male", "mukhammed@gmail.com", groups);

        Mentor[] mentors = {mentor1, mentor2, mentor3};


        Peaksoft peaksoft = new Peaksoft("Peaksoft, Kyrgyzstan", "Grajdanskaia 119",mentors, students);
//            System.out.println("PeakSoft = " + peaksoft);
//
//          Аты менен менторду издоо
            peaksoft.getAllMentors("aigan");

//            Студенттердин баарын чыгаруу
            peaksoft.getAllStudents();

//        Студентти аты менен издоо
            peaksoft.searchByStudentname("Askat");

//            Менторду Email аркылуу издоо
            peaksoft.getByMentorsByEmail("mukhammed@gmail.com");

            peaksoft.searchFemaleAndMaleByGender("Female");
            peaksoft.searchByA("a");
    }


}
