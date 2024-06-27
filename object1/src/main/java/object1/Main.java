//package object1;

import java.sql.SQLOutput;
import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person John = new Person("John", 30, 180);
        System.out.println(John.age);

        Person Will = new Person("Will", 25, 170);
        System.out.println(Will.name);

        Car myCar = new Car("mazda", "mazda6", 2016, 102200);
        myCar.setMileage(105252);
        myCar.getMileage();
        System.out.println(myCar.getMileage());

        Chair newChair = new Chair("wood", "brown", 4);
        newChair.getColor();
        newChair.getMaterial();
        newChair.getLegs();
        System.out.println("The " + newChair.getColor() + " chair has " + newChair.getLegs() + " legs and is made of " + newChair.getMaterial() + ".");

        PersonArray [] people;
        people = new PersonArray[10];

        PersonArray person1 = new PersonArray("Tim", 31);
        PersonArray person2 = new PersonArray("Bob", 25);

        people[0] = person1;
        people[1] = person2;

        PersonArray PersonArray = people[0];
        System.out.println(PersonArray);
    }
}

