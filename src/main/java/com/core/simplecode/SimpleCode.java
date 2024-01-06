package com.core.simplecode;

public class SimpleCode {
    /**
     * Local Variable: A local variable in Java is a variable that's declared within the body of a method.
     *--
     * Instance Variable: Instance variables in Java are non-static variables which are defined in a class
     * outside any method, constructor or a block.
     * Each instantiated object of the class has a separate copy or instance of that variable.
     * An instance variable belongs to an object(instance of the class).
     *--
     * Static Variable: When a variable is declared static in Java programming,
     * it means that the variable belongs to the class itself rather than to any specific instance of the class.
     * This means that there is only one copy of the variable in memory,
     * regardless of how many instances of the class are created.
     * a static variable belongs to a class.
     */

    //static variable, it can access without an object.
    static int numOne = 55;
    int score = 99;



    public static void main(String[] args) {
        // static variable accessed directly, no need to create an object.
        System.out.println("Value of static numOne: "+numOne);

        // Object of SimpleCode class
        SimpleCode simpleCode = new SimpleCode();

        // To access non-static variable we need to create an object.
        // only static member can be directly access in main method.
        System.out.println(simpleCode.score);

    }


}
