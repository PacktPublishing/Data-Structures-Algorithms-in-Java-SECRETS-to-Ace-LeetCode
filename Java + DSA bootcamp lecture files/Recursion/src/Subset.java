import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
//        subsequence("","abc");
        System.out.println(subseqArr("","abc"));
    }
    static void subsequence(String ans, String inp){
        if (inp.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = inp.charAt(0);
        subsequence(ans + ch, inp.substring(1));
        subsequence(ans, inp.substring(1));
    }

    // Displaying result in the form of ArrayList
    static ArrayList<String> subseqArr(String ans, String inp){
        if (inp.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = inp.charAt(0);
        ArrayList<String> takeIt = subseqArr(ans+ch, inp.substring(1));
        ArrayList<String> leaveIt = subseqArr(ans, inp.substring(1));
        takeIt.addAll(leaveIt);
        return takeIt;
    }
}
