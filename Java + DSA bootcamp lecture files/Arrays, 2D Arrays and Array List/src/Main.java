import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void modify(int [] arr){
        arr[0] = 55;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int student1 = 5;
//        int student2 = 15;
//        int student3 = 12;
//        int student4 = 20;
//        int student5 = 25;

        // syntax
        // datatype[] variable_name = new datatype[size];

//        int[] rollno = new int[5];
//        System.out.println(rollno[3]);
//        rollno[0] = 5;
//        rollno[1] = 12;
//        rollno[2] = 15;
//        rollno[3] = 20;
//        rollno[4] = 25;


//
//        for (int i=0; i<=rollno.length-1; i++){
//            rollno[i] = in.nextInt();
//        }


//        for (int i=0; i<=rollno.length-1; i++){
//            System.out.print(rollno[i] + " ");
//        }

//        System.out.println(Arrays.toString(rollno));


//        String[] arr = new String[5];
//        System.out.println(arr[2]);

        // OR

//        int[] rollno = {5,15,12,20,25,30,40};

        int[] nums = {3,5,7,9,11};
        System.out.println(Arrays.toString(nums));
        modify(nums);
        System.out.println(Arrays.toString(nums));
    }
}