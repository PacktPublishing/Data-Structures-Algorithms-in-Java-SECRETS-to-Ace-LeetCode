public class StringsUsingRecursion {
    public static void main(String[] args) {
//        System.out.println(skip("abcabc"));
        System.out.println(skipStr("superhero"));
    }

    static String skip(String inp){
        if (inp.isEmpty()){
            return "";
        }
         char ch = inp.charAt(0);

        if (ch == 'c'){
            return skip(inp.substring(1));
        } else {
            return ch + skip(inp.substring(1));
        }
    }

    // Skip the word 'super'
    static String skipStr(String inp){
        if (inp.isEmpty())
        {
            return "";
        }
        if (inp.startsWith("super")){
            return skipStr(inp.substring(5));
        } else{
            return inp.charAt(0) + skipStr(inp.substring(1));
        }
    }
}
