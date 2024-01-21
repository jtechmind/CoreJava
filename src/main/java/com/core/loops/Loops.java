package com.core.loops;

public class Loops {

    // While condition is true execute the statement.
    public void whileLoop(){

        int studyTime = 0;
        while (studyTime<5){
            System.out.println("keep studying.");
            // increment studyTime by 1
            studyTime = studyTime + 1;
        }
        System.out.println("You can take a break now,you study time: "+studyTime);

    }
    public void doWhileLoop(){

    }
    public void forLoop(){

    }

    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.whileLoop();
    }
}
