package Javatest.OOday04;

public class Block {
    public static void main(String[] args) {
        T t=new T(0,0);
        t.print();
    }
    Cell[] cells;
    Block() {
        cells = new Cell[4];
    }

    void drop() {
        for (int i = 0; i < cells.length; i++) {
            cells[i].row++;
        }
    }

    void moveLeft() {
        for (int i = 0; i < cells.length; i++) {
            cells[i].col--;
        }
    }

    void moveRight() {
        for (int i = 0; i < cells.length; i++) {
            cells[i].col++;
        }
    }

    void print() {
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

class T extends Block {

    T(int row, int col) {
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row, col + 2);
        cells[3] = new Cell(row + 1, col + 1);
    }
    void print(){
        System.out.println("I am a T");
        super.print();
    }
}

class J extends Block {
    J(int row, int col) {
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row, col + 2);
        cells[3] = new Cell(row + 1, col + 2);
    }

    void print(){
        System.out.println("I am a J");
        super.print();
    }
}

class I extends Block {
    I(int row, int col) {
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row + 1, col);
        cells[2] = new Cell(row + 2, col);
        cells[3] = new Cell(row + 3, col);
    }
    void print(){
        System.out.println("I am a I");
        super.print();
    }
}

class M extends Block {
    M(int row, int col) {
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row + 1, col + 1);
        cells[3] = new Cell(row + 2, col + 2);
    }
    void print(){
        System.out.println("I am a M");
        super.print();
    }
}
