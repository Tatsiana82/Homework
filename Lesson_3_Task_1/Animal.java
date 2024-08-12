package Lesson_3_Task_1;
public class Animal {

    protected int swim;
    protected int run;

    private static int animalCount = 0;
    public Animal() {
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= run) {
            System.out.println(getClass().getSimpleName() + " run " + distance + " m");
        } else {
            System.out.println(getClass().getSimpleName() + " cant run " + distance + " m");
        }
    }

    public void swimLimit(int distance) {
        if (distance <= swim) {
            System.out.println(getClass().getSimpleName() + " swim " + distance + " m");
        } else {
            System.out.println(getClass().getSimpleName() + " cant swim " + distance + " m");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}