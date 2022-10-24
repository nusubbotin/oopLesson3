package animals;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Amphibians{" +
                "nickname='" + nickname + '\'' +
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
