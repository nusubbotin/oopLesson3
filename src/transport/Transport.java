package transport;

public class Transport {
    protected String brand;
    protected String model;
    protected int productionYear;
    protected String productionCountry;
    protected String color;
    protected int speed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int speed) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        }else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        }else {
            this.model = model;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        }else {
            this.productionCountry = productionCountry;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }
        setColor(color);
        setSpeed(speed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        }else {
            this.color = color;
        }
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Скорость должен быть положительным целым числом");
        }else {
            this.speed = speed;
        }
    }

}
