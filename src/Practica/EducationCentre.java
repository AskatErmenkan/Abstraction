package Practica;

import java.time.LocalDate;

public abstract class EducationCentre {
    private String name;
    private String country;
    private LocalDate foundationYear;

    public EducationCentre(String name, String country, LocalDate foundationYear) {
        this.name = name;
        this.country = country;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "EducationCentre{" +
                "name='" + name + '\'' +
                ", country=" + country +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
