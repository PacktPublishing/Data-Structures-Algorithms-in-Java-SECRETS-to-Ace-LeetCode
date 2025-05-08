package ComparisonOfObjects;

public class Main {
    public static void main(String[] args) {
        Student joe = new Student(12, 89.76f);
        Student tom = new Student(8,99.85f);

        if (joe.compareTo(tom) < 0){
            System.out.println("Tom has score more marks");
        }
    }
}
