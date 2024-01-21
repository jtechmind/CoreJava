package com.core.controlflow;

/**
 * Control flow in java
 * 1. Conditional Statements:
 *      if statement
 *      if-else statement
 *      if-else nested statements
 * 2. Switch Statement:
 * 3. Loops: for, while, do-while, Enhance for Loop (for-each)
 * 4. Jump Statements:
 *      break, continue, return
 * let's learn each of them one by one.
 */

public class ControlFlow {
    // A simple programme which is based on if-else statement.
    // Example. if a student get total marks 150 and above in two paper he will get admission.
    float paperOne = 78.22f; // out of 100
    float paperTwo = 73.71f; // out of 100

    float total = paperOne + paperTwo;

    public void checkAdmissionStatus(){
        if(total >= 150){
            System.out.println("You will get admission");
        }else{
            System.out.println("Try next time");
        }
    }

    // nested if-else statements
    // we will make a grading system. display grade on marks. Grade-A for >= 60 and less 75,Grade A+ for 75+score

    float marks = 9;
    public void gradingSystem(){
        if(marks >=75){
            System.out.println("Grade-A+");
        } else if (marks >=60) {
            System.out.println("Grade-A");
        } else if(marks >=50){
            System.out.println("Grade-B");
        }else {
            System.out.println("Grade-C");
        }
    }


    public static void main(String[] args) {
        ControlFlow controlFlow = new ControlFlow();
        controlFlow.checkAdmissionStatus();
        controlFlow.gradingSystem();
    }

}
