package pkgs.StaticExample;

public class Main {
    public static void main(String[] args) {
//        Employee jack = new Employee("Jack Nicholson",35,105.54f,true);
//        Employee paul = new Employee("Paul Newman",45,505.54f,true);
//
////        System.out.println(jack.name);
//        System.out.println(Employee.employeeCount);
////        System.out.println(paul.employeeCount);

//        simpleTxt();
        fun();
        Main funny = new Main();
        funny.fun2();
    }
    void simpleTxt(){
        System.out.println("Hello world");
    }

     static void fun(){
        Main obj = new Main();
        obj.simpleTxt();
     }

     void fun2(){
        simpleTxt();
     }
}
