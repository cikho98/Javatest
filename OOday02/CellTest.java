package Javatest.OOday02;

public class CellTest {
    public static void main(String[] args) {
        ClassT t= new ClassT(0,0);
        t.print();
        System.out.println("下落");
        t.drop();
        t.print();
        System.out.println("右移");
        t.moveRight();
        t.print();
    }

}
