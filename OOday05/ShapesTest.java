package Javatest.OOday05;

public class ShapesTest {
    public static void main(String[] args) {
        Shapes[] shapes=new Shapes[2];
        shapes[0]=new Circle(4);
        shapes[1]=new Circle(5);
        maxArea(shapes);
    }
    public static void maxArea(Shapes[] shapes){
        double max=shapes[0].Area();
        int index=0;
        for (int i = 0; i < shapes.length; i++) {
            double area=shapes[i].Area();
            if (area>max){
                max=area;
                index=i;
            }
        }
        System.out.println("最大面值是："+max);

    }
}

abstract class Shapes{
    double c;
    abstract double Area();
}

class Circle extends Shapes{
    Circle(double c){
        this.c=c;
    }
    double Area(){
        return 0.0769*c*c;
    }
}