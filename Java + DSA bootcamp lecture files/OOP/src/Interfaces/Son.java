package Interfaces;

public class Son {
    private Supermom mom;
    private Superdad dad = new Superdad();

    public Son() {
        mom = new Supermom();
    }

    public Son(Supermom mom) {
        this.mom = mom;
    }

    public void msgFromMom(){
        mom.msg();
    }

    public void msgFromDad(){
        dad.msg();
    }


}
