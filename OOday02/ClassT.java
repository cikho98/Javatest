package Javatest.OOday02;

public class ClassT {
    Cell[] cells;
    ClassT(){
        this(0,0);
    }
    ClassT(int row,int col){
        cells=new Cell[4];
        cells[0] = new Cell(row,col);
        cells[1] = new Cell(row,col+1);
        cells[2] = new Cell(row,col+2);
        cells[3] = new Cell(row+1,col+1);
    }

    void drop(){
        for (int i = 0; i < cells.length; i++) {
            cells[i].row++;
        }
    }

    void moveLeft(){
        for (int i = 0; i < cells.length; i++) {
            cells[i].col--;
        }
    }

    void  moveRight(){
        for (int i = 0; i < cells.length; i++) {
            cells[i].col++;
        }
    }


    void print(){
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
