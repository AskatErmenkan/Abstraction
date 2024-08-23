package Practica2;

import java.util.Arrays;

public class Mentor {
    private String name;
    private String gender;
    private String email;
    private Group[] group;

    public Mentor(String name, String gender, String email, Group[] group) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public Group[] getGroup() {
        return group;
    }

    public void setGroup(Group[] group) {
        this.group = group;
    }
    public  int getAllMentors() {
        return getAllMentors();
    }
    @Override
    public String toString() {
        return "Mentor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", group=" + Arrays.toString(group) +
                '}';
    }
}
