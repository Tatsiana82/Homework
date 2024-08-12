package Lesson_3_Task_1;
public class Cat extends Animal {
    private boolean full;

    public Cat() {
        run = 200;
        swim = 0;
        full = false;
    }

    public void eat(Plate plate, int amount) {
        if (amount <= 0) {
            System.out.println("The amount of food must be positive");
            return;
        }
        if (amount <= plate.getFood()) {
            plate.decreaseFood(amount);
            full = true;
            System.out.println("The cat ate");
        } else {
            System.out.println("There is not enough food in the plate");
        }
    }

    public boolean isFull() {
        return full;
    }
}