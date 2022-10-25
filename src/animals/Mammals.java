package animals;

import java.util.Objects;

public abstract class Mammals extends Animals{
    protected int speed;
    protected String foodType;

    public Mammals(String nickname, int ageYears, String livingEnvironment, int speed, String foodType) {
        super(nickname, ageYears, livingEnvironment);
        setSpeed(speed);
        setFoodType(foodType);
    }

    public void walk(){
        System.out.println("млекопитающие пошли гулять");
    }

    public int getSpeed() {
        return speed;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Скорость перемещения должно быть положительным целым числом");
        }else {
            this.speed = speed;
        }
    }

    public void setFoodType(String foodType) {
        if (foodType == null || foodType.isEmpty()) {
            throw new IllegalArgumentException("Не задано поле Тип пищи");
        }else {
            this.foodType = foodType;
        }
    }

    protected abstract void eat();
    protected abstract void sleep();
    protected abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(foodType, mammals.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, foodType);
    }

}
