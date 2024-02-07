package Basics;

public class Nested_If {
	
	/*
	 Java Nested if statement
The nested if statement represents the if block within another if block. Here, the inner if block condition executes only when outer if block condition is true.

ADVERTISEMENT

ADVERTISEMENT

Syntax:

if(condition){    
     //code to be executed    
          if(condition){  
             //code to be executed    
    }    
}  
Java Nested If Statement
Example:

//Java Program to demonstrate the use of Nested If Statement.  
public class JavaNestedIfExample {    
public static void main(String[] args) {    
    //Creating two variables for age and weight  
    int age=20;  
    int weight=80;    
    //applying condition on age and weight  
    if(age>=18){    
        if(weight>50){  
            System.out.println("You are eligible to donate blood");  
        }    
    }    
}}  
Test it Now
Output:

You are eligible to donate blood
Example 2:

//Java Program to demonstrate the use of Nested If Statement.    
public class JavaNestedIfExample2 {      
public static void main(String[] args) {      
    //Creating two variables for age and weight    
    int age=25;    
    int weight=48;      
    //applying condition on age and weight    
    if(age>=18){      
        if(weight>50){    
            System.out.println("You are eligible to donate blood");    
        } else{  
            System.out.println("You are not eligible to donate blood");    
        }  
    } else{  
      System.out.println("Age must be greater than 18");  
    }  
}  }  
Test it Now
Output:

You are not eligible to donate blood
	 */

}
