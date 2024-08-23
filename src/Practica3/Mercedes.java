package Practica3;

public class Mercedes extends Car{

    public Mercedes(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Mers korol trassy");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes Benz unaasy toktodu");
    }
}
