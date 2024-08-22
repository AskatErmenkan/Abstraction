package TaskLMS;

public class Horse extends Animal {

    private final String colour;

    public Horse(double weight, int age, String gender, String nickName, String colour) {
        super(weight, age, gender, nickName);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
