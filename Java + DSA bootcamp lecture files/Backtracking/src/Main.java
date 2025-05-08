public class Main {
    public static void printPermutation(String str, String output){
        if (str.length() == 0){
            System.out.println(output);
            return;
        }

        for (int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newStr, output+currChar);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str,"");
    }
}