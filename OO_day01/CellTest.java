package Javatest.OO_day01;

public class CellTest {
    public static void main(String[] args) {
        Cell c = new Cell(5,3);
        c.drop();
        print(c);
        System.out.println("下移两格");
        c.down(2);
        print(c);
    }
    public static void print(Cell info){
        for (int i = 0; i < 20; i++) {  //行
            for (int j = 0; j < 10; j++) { //列
                if (i == info.row && j == info.col){
                    System.out.print("* ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.println(" "+i);
        }
    }
}
