package com.name;

import java.util.Scanner;
class NameExcpt extends Exception
{
    public NameExcpt()
    {
        super("The name you've entered is not valid");
    }
}
public class NameValidity {

        public static void main(String[]args){

            Scanner sc = new Scanner (System.in);
            System.out.println("Enter your first name");
            String a = sc.nextLine();

            System.out.println("Enter your last name");
            String b = sc.nextLine();

            try{
                if(a=="" || b==""){
                    throw new NameExcpt();
                }
            }
            catch(NameExcpt ex){
                System.out.println("You entered an invalid name");
                System.exit(0);
            }
            finally{
                System.out.println("Your name is " + a + " " + b);
            }
        }

}
