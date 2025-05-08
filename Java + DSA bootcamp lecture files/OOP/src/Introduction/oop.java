package Introduction;

public class oop {
    public static void main(String[] args) {
//        Employee jack = new Employee(7, "Jack Nicholson",150.50f );
//        jack.id = 7;
//        jack.name = "Jack Nicholson";
//        jack.salary = 150.50f;
//        System.out.println(jack);
//        System.out.println(jack.id);
//        System.out.println(jack.name);
//        System.out.println(jack.salary);

//        Employee paul = new Employee(10, "Paul Newman", 250.3f);
        final Employee ethan = new Employee();
        ethan.name = "Ethan Hunt";
//        ethan = jack;
    }
}

class Employee{
    int id;
    String name;
    float salary;

//    Employee(int id, String name, float salary){
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
}
