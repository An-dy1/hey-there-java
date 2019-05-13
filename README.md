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

<h6>For-each loop</h6>

- Handles getting collection length
- Handles accessing each value

```aidl
int[] myNumbers = {2, 4, 6, 8};
int sum = 0;

for(int currentNumber : myNumbers) {
    sum += currentNumber;
}
```

<h6>Switch!</h6>

- Simplifies testing against multiple matches
- Match can execute more than one statement

```aidl
switch(test-value) {
    case value1:
        statement;
        break;
    case value2:
        statement;
        break;
    default:
        statement;
        break;
}

// for example::
int myValue = 7;

switch(myValue % 2) {
    case 0:
        System.out.print(myValue);
        System.out.print(" is even");
        break;
    case 1:
        System.out.print(myValue);
        System.out.print(" is odd");
        break;
    default:
        System.out.print("You won't get this far");
        break;
}
```

<h4>All about classes</h4>

- Java is object-oriented
- Encapsulates data, operations and usage semantics
- Objects let you separate "what" is done from "how" it's done
- Classes give a structure for <b>describing and creating objects</b>

<h6>Classes</h6>

- A template for creating an object, like so:

```aidl
public class Bike { // public means you can access this class from anywhere
    private String bikeType; // field storing state; private means they're accessible within the class (constructor and methods), but can no longer print out the values from outside the class
    private float price; // field storing another state
    
    public Bike() { // make the constructor public too
        bikeType = 'mountain bike';
        price = 2000.00;
    } // constructor
    
    public void addMoreCost() {
        if(price <= 2000.00) {
            price += 400.00;
        } else {
            wayTooPricey();
        }
    } // executable code - a method - void means there is no return, just manipulates state
    
    private void wayTooPricey() {
        System.out.println("You can't afford that shit");
    }
    
    // method that returns a boolean:
    public boolean isRad(amountOfTravel) {
        int amountOfTravel;
        if amountOfTravel > 130mm {
            return true;
        } else {
            return false;
        }
    }
}


Bike foxyCleopatra;
foxyCleopatra = new Bike(); // create an instance of my class

foxyCleopatra.addMoreCost(); // call a method on my new instance of the class

```

- Java source file name normally has same name as class
- Made up of both state and executable code
- <b>Fields</b> store object state
- <b>Methods</b> are executable code that manipulates state and performs operations
- <b>Constructor</b> executable code used during object creation to set initial state
- Classes are reference types, meaning when assigned they point to an object, rather than creating a whole new copy 

<h6>Encapsulation and access modifiers</h6>

- Focus on what not how
- User shouldn't need to know how something is built to be able to use it
- Concept is: <b>encapsulation</b> 
- In Java, achieved through using <b>access modifiers</b>
- Examples:
```aidl
no access modifier - only accessible within its own package
public - accessible everywhere
private - only accessible within the class where it's declared

// access public Bike class from above:

Bike Franky = new Bike();
Franky.addMoreCost(); // allowed
Franky.wayTooPricey(); // not allowed - private method
```

- IMPORTANT: public classes must be within a source file of the same name. public class Bike must be found within Bike.java
   
<h6>Naming classes</h6>

- Use only letters and numbers
- First character always a letter
- Pascal case: class SexyBike { /* */ }
- Simple, descriptive nouns
- Avoid abbreviations 
    
<h6>Method basics</h6>   

- Executable code that manipulates state and performs operations 
- Name:
    - Same conventions as variables
    - Should be a verb or action
- Return type:
    - There is always one in Java
- Parameters
    - Can be empty
- Body
    - Enclosed in brackets
    
```
public class MethodExampleClass {

    public void addTripDays(int firstAmount, int secondAmount, int Count) {
        if(count < 1){
            return; // check parameters before doing unnecessary work
        }
        int total = firstAmount + secondAmount;
        for(int i = 0; i < count; i++) {
            System.out.println(sum);
        }   
    }
}

/* pretend this is outside the class: */

MethodExampleClass practice = new MethodExampleClass();
practice.addTripDays(3, 8, 3);
```

<h6>Exiting from a method</h6>

Three ways:
1. End of the method is reached
2. A return statement is encountered
3. An error occurs

<h6>Method return values</h6>

- Returns a single value; can be:
    - A primitive value
    - A reference to an object
    - A reference to an array
    
<h6>This and Null references</h6>

- <b>This</b> is: an implicit reference to the current object
    - Reduces ambiguity
    - Allows an object to pass itself as a parameter
- <b>Null</b> is: a reference literal
    - Represents an uncreated object
    - Can be assigned to any reference variable
    - Useful because local variables cannot be uninitialized
    
