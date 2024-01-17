package Basics;

public class Data_Types {
	public static void main(String[] args) {
		

//Data Types in java
	
/* 1.Primitive Data Type: : such as boolean, char, int, short, byte, long, float, and double */
	
/* boolean data type = true or false (default value should be false)
	Size = 1 bit*/
	
	
/* byte = twos-complement integer (default value should be 0)
	Size = 8 bits
	Range of values =-128 to 127 */
		
		byte b = 4;
	
/* char data type = Unicode character (default value should be \u0000)
	Size = 16 bits 	
	Range of values = characters representation of ASCII values 0 to 255 */	
		
		char c = 'G';
	
/* short data type = twos-complement integer (default value should be 0)
	Size = 32 bits	
	Range of values = --2,147,483,648 to 2,147,483,647 */
		
		short s = 56;
		
/* int data type = twos-complement intger (default value should be 0)
	Size = 16 bits	
	Range of values = -32,768 to 32,767 */
	
		int i = 89;
	
/* long data type = twos-complement integer (default value should be 0)
	Size = 64 bits 	
	Range of values = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 */
	
		long l = 12121;
		
/* float  data type = IEEE 754 floating point (default value should be 0.0)
	Size = 32 bits	 	
	Range of values = upto 7 decimal digits */
	
		float f = 4.7333434f;
		
/* double  data type = IEEE 754 floating point (default value should be 0.0)
	Size = 64 bits 	
	Range of values = upto 16 decimal digits */
		
		double d = 4.355453532;
		
		
		System.out.println("byte : " + b);
		System.out.println("char : "+c);
		System.out.println("short : "+s);
		System.out.println("int : "+i);
		System.out.println("long : "+l);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		
		
		/*Non-Primitive Data Types
		Non-primitive data types or reference data types refer to instances or objects. They cannot store the value of a variable directly in memory. They store a memory address of the variable. Unlike primitive data types we define by Java, non-primitive data types are user-defined. Programmers create them and can be assigned with null. All non-primitive data types are of equal size.*/


	//testing 
		
		System.out.println("hello");
		

	}

}
