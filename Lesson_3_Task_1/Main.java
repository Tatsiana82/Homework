package Lesson_3_Task_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Cat[] cats = new Cat[1];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }

        Cat[] cat2s = new Cat[1];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }

        Cat[] cat3s = new Cat[1];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }

        Plate plate = new Plate(50);

        for (Cat cat : cats) {
            cat.eat(plate, 10);
        }
        System.out.println("Cat_1:");
        System.out.println("Cat Murzik satiety:");
        for (Cat cat : cats) {
            System.out.println("Cat Murzik is " + (cat.isFull() ? "well_fed" : "hungry"));
        }

        for (Cat cat : cats) {
            cat.eat(plate, 15);
        }

        System.out.println("-----------------------------");

        System.out.println("Cat_2:");
        System.out.println("Cat Barsik satiety:");
        for (Cat cat : cats) {
            System.out.println("Cat Barsik is " + (cat.isFull() ? "well_fed" : "hungry"));
        }

        for (Cat cat : cats) {
            cat.eat(plate, 2);
        }
        System.out.println("-----------------------------");

        System.out.println("Cat_3:");
        System.out.println("Cat Kesha satiety:");
        for (Cat cat : cats) {
            System.out.println("Cat Kesha is " + (cat.isFull() ? "well_fed" : "hungry"));
        }

        for (Cat cat : cats) {
            cat.eat(plate, 6);
        }

        System.out.println("-----------------------------");

        plate.addFood(12);
        System.out.println("There is some food left in the plate: " + plate.getFood());

        System.out.println("Total number of created animals: " + Animal.getAnimalCount());
    }
}