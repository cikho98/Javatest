package Javatest.OOday04;

public class StaticDemo {
    public static void main(String[] args) {
//        Hoo h1=new Hoo();
//        h1.show();
//        Hoo h2=new Hoo();
//        h2.show();
        Joo j1=new Joo();
        Joo j2=new Joo();
    }
}
class Joo{
    Joo(){
        System.out.println("jjjjj");
    }
    static {
        System.out.println("加载一次的静态方法");
    }
}
class Hoo{
    int a;
    static int b;
    Hoo(){
        a++;
        b++;
    }
    void show(){
        System.out.println(a);
        System.out.println(b);
    }
}