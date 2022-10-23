package animals;

import java.util.Objects;

public abstract class Animals {
    protected String nickname;
    protected int ageYears;
    protected String livingEnvironment;

    public Animals(String nickname, int ageYears, String livingEnvironment) {
        setNickname(nickname);
        setAgeYears(ageYears);
        setLivingEnvironment(livingEnvironment);
    }

    protected abstract void eat();
    protected abstract void sleep();
    protected abstract void move();

    public String getNickname() {
        return nickname;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setNickname(String nickname) {
        if (nickname == null || nickname.isEmpty()) {
            throw new IllegalArgumentException("Не задана кличка животного");
        }else {
            this.nickname = nickname;
        }
    }

    public void setAgeYears(int ageYears) {
        if (ageYears <= 0) {
            throw new IllegalArgumentException("Количество лет должно быть положительным целым числом");
        }else {
            this.ageYears = ageYears;
        }
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty()) {
            throw new IllegalArgumentException("Не задана среда проживания");
        }else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public String toString() {
        return "Animals{" +
                "nickname='" + nickname + '\'' +
                ", ageYears=" + ageYears +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return ageYears == animals.ageYears && Objects.equals(nickname, animals.nickname) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, ageYears, livingEnvironment);
    }
}
