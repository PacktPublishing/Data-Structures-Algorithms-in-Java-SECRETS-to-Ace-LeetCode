public class AmazonQuestion {
    public static void main(String[] args) {
        dice("",4);
    }
    static void dice(String output, int target){
        if (target == 0){
            System.out.println(output);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++){
            dice(output+i, target - i);
        }
    }
}
