package pkgs.StaticExample;

public class Employee {
    String name;
    int age;
    float salary;
    boolean isMale;
    static long employeeCount;

    static void msg(){
        System.out.println("Hello World");
//        System.out.println(this.age);
    }

    public Employee(String name, int age, float salary, boolean isMale) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMale = isMale;
        Employee.employeeCount += 1;
    }
}
