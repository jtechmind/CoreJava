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

        // do something at least once, even if the condition false.
        int x = 0;

        do{
            System.out.println("Do Something.");
            x = x + 1;
        }while (x < 0);


    }
    public void forLoop(){
        // perform iteration/
        for(int i = 0;i <3; i++){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.whileLoop();
        loops.doWhileLoop();
        loops.forLoop();
    }
}
