package animals;

public class NotFlyingBird extends Bird {
    public NotFlyingBird(String nickname, int ageYears, String livingEnvironment, String moveType) {
        super(nickname, ageYears, livingEnvironment, moveType);
    }

    public void move(){
        System.out.println("Пернатые, которые не умеют летать либо плавают либо ходят");
    }

}