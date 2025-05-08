import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a fruit");
        System.out.println("Enter a number from 1-7");
//        String fruit = in.next();
        int days = in.nextInt();

//        In any programming languages you generally follow the DRY -> Do Not Repeat Yourself principle

//        if(fruit.equals("Mango")){
//            System.out.println("The king of fruits");
//        }
//        if (fruit.equals("Apple")){
//            System.out.println("An apple a day keeps a doctor away");
//        }
//        if (fruit.equals("Orange")){
//            System.out.println("Orange is citrus fruit and its very sour");
//        }
//        switch (fruit){
//            case "Mango":
//                System.out.println("The king of fruits");
//                break;
//            case "Apple":
//                System.out.println("An apple a day keeps a doctor away");
//                break;
//            case "Orange":
//                System.out.println("Orange is citrus fruit and its very sour");
//                break;
//
//            default:
//                System.out.println("Please enter some valid fruit");
//        }
//        switch (days) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }
        switch (days){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}