import transport.*;
import animals.*;

public class Main {
    public static void main(String[] args) {
        //createCar();
        //createTrain();
        //createBus();
        createAnimals();
    }

    private static void createAnimals() {
        Herbivores gazel = new Herbivores("Газель", 50, "степи", 100, "трава луговая");
        Herbivores ziraf = new Herbivores("Жираф", 100, "степи", 50, "трава луговая");
        Herbivores loshad = new Herbivores("Лошадь", 40, "смешанный лес", 60, "трава луговая");

        Predator giena = new Predator("Гиена", 30, "лес", 40, "живностью");
        Predator tigr = new Predator("Тигр", 33, "лес", 40, "живностью");
        Predator mishka = new Predator("Медведь", 60, "лес", 20, "рыба");

        Amphibians lygushka = new Amphibians("Лягушка", 5, "болото");
        Amphibians uchPresnovodniy = new Amphibians("Уж пресноводный", 7, "река");

        NotFlyingBird pavlin = new NotFlyingBird("Павлин", 10, "река", "короткие взлеты над водой");
        NotFlyingBird dodo = new NotFlyingBird("Додо", 10, "река", "короткие взлеты над водой");

        FlyingBird chyka = new FlyingBird("Чайка", 3, "природа", "перелеты");
        FlyingBird albatros = new FlyingBird("Альбатрос", 5, "дикая природа", "перелеты");
        FlyingBird sokol = new FlyingBird("Сокол", 5, "дикая природа", "перелеты");

        Animals [] animals = {gazel, ziraf, loshad, giena, tigr, mishka, lygushka, uchPresnovodniy, pavlin, dodo, chyka, albatros, sokol};

        for (Animals animal : animals) {
            System.out.println(animal.getClass());
            System.out.println(animal);
        }


        for (int i = 0; i < animals.length; i++) {
            for (int j = i+1; j < animals.length; j++) {
                if (animals[i].equals(animals[j])) {
                    System.out.println("Наш животный мир не уникален! Есть клоны!");
                    break;
                }
            }
        }
    }

    private static void createBus() {
        System.out.println("Создаем автобусы:");

        Bus ikarus =  new Bus("Икарус", "марка икарус", 1980, "Россия", "красный", 90);
        System.out.println(ikarus);

        Bus skaniy =  new Bus("Скания", "марка скания", 2010, "Европа", "белый", 180);
        System.out.println(skaniy);

        Bus mers =  new Bus("Мерседес", "Мерседес Бенс", 2020, "Германия", "", 220);
        System.out.println(mers);
        mers.refill();
    }

    private static void createTrain() {
        System.out.println("Создаем поездки:");

        Train lastochka = new Train("Ласточка", "B-901", 2011, "России", "", 301,3500, 24, "Белоруссий вокзал", "Минск-Пассажирский", 11);
        System.out.println(lastochka);

        Train lenGrad = new Train("Ленинград", "D-125", 2019, "России", "", 270,1700, 2, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(lenGrad);
        lenGrad.refill();
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
        hyundai.refill();
        //Car.Key key2 = hyundai.new Key(true, false);
        //hyundai.setKey(key2);
    }
}