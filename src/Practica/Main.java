package Practica;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        School school = new School("Chyngyz Aitmatov", "Bishkek", LocalDate.of(2000, 6, 1));
        University university = new University("Manas", "Bishkek", LocalDate.of(1995, 6, 20));
        College college = new College("MAUPFiP", "Bishkek", LocalDate.of(2010, 4, 4));


        Student student1 = new Student("Adilet", "Aibekov", "male", LocalDate.of(2022, 8, 1), college);
        Student student2 = new Student("Adil", "Nurbekov", "male", LocalDate.of(2022, 8, 1), university);
        Student student3 = new Student("Altynai", "Jusupova", "female", LocalDate.of(2022, 8, 1), school);
        Student student4 = new Student("Bekbolot", "Orozov", "male", LocalDate.of(2022, 8, 1), school);
        Student student5 = new Student("Gulnaz", "Abdykadyrova", "female", LocalDate.of(2022, 8, 1), university);
        Student student6 = new Student("Daniyar", "Toktogulov", "male", LocalDate.of(2022, 8, 1), college);
        Student student7 = new Student("Elzat", "Osmonova", "female", LocalDate.of(2022, 8, 1), college);
        Student student8 = new Student("Marat", "Asanov", "male", LocalDate.of(2022, 8, 1), school);
        Student student9 = new Student("Nazira", "Bazarbayeva", "female", LocalDate.of(2022, 8, 1), university);
        Student student10 = new Student("Azamat", "Karimov", "male", LocalDate.of(2022, 8, 1), school);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student8, student9, student10};
        for (Student student : students) {
            System.out.println("student = " + student);

            System.out.println("student.getAge() = " + student.getAge());
        }

    }

}
