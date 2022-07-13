package com.cg.eis.exception;

import java.util.Scanner;


class SalaryExcpt extends Exception {

    public SalaryExcpt() {
        super("The Salary you've entered is not valid");
    }
}
public class EmployeeException {


    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter employee salary");
        int a = sc.nextInt();

        try{
            if(a<3000){
                throw new com.cg.eis.exception.SalaryExcpt();
            }
        }
        catch(com.cg.eis.exception.SalaryExcpt ex){
            System.out.println("You've entered an invalid number");
            System.exit(0);
        }
        finally{
            System.out.println("Employee salary is " + a);
        }
    }
}