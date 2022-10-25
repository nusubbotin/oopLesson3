package transport;

public class Train extends Transport {
    private float price;
    private int timeTrainMi;
    private String beginStation;
    private String endStation;
    private int wagonsCnt;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int speed, float price, int timeTrainMi, String beginStation, String endStation, int wagonsCnt) {
        super(brand, model, productionYear, productionCountry, color, speed);

        this.price = price;
        this.timeTrainMi = timeTrainMi;
        this.beginStation = beginStation;
        this.endStation = endStation;
        this.wagonsCnt = wagonsCnt;
    }

    public float getPrice() {
        return price;
    }

    public int getTimeTrainMi() {
        return timeTrainMi;
    }

    public String getBeginStation() {
        return beginStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public int getWagonsCnt() {
        return wagonsCnt;
    }

    public void setPrice(float price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Стоимость поездки не должна быть меньше нуля!");
        }else {
            this.price = price;
        }
    }

    public void setTimeTrainMi(int timeTrainMi) {
        if (timeTrainMi <= 0) {
            throw new IllegalArgumentException("Время поездки задается в часах. И должно быть больше нуля!");
        }else {
            this.timeTrainMi = timeTrainMi;
        }
    }

    public void setBeginStation(String beginStation) {
        if (beginStation == null || beginStation.isEmpty()) {
            throw new IllegalArgumentException("Не задано Название станции отправления");
        }else {
            this.beginStation = beginStation;
        }
    }

    public void setEndStation(String endStation) {
        if (endStation == null || endStation.isEmpty()) {
            throw new IllegalArgumentException("Не задана конечная остановка");
        }else {
            this.endStation = endStation;
        }
    }

    public void setWagonsCnt(int wagonsCnt) {
        if (wagonsCnt <= 0) {
            throw new IllegalArgumentException("Количество вагонов долно быть положительным целым числом");
        }else {
            this.wagonsCnt = wagonsCnt;
        }
    }

    @Override
    public String toString() {
        return "Бренд: "+ this.brand
                + "; Модель: " + this.model
                + "; Цвет кузова: " + this.color
                + "; Год производства: " + this.productionYear
                + "; Страна сборки: " + this.productionCountry
                + "; Скорость: " + this.speed

                + "; Цена поездки: " + this.price
                + "; Время поездки: " + this.timeTrainMi
                + "; Название станции отбытия: " + this.beginStation
                + "; Конечная остановка: " + this.endStation
                + "; Количество вагонов: " + this.wagonsCnt
                ;
    }

    public void refill(){
        System.out.println("Поезд нужно заправлять дизелем");
    }
}
