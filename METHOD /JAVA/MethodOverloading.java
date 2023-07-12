package JAVA;

public class MethodOverloading {
    public static void myMethod(int num) {
        System.out.println("Integer: " + num);
    }

    public static void myMethod(String str) {
        System.out.println("String: " + str);
    }

    public static void main(String[] args) {
        myMethod(123);        // Integer: 123
        myMethod("Hello");    // String: Hello
    }
}

