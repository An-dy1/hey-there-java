<h3>My Java notes</h3>

<h4>Intro</h4>

- JDK: Java Development Kit
- JRE: Java Runtime Environment
- Java SE = Java Standard Edition
- Java EE = Java Enterprise Edition
- LTS = Long Term Support

<h4>My first Java app</h4>

- IntelliJ always creates initial class with name 'Main' but it could be anything
- Important part is the method:
```aidl
public static void main(String[] args) {
	System.out.print("Hey there, Java");
    }
```
- <b>Start</b> up of application must be a class that has a member <b>called main</b> that is:
    - public
    - static
    - void
    
- To run from the command line:
    - End users must have installed the JRE
    - Java programs don't run directly, they run within the Java environment
    - On Mac and Linux, you can run directly from command line
    - Navigating to project folder > out > production > project name file > COMPILED PROJECT FILE
    - Run java + name of class:
    ```aidl
    java Main
    ```
    
- Statement Structure
    - A program is made with statements
    - Always ends with a semi-colon
    - Parts of statement can be separated with white space(s)
    - Example:
    ```aidl
    System.out.println("Hello, world");
    System.out.println ( "Hello, world " );
    ```

- Comments:
    - Line comments (ignore everything until new line):
    ```aidl
    // this is my comment
    ```
    - Block comments:
    ```aidl
    /* This is my block comment */
    ```
    - JavaDoc comments (JavaDoc utility uses these comments to generate documentation):
    ```aidl
    /** This is a javadoc comment */
    ```
    
- Packages
    ```aidl
    package com.pluralsight.example;
  
    public class Main {
      public static void main(Strings[] args) {
    
      }
    }
    ```
    - Packages provide organization
    - Follow a standard naming convention
        - all lowercase
        - Use reversed domain name to assure global uniqueness
        - Add further qualifiers to assure uniqueness within organization
    - Affect source code file structure
        - Java requires no correlation between package names and source code file structure
        - But most IDEs require a subfolder for each part of the package name
    - Once you add in a package, the name of the main class changes to: com.pluralsight.example.Main
    - To run, make sure you have new correct file name with extensions
    
<h4>Variables, data types and math operators</h4>

<h6>Variables</h6>

- Named data storage
- Java is strongly typed:
    ```aidl
    int dataValue;
    dataValue = 11;
    int myNumber = 12;
    ```    
- To name variables:
    - Use letters and numbers
    - First character not a number, always a letter
    - camelCase
    
<h6>Primitive Data Types</h6>

- Built into the language
- Foundation of all other types
- Four categories:
    - Integer
    - Floating point
    - Character
    - Boolean
- Integer types:
    - Difference is in size of storage they take out
    - Byte (eight bits)
    - Short
    - Int
    - Long
- Floating point types:
    - Store values that have a fractional portion
    - Float:
    ```aidl
    float milesInRiver = 135.2f;
    ```
    - Double
- Character:
    - stores a single Unicode character:
    ```aidl
    char myInitial = 'a';
    char weirdU = '\u00DA';
    ```
- Boolean

<h6>Primitive type storage</h6>

- Primitive data types are stored by value
- When you set one variable's value to another variable, it makes a <b>copy</b>

<h6>Arithmetic Operations</h6>

- Basic operators
- Pre/postfix operators
- Compound Assignment

<h6>Type conversions</h6>

- Implicit (aka widening conversions)
    - Mixed integer sizes
    - Mixed floating point sizes
    - Mixed integer and floating point type casts to longest floating point type
- Explicit (widening or narrowing conversions)

<h4>Conditional logic, looping and arrays</h4>

<h6>Conditional logic</h6>

Need:
- Relational operators (like '>' and '==')
- Conditional assignments:
    ```aidl
    result = condition ? true-value : false-value;  
    ```
- The if-else statement
    ```aidl
    if (condition) {
      true-statement;
    }
    else if (condition2) {
      other-true-statement;
    }
    else {
      false-statement;
    }
    ```
- Logical operators

<h6>Block statement</h6>

```aidl
{
    statement-1;
    statement-2;
    statement-3;
    statement-4;
}
```

<h6>Logical operators</h6>

```aidl
if (x == 1 & y == 2) // and - true & true
if (x == 1 | y == 2) // or - true or true
if (x == 1 ^ y == 2) // exclusive or - only one true
if (!x == 1) // negation
if (x == 1 && y == 2) // conditional and - only evaluates y if x is true
if (x == 1 || y == 2) // conditional or - only evaluates y if x is false
```

<h6>Example while loop</h6>

```aidl
int startingValue = 5;
int factorial = 1;

while(startingValue > 1) {
    factorial *= startingValue;
    startingValue -= 1;
}
```

<h6>Do while loop</h6>

- Condition is checked at the end of the loop
- Body of the statement is executed at least once

```aidl
int initialValue = 5;
do {
    System.out.print(initialValue);
    System.out.print(" * 2 = ");
    initialValue *= 2;
    System.out.print(initialValue);
}
while (initialValue <= 100);
```
    
<h6>For loop</h6>

- Condition checked at start of loop
- Basic structure:

```aidl
for(initialize; condition; update) { 
    statement;
}
for(int firstNumber = 1; firstNumber < 100; firstNumber += 2) {
    do a thing;
}
```

<h6>Arrays</h6>

- Store multiple values of a common type under a single name

```aidl
int[] myArray = new int[5]; // make an array with 5 spaces
int sum;
myArray[0] = 11;
for(int i = 0; i < myArray.length; i++) {
    sum += myArray[i];
}

int[] myNewArray = { 1, 2, 3}; // easier way to initialize an array
```
    
    
    
