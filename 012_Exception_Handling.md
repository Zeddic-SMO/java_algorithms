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
