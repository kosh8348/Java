package d5;

import java.util.Scanner;

public class Main {
    /*
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
//        scanner.nextLine();
        Car myCar = new Car();
        Car.count += 1;
        myCar.brand = "kia";
        myCar.name = "K5";
        myCar.fuel = 72;
        myCar.printInfo();
        myCar.beep();
        myCar.drive(10);
        // 1.
        System.out.println(myCar.count);

        Car car = new Car();
        Car.count += 1;
        car.brand = "Hyundai";
        car.name = "Sonata";
        car.fuel = 80;
        car.printInfo();
        // 2.
        System.out.println(car.count);

        Car someCar = new Car();
        Car.count += 1;
        someCar.name = "K3";
        someCar.brand = "kia";
        someCar.fuel = 60;
        someCar.printInfo();

        // ??????
        someCar.brand = "Mercedes-Benz";
        someCar.name = "E-Class";
        someCar.printInfo();
    }
}
     */
    public static void main(String[] args) {
        Car someCar = new Car("K5", "Kia", 72);
//       someCar.name = "K5";
//       someCar.brand = "Kia";
//        someCar.fuel = 72;
        System.out.println(someCar.getBrand());
        someCar.printInfo();
        someCar.setFuel(100);
        someCar.printInfo();

        Car sonata = new Car();
        sonata.setFuel(140);
        sonata.printInfo();

        Person me = new Person("seunghyun");
        for (int i = 0; i < 40; i++) {
            me.age();
        }
        System.out.println(me.getAge());
        me.sayHello();


        // ????
//        someCar.name = "E-Class";
//        someCar.brand = "Mercedes-Benz";
//        someCar.printInfo();
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
        refuel(someCar);
    }

    public static void refuel(Car car) {
        car.setFuel(150000);
    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}

