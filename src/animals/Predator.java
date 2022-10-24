package animals;

import java.util.Objects;

public class Predator extends Mammals {

    public Predator(String nickname, int ageYears, String livingEnvironment, int speed, String foodType) {
        super(nickname, ageYears, livingEnvironment, speed, foodType);
    }

    public void pasture(){
        System.out.println("Хишники пошли на ОХОТУ");
    }

    protected void eat(){
        System.out.println("Хишники кушают других животных");
    };

    protected void sleep(){
        System.out.println("Хишники спят не боясь");
    };

    protected void move(){
        System.out.println("Шишники передивагаются очень быстро");
    };

    @Override
    public String toString() {
        return "Predator{" +
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
