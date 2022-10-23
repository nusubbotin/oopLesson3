import transport.Car;

public class Main {
    public static void main(String[] args) {
        createCar();
    }

    private static void createCar() {
        System.out.println("Создаем автопарк:");

        Car ladaGranta = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "России","механика", "внедорожник", "v123vv123", 4, Car.CAT_TIRES_SUMMER, 160);
        Car.Insurance insurance = ladaGranta.new Insurance(2025, 5000, "123456789");
        ladaGranta.setInsurance(insurance);
        System.out.println(ladaGranta);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германия","механика", "внедорожник", "n123nn123", 4, Car.CAT_TIRES_SUMMER, 220);
        Car.Insurance audiInsurance = audi.new Insurance(2024, 10_000, "123456788");
        audi.setInsurance(audiInsurance);
        System.out.println(audi);

        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германия","механика", "внедорожник", "t123tt123", 4, Car.CAT_TIRES_SUMMER, 230);
        Car.Insurance bmwInsurance = bmw.new Insurance(2024, 10_000, "123456777");
        bmw.setInsurance(bmwInsurance);
        System.out.println(bmw);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея","механика", "внедорожник", "5123fg123", 4, Car.CAT_TIRES_SUMMER, 180);
        Car.Insurance kiaInsurance = kia.new Insurance(2023, 3000, "023456788");
        kia.setInsurance(kiaInsurance);
        System.out.println(kia);

        Car hyundai = new Car("", "", 0, "", 0, "","механика", "внедорожник", "q123er123", 4, Car.CAT_TIRES_SUMMER, 180);
        Car.Insurance hyundaiInsurance = hyundai.new Insurance(2024, 2000, "123456666");
        hyundai.setInsurance(hyundaiInsurance);
        System.out.println(hyundai);

        hyundai.changeTires();
        System.out.println("hyundai.getCarTires() = " + hyundai.getCarTires());

        Car.Key key = hyundai.new Key(true, true);
        hyundai.setKey(key);

        //Car.Key key2 = hyundai.new Key(true, false);
        //hyundai.setKey(key2);
    }
}