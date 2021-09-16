package Javatest.OOday03;


public class CellTest {
    public static void main(String[] args) {
        T t = new T(0, 0);
        I i = new I(10,5);
        t.print();
        System.out.println("下落");
        t.drop();
        t.print();
        System.out.println("右移");
        t.moveRight();
        t.print();
    }

}
