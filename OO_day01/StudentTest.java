package Javatest.OO_day01;

public class StudentTest {
    public static void main(String[] args) {
        Student zs = new Student();
        zs.name="张三";
        zs.age = 16;
        zs.address = "广州";
        zs.study();
        zs.eat();
        zs.SayHi();
        System.out.println();
        Student ls = new Student();
        ls.name="李四";
        ls.age = 14;
        ls.address = "北京";
        ls.study();
        ls.eat();
        ls.SayHi();
    }
}
