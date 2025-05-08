import java.util.Scanner;

public class problems {
    public static void main(String[] args) {
// Problem 1:        Find the largest of 3 numbers
        /*
        int max = a;
        if max > b:
        max = b;

        if max > c:
        max = c;

        a = 10
        b = 20
        c = 30
         */
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int max = a;
//
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);

//        Problem 2: Alphabet case check
//        Scanner input = new Scanner(System.in);
//        char ch = input.next().trim().charAt(0);
//
//        if (ch == 'a' && ch == 'z'){
//            System.out.println("Lowercase");
//        }
//        else {
//            System.out.println("Uppercase");
//        }

//        Problem 3: Find out number of occurances of 7 in 17987657
//         int n = 17987657;
//         int count = 0;
//         while(n > 0){
//             int remainder = n % 10;
//             if (remainder == 7){
//                 count++;
//             }
//             n = n / 10;
//         }
//        System.out.println(count);

//        Problem 4: Reverse the number
//        Example:  n = 1 2 3 4 5       ans = 5 4 3 2 1
        /*
              ans =  n % 10
              n = n / 10
              ans = ans * 10 + n
         */

//        int n = 56165156;
//        int ans = 0;
//
//        while(n > 0){
//            int remainder = n % 10;
////            n = n / 10;
//                n /= 10;
//                ans = ans * 10 + remainder;
//        }
//        System.out.println(ans);

//        Problem 5: Build a calculator, this calculator can perform + - * / % and keep on running this program till the user enters the 'x' key

        Scanner input = new Scanner(System.in);
        int ans = 0;

        while (true) {
            char ch = input.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (ch == '+') {
                    ans = num1 + num2;
                }
                if (ch == '-') {
                    ans = num1 - num2;
                }
                if (ch == '*') {
                    ans = num1 * num2;
                }
                if (ch == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (ch == '%') {
                    ans = num1 % num2;
                } else if (ch == 'x' || ch == 'X') {
                    break;
                } else {
                    System.out.println("Invalid operation");
                }
            }
            System.out.println(ans);

        }
    }
}
