package Javatest.day05;

public class Muil {
    public static void main(String[] args) {
        for (int n=1;n<=9;n++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "*" + n + "=" + i * n + "\t");
            }
            System.out.println();
        }
    }
}
