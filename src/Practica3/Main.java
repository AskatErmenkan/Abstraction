package Practica3;

public class Main {
    public static void main(String[] args) {

        Car mercedes1 = new Mercedes("Mers 210", "white", 300);
        Mercedes mercedes2 = new Mercedes("Mers 221", "black", 350);

        Car bmv1 = new BMW("BMW X7", "black", 350);
        BMW bmv2 = new BMW("BMW X6", "black", 300);

        mercedes1.gas();
        mercedes1.brake();
        System.out.println("___________________________");
        bmv1.gas();
        bmv1.gas();
        


    }
}