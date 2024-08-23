package Practica2;

import java.util.Arrays;

public class Group {
    private String name;
    private Student[] students;
    private int count;

    public Group(String name, Student[] students, int count) {
        this.name = name;
        this.students = students;
        this.count = students.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
//   Студенттерди алуу методу



    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ", count=" + count +
                '}';
    }
}
