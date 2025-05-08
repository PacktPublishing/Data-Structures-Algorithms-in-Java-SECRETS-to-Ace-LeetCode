public class newtonRaphson {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n){
        double x = n;
        double root;
        while (true){
            root = (x+(n/x)) * 0.5;
            if (Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
