package Javatest.OO_day01;

public class Student {
    String name;
    int age;
    String address;
    void study(){
        System.out.println(name+"正在"+address+"学习");
    }
    void eat() {
        System.out.println(name+"正在"+address+"吃饭");
    }
    void SayHi(){
        System.out.println(name+"在"+address+"跟你说今年"+age+"岁了");
    }
}
