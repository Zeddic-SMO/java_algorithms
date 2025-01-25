# Exceptions

An exception is a problem that occurs during program execution. Exceptions cause abnormal termination of the program.
Exception handling is a powerful mechanism that handles runtime errors to maintain normal application flow.

An exception can occur for many different reasons. Some examples:

- A user has entered invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications.
- Insufficient memory and other issues related to physical resources.

> Note: As you can see, exceptions are caused by user error, programmer error, or physical resource issues. However, a well-written program should handle all possible exceptions.

## Exception Handling

Exceptions can be caught using a combination of the try and catch keywords.
A try/catch block is placed around the code that might generate an exception.

```java
try {
//some code
} catch (Exception e) {
//some code to handle errors
}
```

> Notice the (Exception e) statement in the catch block - it is used to catch all possible Exceptions.

A catch statement involves declaring the type of exception you are trying to catch. If an exception occurs in the try block, the catch block that follows the try is checked. If the type of exception that occurred is listed in a catch block, the exception is passed to the catch block much as an argument is passed into a method parameter.
The Exception type can be used to catch all possible exceptions.

## throw

The throw keyword allows you to manually generate exceptions from your methods. Some of the numerous available exception types include the IndexOutOfBoundsException, IllegalArgumentException, ArithmeticException, and so on. For example, we can throw an ArithmeticException in our method when the parameter is 0.

```java
public class Program {

    static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(42, 0));
    }

}
```

The throws statement in the method definition defines the type of Exception(s) the method can throw.
Next, the throw keyword throws the corresponding exception, along with a custom message.
If we call the div method with the second parameter equal to 0, it will throw an ArithmeticException with the message "Division by Zero".

> Note: Multiple exceptions can be defined in the throws statement using a comma-separated list.

### Exception Handling

A single try block can contain multiple catch blocks that handle different exceptions separately.

```java
try {
  //some code
} catch (ExceptionType1 e1) {
  //Catch block
} catch (ExceptionType2 e2) {
  //Catch block
} catch (ExceptionType3 e3) {
  //Catch block
}
```

> Note:All catch blocks should be ordered from most specific to most general.
> Following the specific exceptions, you can use the Exception type to handle all other exceptions as the last catch.

## Types of Exceptions

There are two exception types, checked and unchecked (also called runtime). The main difference is that checked exceptions are checked when compiled, while unchecked exceptions are checked at runtime.
As mentioned in our previous lesson, Thread.sleep() throws an InterruptedException. This is an example of a checked exception. Your code will not compile until you've handled the exception.

```java
public class MyClass {
  public static void main(String[ ] args) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      //some code
    }
  }
}
```

We have seen examples of unchecked exceptions, which are checked at runtime, in previous lessons.

> Note: if not handled, checked exceptions will prevent your code from compiling.
