package transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {

    public static final String CAT_TIRES_SUMMER = "летние";
    public static final String CAT_TIRES_WINTER = "зимние";

    private float engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String carTires;

    private Key key;

    private Insurance insurance;


    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String carTires, int speed) {
        super(brand, model, productionYear, productionCountry, color, speed);

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        }else {
            this.bodyType = bodyType;
        }

        if (numberOfSeats == 0) {
            this.numberOfSeats = 5;
        }else {
            this.numberOfSeats = numberOfSeats;
        }

        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setCarTires(carTires);
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getCarTires() {
        return carTires;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        }else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "автомат";
        }else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            throw new IllegalArgumentException("Регистрационный номер не может быть пустым");
        } else if (!checkRegNumFormat(registrationNumber)) {
            System.out.println("Регистрационный номер " + registrationNumber + " имеет не корректный формат. Допустимый формат х000хх000");
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setCarTires(String carTires) {
        if (carTires == null || carTires.isEmpty()) {
            this.carTires = CAT_TIRES_SUMMER;
        } else if (carTires != CAT_TIRES_SUMMER && carTires != CAT_TIRES_WINTER) {
            throw new IllegalArgumentException("Колеса может быть или \""+CAT_TIRES_SUMMER+"\" или \""+CAT_TIRES_WINTER+"\"");
        } else {
            this.carTires = carTires;
        }
    }

    public void setKey(Key key) {
        if (this.key == null) {
            this.key = key;
        }else {
            throw new IllegalArgumentException("Параметры ключа уже установлены. Изменять запрещено!");
        }
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void changeTires() {
        if (this.carTires == CAT_TIRES_SUMMER) {
            this.carTires = CAT_TIRES_WINTER;
        }else if (this.carTires == CAT_TIRES_WINTER) {
            this.carTires = CAT_TIRES_SUMMER;
        }
    }

    public boolean checkRegNumFormat(String registrationNumber){
        Matcher m = Pattern.compile("[a-z](\\d){3}([a-z]){2}(\\d){3}").matcher(registrationNumber);
        return m.find();
    }

    @Override
    public String toString() {
        return "Бренд: "+ this.brand
                + "; Модель: " + this.model
                + "; Объем двигателя: " + this.engineVolume
                + "; Цвет кузова: " + this.color
                + "; Год производства: " + this.productionYear
                + "; Страна сборки: " + this.productionCountry
                + "; Коробка передач: " + this.transmission
                + "; Тип кузова: " + this.bodyType
                + "; Регистрационный номер: " + this.registrationNumber
                + "; Количество мест: " + this.numberOfSeats
                + "; Тип резины: " + this.carTires
                + "; Скорость: " + this.speed
                + "; Сведения о страховке: (" + this.insurance + ")";
    }

    public void refill(){
        System.out.println("Автомобиль можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
    }

    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }

    public class Insurance {
        private int validityYear;
        private float price;
        private String number;

        public Insurance(int validityYear, float price, String number) {
            if (validityYear <= 0) {
                throw new IllegalArgumentException("Срок действия должен быть положительным целым числом");
            }else {
                this.validityYear = validityYear;
            }

            if (price <= 0) {
                throw new IllegalArgumentException("Стоимость должена быть положительным числом");
            }else {
                this.price = price;
            }

            if (number == null || number.isEmpty()) {
                throw new IllegalArgumentException("Номер страховки доджен быть заполнен");
            } else if (!checkNumberLength(number)) {
                throw new IllegalArgumentException("Номер страховки должен состоять из 9 символов");
            } else {
                this.number = number;
            }
        }

        private boolean checkNumberLength(String number){
            if (number != null && number.length() != 9){
                return false;
            }else {
                return true;
            }
        }

        public void  checkExpired() {
            if (this.validityYear >= LocalDate.now().getYear()){
                System.out.println("Срочно ехать оформлять новую страховку!");
            }
        }

        @Override
        public String toString() {
            return  "validityYear= " + validityYear +
                    ", price= " + price +
                    ", number= " + number;
        }
    }
}
