import java.util.ArrayList;

public class GoogleQuestion {
    public static void main(String[] args) {
        System.out.println(keypad("","23"));
    }
    static ArrayList<String> keypad(String ans, String inp){
        if (inp.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        int digit = inp.charAt(0) - '0';
        int i = (digit - 2) * 3;
        if(digit > 7){
            i += 1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9){
            len += 1;
        }
        ArrayList<String> list = new ArrayList<>();
        for (; i < len; i++){
            char ch = (char)('a' + i);
            list.addAll(keypad(ans + ch, inp.substring(1)));
        }
        return list;
    }
}