<h6>Field encapsulation</h6>

- In most cases a class' field should not be directly accessible outside of the class
- Helps hide implementation details
- Use methods to control field access
- Accessor/Mutator pattern:
    ```
    public class Flight {
    
        private int passengers;
        private int seats;
        
        // accessor, aka GETTER to retrieve a field value:
        public int getSeats() {
            return seats;
        }
        
        // mutator, aka SETTER to modify a field value
        public void setSeats(int seats) {
            this.seats = seats;
        }
    }
    
    Flight kcToNyc = new Flight();
    kcToNyc.setSeats(75);
    System.out.printlin(kcToNyc.getSeats()); // returns 75
    ```
    
<h4>Class initializers and constructors</h4>

- Establishing initial state of objects
- Field initializers
- Constructors
- Constructor chaining and visibility
- Initialization blocks
- Initialization and construction order

<h6>Establishing initial state</h6>

- Objects are made of: state (fields?) and executable code
- Java provides a default state when the field is first created
- 3 ways to set initial state:
    1. Field initializers (assign specific value to field)
    2. Constructors (pass in parameters and run code to set state)
    3. Initialization blocks (can be shared across constructors)
    
- Field initial value:
    - Unlike variables, don't have to have explicit value assigned to them
    - Java default will always be field's '0' value
    - Or, you can specify initial value as part of declaration:
    ```
    public class Earth {
        int circumferenceInMiles = 24901; // instantiating earth class, this field will have this value
        int circumferenceInKilometers = 24901 * 1.6; // can also be an equation, just has to be valid
        int circumferenceInKilometers = circumferenceInMiles * 1.6; // better 
        int circumferenceInKilometers = Math.round(circumferenceInMiles * 1.6); // can also use a method call
    }
    ```
    
<h6>Constructor(again)</h6>

- Executable code used during object creation to set initial state:

```
public class Bike {
    private float price;
    private String radLevel;
    
    // this is the constructor
    public Bike() {
        price = 2400.00;
        radLevel = 6;
    }
}
```

- It is executable code but NOT A METHOD; there is no return value
- Every class has at least one constructor
- So, what happens when you don't need an explicit constructor?
```
public class bikeRider {
    private int numberOfBikes;
    private int coolFactor;
    
    // assume getters and mutators here 
    
    private float coolnessRatio; 
    
    // create a bikeRider with coolFactor set
    public bikeRider(int coolFactor) {
        this.coolFactor = coolFactor;
    }
}

bikeRider andyJay = new bikeRider(); // this code will run if there is no explicit constructor, won't run if there is a constructor like above^

bikeRider sammyDee = new bikeRider(4); // passing in coolFactor to the constructor above
sammyDee.setNumberOfBikes(2);
```

- Java just generates a constructor that doesn't do anything

<h6>Chaining constructors</h6>
```
public class bikeRider {
    private int numberOfBikes;
    private int coolFactor;
    private float coolnessRatio; 
    
    // assume getters and mutators here 
    
    // constructor that takes no arguments
    public bikeRider() {
    }
    
    // constructor with coolFactor argument
    public bikeRider(int coolFactor) {
        this(coolnessRatio > 0.5 ? 100.00 : 0.00); // exercise doesn't quite translate, but this is now calling the last constructor below:
        this.coolFactor = coolFactor;
    }
    
    // constructor with two arguments
    public bikeRider (int coolFactor, int numberOfBikes) {
        // this works, but it's repeating code
        this.coolFactor = coolFactor;
        this.numberOfBikes = numberOfBikes;
        
        // better way: call a constructor within this constructor:
        this(coolFactor); // ^calling constructor above; must be first line;
        this.numberOfBikes = numberOfBikes;
    }
    
    // introduce a constructor allowing us to calculate coolnessRatio:
    private bikeRider(float coolnessRatio) {
        this.coolnessRatio = coolnessRatio;
    }
}

```
- With multiple constructors, should start thinking about visibility of the constructors

<h6>Initialization blocks</h6>

- Shared across all constructors
- Executed as if the code were placed at the start of each constructor
- Wrap in brackets outside of any method or constructor; they are executed in order if there are multiple

<h6>Initialization and construction order</h6>


<h4>To learn more about:</h4>
- Getters and setters and when they're used
- Using public vs private

<h4>Basic, important points</h4>

- public and private (visibility) are like global vs local?
- Objects have: state (fields) and executable code (methods)
- What is this syntax: ```MathEquation equation: equations```
- 3 ways to set initial state:
    1. Field initializers (assign specific value to field)
    2. Constructors (pass in parameters and run code to set state)
    3. Initialization blocks (can be shared across constructors)
