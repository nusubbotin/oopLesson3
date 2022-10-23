package animals;

public class Amphibians extends Animals{

    public Amphibians(String nickname, int ageYears, String livingEnvironment) {
        super(nickname, ageYears, livingEnvironment);
    }

    public void hunt(){
        System.out.println("Земноводные пошли на охоту");
    }

    protected void eat(){
        System.out.println("Земноводные питаются букашками");
    };

    protected void sleep(){
        System.out.println("Земноводные спят и в воде и на суше");
    };

    protected void move(){
        System.out.println("Земноводные умеют передвигаться и по вде и по суше");
    };
}
