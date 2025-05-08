import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
//        permutation("","abc");
        ArrayList<String> ans = permutationArr("","abc");
        System.out.println(ans);
    }


    static void permutation(String ans, String inp){
        if (inp.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = inp.charAt(0);

        for (int i = 0; i <= ans.length(); i++){
            String first = ans.substring(0,i);
            String second = ans.substring(i,ans.length());
            permutation(first + ch + second, inp.substring(1));
        }
    }

    // Displaying the output in the form of ArrayList
    static ArrayList<String> permutationArr(String ans, String inp){
        if (inp.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = inp.charAt(0);

        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i <= ans.length(); i++){
            String first = ans.substring(0,i);
            String second = ans.substring(i,ans.length());
            output.addAll(permutationArr(first + ch + second, inp.substring(1)));
        }
        return output;
    }
}
