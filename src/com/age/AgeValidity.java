package com.age;

import java.util.Scanner;
class AgeExcpt extends Exception {

    public AgeExcpt() {
        super("The Age you've entered is not valid");
    }
}

public class AgeValidity {
    public static void main(String[]args){

        Scanner age = new Scanner (System.in);
        System.out.println("Enter your age");
        int a = age.nextInt();

        try{
            if(a<16){
                throw new AgeExcpt();
            }
        }
        catch(AgeExcpt ex){
            System.out.println("You entered an invalid number");
            System.exit(0);
        }
        finally{
            System.out.println("Your age is " + a);
        }
    }
}