package animals;

import java.util.Objects;

public class NotFlyingBird extends Bird {
    public NotFlyingBird(String nickname, int ageYears, String livingEnvironment, String moveType) {
        super(nickname, ageYears, livingEnvironment, moveType);
    }

    public void move(){
        System.out.println("Пернатые, которые не умеют летать либо плавают либо ходят");
    }

    @Override
    public String toString() {
        return "NotFlyingBird{" +
                "moveType='" + moveType + '\'' +
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