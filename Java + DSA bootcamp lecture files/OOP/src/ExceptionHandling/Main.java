package ExceptionHandling;

public class Main {
    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Don't divide by 0");
        }
        return a/b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
//            int c = a/b;
            divide(a,b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block of code will anyway run no matter what is written in the file");
        }
    }
}
