package Javatest.OOday04;
public class Doo {
    public  int a;
    protected int b;
    int c;
    private int d;

    void show(){
        a=5;
        b=5;
        c=5;
        d=5;
    }
}
class Eoo{
    void show(){
        Doo o = new Doo();
        o.a=5;
        o.b=5;
        o.c=5;
//        o.d=5;
    }
}
