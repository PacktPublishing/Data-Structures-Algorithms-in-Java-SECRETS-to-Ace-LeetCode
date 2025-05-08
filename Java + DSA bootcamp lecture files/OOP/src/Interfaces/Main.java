package Interfaces;

public class Main {
    public static void main(String[] args) {
        Daughter ilsa = new Daughter();
        Mother grace = new Daughter();
//        ilsa.display();
//        ilsa.msg();
//        grace.msg();


        Son benji = new Son();
        benji.msgFromMom();
        benji.msgFromDad();

    }
}
