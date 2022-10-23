package animals;

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
}
