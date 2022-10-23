package animals;

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
}
