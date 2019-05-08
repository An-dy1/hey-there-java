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
    
    
    
    
