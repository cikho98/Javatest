package Javatest.OOday03;

public class Block {
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
        cells[0] = new Javatest.OOday03.Cell(row, col);
        cells[1] = new Javatest.OOday03.Cell(row, col + 1);
        cells[2] = new Javatest.OOday03.Cell(row, col + 2);
        cells[3] = new Javatest.OOday03.Cell(row + 1, col + 1);
    }
}

class J extends Block {
    J(int row, int col) {
        cells[0] = new Javatest.OOday03.Cell(row, col);
        cells[1] = new Javatest.OOday03.Cell(row, col + 1);
        cells[2] = new Javatest.OOday03.Cell(row, col + 2);
        cells[3] = new Javatest.OOday03.Cell(row + 1, col + 2);
    }
}

class I extends Block {
    I(int row, int col) {
        cells[0] = new Javatest.OOday03.Cell(row, col);
        cells[1] = new Javatest.OOday03.Cell(row + 1, col);
        cells[2] = new Javatest.OOday03.Cell(row + 2, col);
        cells[3] = new Javatest.OOday03.Cell(row + 3, col);
    }
}

class M extends Block {
    M(int row, int col) {
        cells[0] = new Javatest.OOday03.Cell(row, col);
        cells[1] = new Javatest.OOday03.Cell(row, col + 1);
        cells[2] = new Javatest.OOday03.Cell(row + 1, col + 1);
        cells[3] = new Javatest.OOday03.Cell(row + 2, col + 2);
    }
}
