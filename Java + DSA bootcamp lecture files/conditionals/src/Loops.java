import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /* syntax of for loop
            for(intialization; condition; updation){
                // body
            }
        * */

        // Print "Hello world" 5 times
//        for (int i=1; i<=5; i++){
//            System.out.println("Hello World");
//        }

//        Print numbers from 1 to n
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        for (int i=1; i<=n; i++){
//            System.out.println(i);
//        }

        /* The syntax of while loop
        *   while(condition){
        *       // body
        *   }
        *  */

        // Print the numbers from 1 to 5
//
//        int num = 1;
//        while(num <= 5){
//            System.out.println(num);
////            num += 1;
//            num++;
//        }

        /*
            The syntax of do while loop
            do {
                // body
            }while(condition);
         */

//        Print the text "Hello World" 5 times
        int num = 1;
        do{
            System.out.println("Hello World");
            num++;
        }while (num <= 5);
    }
}
