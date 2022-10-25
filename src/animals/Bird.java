package animals;

import java.util.Objects;

public abstract class Bird extends Animals{

    protected String moveType;

    public Bird(String nickname, int ageYears, String livingEnvironment, String moveTyp) {
        super(nickname, ageYears, livingEnvironment);
        setMoveType(moveTyp);
    }

    public void hunt(){
        System.out.println("Пернатые полетели на охоту");
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        if (moveType == null || moveType.isEmpty()) {
            throw new IllegalArgumentException("Не задана тип передвижения");
        }else {
            this.moveType = moveType;
        }
    }

    protected void eat(){
        System.out.println("Птички кушают зерно");
    };

    protected void sleep(){
        System.out.println("Птички спят на деревьях");
    };
    protected abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(moveType, bird.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveType);
    }
}
