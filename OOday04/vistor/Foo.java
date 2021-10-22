package Javatest.OOday04.vistor;
import Javatest.OOday04.Doo;

public class Foo {
    void show(){
        Doo o=new Doo();
        o.a=5;
//        o.b=5;
//        o.c=5;
//        o.d=5;
    }
}
class Goo extends Doo{
    void show(){
        a=5;
        b=5;
//        c=5;
//        d=5;
    }
}