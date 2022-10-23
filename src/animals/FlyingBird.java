package animals;

public class FlyingBird extends Bird {

    public FlyingBird(String nickname, int ageYears, String livingEnvironment, String moveType) {
        super(nickname, ageYears, livingEnvironment, moveType);
    }

    public void move(){
        System.out.println("Летающие пернатые любят передвигаться в полете");
    };

}
