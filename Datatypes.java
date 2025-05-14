// @SuppressWarnings("unused")
// public static void main(String[] args) {
// double myDoubleNum = 9.98d; // Declare a double variable
// }

// }

// Data types are divided into two groups:

// Primitive data types - includes byte, short, int, long, float, double,
// boolean and char
// Non-primitive data types - such as String, Arrays and Classes (you will learn
// more about these in a later chapter)

// Primitive Data Types

// A primitive data type specifies the type of a variable and the kind of values
// it can hold.

// There are eight primitive data types in Java:
// Data Type Description
// byte Stores whole numbers from -128 to 127
// short Stores whole numbers from -32,768 to 32,767
// int Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long Stores whole numbers from -9,223,372,036,854,775,808 to
// 9,223,372,036,854,775,807
// float Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double Stores fractional numbers. Sufficient for storing 15 to 16 decimal
// digits
// boolean Stores true or false values
// char Stores a single character/letter or ASCII values

// Java Numbers
// Primitive number types are didvided into two groups:

// Interger types - byte, short, int and long
// stores whole numbers, positive or negative (such as 123 or -456), without
// decimals. Valid types are byte, short, int and long. Which type you should
// use, depends on the numeric value.

// Floating-point types - float and double
// represents numbers with a fractional part, containing one or more decimals.
// There are two types: float and double.

// Java Booleans Data Types
// Boolean Types
// It contains only two values: 
// either : true and false.
// or :     Yes and No
// or :     1 and 0
// or :    On and Off

// Example syntax of boolean data types
// boolean isJavaFun = true;
// boolean isFishTasty = false;
// System.out.println(isJavaFun);
// Outputs true
// System.out.println(isFishTasty);
// Outputs false

// Java Characters Data Types
// Characters
// The char data types is used to store a single character.
// It shold must be under single quotes, like 'A' or 'c'.

// Example syntax of char data types
// char myGrade = 'A';
// char myLetter = 'B';
// System.out.println(myGrade);
//      // Outputs A
// System.out.println(myLetter);
//      // Outputs B

// Java String Data Types
// Strings
// The String data type is used to store a sequence of characters.
// It shuld must be under double quotes, like "Hello World" or "Java Programming".
// Example syntax of string data types

// Real Life Examples:
// Here's a  real-life example of using different data types , to calculate and print the area of a rectangle:

// Declare variables for length and width
// @SuppressWarnings("unused")
public class Datatypes {
    public static void main(String[] args) {
        // double myDoubleNum = 9.98d; // Declare a double variable

        // Real Life Examples:
        // Here's a real-life example of using different data types, to calculate and
        // print the area of a rectangle:

        // Declare variables for length and width
        double length = 5.0;
        double width = 3.0;

        // Calculate area
        double area = length * width;

        // Print area
        System.out.println("Area of the rectangle: " + area);
    }

}


// Output:
// PS D:\Only Java\Java Complete fundamentals revisions> java Datatypes.java
// Area of the rectangle: 15.0