import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        String name = "Prerak Mehta";
//
//        String a = "DSA";
//        System.out.println(a);
//        a = "JAVA";
//        System.out.println(a);

//        String a = "DSA";
//        String b = "DSA";

//        String a = new String("dSA");
//        String b = new String("DSA");
////        System.out.println(a == b);
//        System.out.println(a.equals(b));

        float a = 597.3210f;
//        System.out.printf("Formatted number is %.2f",a);
//        System.out.printf("Pie value is %.3f",Math.PI);

//        System.out.printf("Hello I am %s & I am teaching %s", "Prerak", "Data Structures and Algorithms using Java");

        // String concatenation operator
        // System.out.println('a' + 'b'); // ASCII value added
      //  System.out.println("a" + "b"); // string values are being concatenated
//        System.out.println((char)('a' + 3));
//        System.out.println("a" + 1);

        // String performance
//        String series = " ";
//        for (int i = 0; i < 26; i++){
//            char ch = (char)('a' + i);
//            series = series + ch; // series += ch;
//        }
//        System.out.println(series);

//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 26; i++){
//            char ch = (char)('a' + i);
//           builder.append(ch);
//        }
//        System.out.println(builder.toString());

        // String Methods
        String name = "Prerak Mehta";
        System.out.println((Arrays.toString(name.toCharArray())));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('k'));
        System.out.println("    DSA      ".strip()); // removes blanks spaces
        System.out.println(Arrays.toString(name.split(" ")));
    }
}