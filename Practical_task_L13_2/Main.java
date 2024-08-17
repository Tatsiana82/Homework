package Practical_task_L13_2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Karnilava", "111 11 11");
        phoneBook.add("Kuznetskiy", "222 22 22");
        phoneBook.add("Karnilava", "333 33 33");
        phoneBook.add("Kuznetskiy", "222 22 45");
        phoneBook.add("Salavey", "555 55 55");

        System.out.println("Karnilava family phones :");
        ArrayList<String> karnilavaNumbers = phoneBook.get("Karnilava");
        for (String number : karnilavaNumbers) {
            System.out.println(number);
        }
        System.out.println("Kuznetskiy family phones:");
        ArrayList<String> kuznetskiyNumbers = phoneBook.get("Kuznetskiy");
        for (String number : kuznetskiyNumbers) {
            System.out.println(number);
        }
        System.out.println("Salavey family phones:");
        ArrayList<String> salaveyNumbers = phoneBook.get("Salavey");
        for (String number : salaveyNumbers) {
            System.out.println(number);
        }
    }
}