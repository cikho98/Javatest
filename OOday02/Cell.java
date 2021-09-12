package Javatest.OOday02;

public class Cell {
    int row;//行
    int col;//列
    Cell[] cells;
    Cell(int row,int col){
        this.row=row;
        this.col=col;
    }
    Cell(int n){
        this(n,n);
    }

    Cell(){
        this(0,0);
    }

    void drop(){
        row++;
    }
    void moveLeft(int n){
        col -= n;
    }
    void moveRight(int n){
        col += n;
    }
    void down(int n){
       row += n;
    }

    void print(Cell[] cells) {
        for (int i = 0; i < 20; i++) {  //行
            for (int j = 0; j < 10; j++) { //列
                for (int k = 0; k < cells.length; k++) {
                    if (i == cells[k].row && j == cells[k].col) {
                        System.out.print("* ");
                        j++;
                    }
                }
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
