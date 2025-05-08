import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        /*  This is a syntax of if statement
            if(boolean expression){
            // body
            }
            else{
            // body
            }
        *
        *
        * */

        /* Add bonus of 2000 to salary greater than 20000 and add bonus of 1000 to salary greater than 10000 */
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

//        if(salary > 20000){
////            salary = salary + 2000;
//            salary += 2000;
//        }
//        else{
//            salary += 1000;
//        }

//        Multiple if-else

        if (salary > 20000){
            salary += 2000;
        } else if (salary > 10000) {
            salary += 1000;
        }
        else{
            salary += 500;
        }

        System.out.println(salary);
    }
}