package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int speed) {
        super(brand, model, productionYear, productionCountry, color, speed);
    }

    public void refill(){
        System.out.println("Автобус можно заправлять бензином или дизелем на заправке");
    }
}
