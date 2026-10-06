package Test;

class Parent {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

public class Oop extends Parent {
    public static void main(String[] args) {
        Oop bb = new Oop();
        bb.setA(8);
        int ss = bb.getA();
        System.out.println(ss);
    }
}


