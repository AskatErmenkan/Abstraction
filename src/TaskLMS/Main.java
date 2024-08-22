package TaskLMS;

public class Main {
    public static void main(String[] args) {

        Sheep[] farm1Sheep = {
                new Sheep(35.0, 2, "Female", "Ak koi"),
                new Sheep(30.0, 3, "Male", "Kara koi"),
                new Sheep(27.0, 4, "Female", "Sary koi")};

        Cow[] farm1Cows = {
                new Cow(200.0, 5, "Female", "Cow1"),
                new Cow(220.0, 6, "Female", "Cow2"),
                new Cow(230.0, 7, "Male", "Cow3"),
                new Cow(210.0, 4, "Female", "Cow4"),
                new Cow(250.0, 5, "Male", "Cow5")};

        Horse[] farm1Horses = {
                new Horse(300.0, 6, "Male", "Akkula", "kula"),
                new Horse(320.0, 7, "Female", "Sarala", "sarala")};

        Farm farm1 = new Farm("Kara-Balta", farm1Cows, farm1Horses, farm1Sheep, "Aidar");


        Sheep[] farm2Sheep = {
                new Sheep(46.0, 2, "Female", "Arashan")};

        Cow[] farm2Cows = {
                new Cow(410.0, 5, "Female", "Cow6")};

        Horse[] farm2Horses = {
                new Horse(510.0, 6, "Male", "Horse3", "sarala")};

        Farm farm2 = new Farm("Karakol", farm2Cows, farm2Horses, farm2Sheep, "Mambet");


        System.out.println(farm1);
        System.out.println(farm2);
    }
}
