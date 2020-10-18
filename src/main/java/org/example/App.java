package org.example;

/**
 * Hello world!
 */
public class App {

    public static void main( String[] args ) {
        ClassLoader classLoader = App.class.getClassLoader(); // 클래스 로더
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }

}
