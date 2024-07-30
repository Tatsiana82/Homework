package Lesson_2;

//Lesson_2 Task_1
public class Employee {

    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String name, String email, String position,
                    int phone, int salary, int age) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInformationEmployee() {
        System.out.println("Information:\n" + "Name: " + name + ";\nPosition: " + position +
                ";\nEmail: " + email + ";\nPhone: " + phone + ";\nSalary: " + salary + ";\nAge: " + age + ".");
    }
    //Lesson_2 Task_2
    public static void main(String[] args) {
        Employee empl = new Employee("Karnilava  Tatsiana Uladzimirauna", "karnilava@gmail.com",
                "librarian",11111111, 1000, 40);
        empl.printInformationEmployee();


        Employee empl1 = new Employee("Kuznetskaya Iryna Igarauna", "kuzn@mail.com",
                "QA engineer",2222222, 2000, 30);
        empl1.printInformationEmployee();
        System.out.println("------------------------");

        Employee empl2 = new Employee("Kuznetsky Michail Ivanavich", "mihkuzn@gmail.com",
                "Java developer",3333333, 5000, 43);
        empl2.printInformationEmployee();
        System.out.println("------------------------");

        Employee empl3 = new Employee("Salavey Taisiya Lvouna", "sol@gmail.com",
                "HR",4444444, 3000, 27);
        empl3.printInformationEmployee();
        System.out.println("------------------------");

        Employee empl4 = new Employee("Razumovich Ivan Ivanavich", "razum@gmail.com",
                "Python developer",5555555, 5100, 29);
        empl4.printInformationEmployee();
        System.out.println("------------------------");


        Employee[] emplArray = new Employee[5];

        emplArray[0] = new Employee("Karnilava  Tatsiana Uladzimirauna", "karnil@gmail.com",
                "librarian",11111111, 1000, 40);
        emplArray[1] = new Employee("Kuznetskaya Iryna Igarauna", "kuzn@mail.com",
                "QA engineer",2222222, 2000, 30);
        emplArray[2] = new Employee("Kuznetsky Michail Ivanavich", "mihkuzn@gmail.com",
                "Java developer",3333333, 5000, 43);
        emplArray[3] = new Employee("Salavey Taisiya Lvouna", "sol@gmail.com",
                "HR",4444444, 3000, 27);
        emplArray[4] = new Employee("Razumovich Ivan Ivanavich", "razum@gmail.com",
                "Python developer",5555555, 5100, 29);

    }
}