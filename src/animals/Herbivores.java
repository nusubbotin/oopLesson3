package animals;

import java.util.Objects;

public class Herbivores extends Mammals {

    public Herbivores(String nickname, int ageYears, String livingEnvironment, int speed, String foodType) {
        super(nickname, ageYears, livingEnvironment, speed, foodType);
    }

    public void pasture() {
        System.out.println("Травоядные пошли на поляну пастись");
    }

    protected void eat() {
        System.out.println("Травоядные питаются травой");
    }

    protected void sleep() {
        System.out.println("Травоядные спят как правило лежа");
    }

    protected void move() {
        System.out.println("Травоядные малоподвижны");
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "speed=" + speed +
                ", foodType='" + foodType + '\'' +
                ", nickname='" + nickname + '\'' +
                ", ageYears=" + ageYears +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
