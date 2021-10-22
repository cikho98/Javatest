package Javatest.OO_day01;

public class Cell {
    int row;//行
    int col;//列

    Cell(){
        this(0,0);
    }

    Cell(int n){
        this(n,n);
    }

    Cell(int row, int col) {
        this.row=row;
        this.col=col;
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
}
