package main.java;

public class Main {


    public static int multiply(int x, int y) {
        // the following is just an example
        if (x > 999) {
            throw new IllegalArgumentException("X should be less than 1000");
        }
        return x * y;
    }
    public static void main(String[] args) {
        System.out.println(multiply(50,10));
    }
}
