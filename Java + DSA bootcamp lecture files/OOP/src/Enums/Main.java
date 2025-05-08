package Enums;

public class Main {
    enum Months implements A{
        January, February, March, April, May, June, July, August, September, October, November, December;
        // These are enum constants
//        Every single constant over here is public, static and final membr
        // since its final you cannot create child enums
        // type is months

        Months(){
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello, can you here me?");
        }
    }


    public static void main(String[] args) {
        Months months;
        months = Months.March;

        months.hello();

//        for (Months year : Months.values()){
//            System.out.println(year);
//        }
//        System.out.println(months);
//        System.out.println(months.ordinal());
    }
}
