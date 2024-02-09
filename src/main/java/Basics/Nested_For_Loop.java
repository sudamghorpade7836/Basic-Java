package Basics;

public class Nested_For_Loop {

	/*
	 Java Nested for Loop
If we have a for loop inside the another loop, it is known as nested for loop. The inner loop executes completely whenever outer loop executes.

Example:

NestedForExample.java

public class NestedForExample {  
public static void main(String[] args) {  
//loop of i  
for(int i=1;i<=3;i++){  
//loop of j  
for(int j=1;j<=3;j++){  
        System.out.println(i+" "+j);  
}//end of i  
}//end of j  
}  
}  
Output:

1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
Pyramid Example 1:

PyramidExample.java

public class PyramidExample {  
public static void main(String[] args) {  
for(int i=1;i<=5;i++){  
for(int j=1;j<=i;j++){  
        System.out.print("* ");  
}  
System.out.println();//new line  
}  
}  
}  
Output:

* 
* * 
* * * 
* * * * 
* * * * *  
	 */
}
