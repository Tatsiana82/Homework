package Lesson_3_Task_1;
public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void addFood(int amount) {
        if (amount <= 0) {
            System.out.println("The amount of food must be positive");
            return;
        }
        food += amount;
    }

    public int getFood() {
        return food;
    }
}