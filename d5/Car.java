package d5;

public class Car {
    // 총 도로를 달리고 있는 자동차의 갯수
    private static int count = 0;
    private String brand;
    private String name;
    private int fuel;

    // 생성자 : 객체를 만들때 호출되는 메서드
    public Car() {
        count++;
        this.name = "Sonata";
        this.brand = "Hyundai";
        this.fuel = 72;
    }
    public Car(String name, String brand, int fuel) {
        count++;
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    // 클락션을 울리는 기능
    public void beep() {
        System.out.println("빠아아아앙");
    }
    // 가진 정보를 출력하는 기능
    public void printInfo() {
        System.out.println(String.format("name:\t%s", name));
        System.out.println(String.format("brand:\t%s", brand));
        System.out.println(String.format("fuel:\t%d", fuel));
    }
    // 특정 거리를 이동하는 기능
    public void drive(int kilo) {
        fuel -= kilo / 2;
        System.out.println(String.format("Moved: %d km, Fuel: %d", kilo, fuel));
    }
}
