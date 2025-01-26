# Working with Files

The java.io package includes a File class that allows you to work with files.
To start, create a File object and specify the path of the file in the constructor.

```java
import java.io.File;

File file = new File("C:\\data\\input-file.txt");
```

With the exists() method, you can determine whether a file exists.

```java
import java.io.File;

public class MyClass {
  public static void main(String[ ] args) {
    File x = new File("C:\\documents\\test.txt");
    if(x.exists()) {
     System.out.println(x.getName() +  "exists!");
    }
    else {
     System.out.println("The file does not exist");
    }
  }
}
```

The getName() method returns the name of the file.
Note that we used double backslashes in the path, as one backslash should be escaped in the path String.

## Reading a File

Files are useful for storing and retrieving data, and there are a number of ways to read from a file.
One of the simplest ways is to use the Scanner class from the java.util package.
The constructor of the Scanner class can take a File object as input.
To read the contents of a text file at the path "C:\\documents\\test.txt", we would need to create a File object with the corresponding path and pass it to the Scanner object.

```java
try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);
}
 catch (FileNotFoundException e) {

}
```

We surrounded the code with a try/catch block, because there's a chance that the file may not exist.

The Scanner class inherits from the Iterator, so it behaves like one.
We can use the Scanner object's next() method to read the file's contents.

```java
try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);
  while(sc.hasNext()) {
    System.out.println(sc.next());
  }
  sc.close();
} catch (FileNotFoundException e) {
  System.out.println("Error");
}
```

The file's contents are output word by word, because the next() method returns each word separately.

> It is always good practice to close a file when finished working with it. One way to do this is to use the Scanner's close() method.

## Creating Files

Formatter, another useful class in the java.util package, is used to create content and write it to files.

Example:

```java
import java.util.Formatter;

public class MyClass {
   public static void main(String[ ] args) {
  try {
    Formatter f = new Formatter("C:\\documents\\test.txt");
  } catch (Exception e) {
      System.out.println("Error");
  }
  }
}
```

This creates an empty file at the specified path. If the file already exists, this will overwrite it.

## Writing to Files

Once the file is created, you can write content to it using the same Formatter object's format() method.

```java
import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class MyClass {
    public static void main(String[ ] args) {
        try {
            Formatter f = new Formatter("test.txt");
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "2","Amy", "Brown");
            f.close();

            File x = new File("test.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
        System.out.println("Error");
        }
    }
}
```

The format() method formats its parameters according to its first parameter.
%s mean a string and get's replaced by the first parameter after the format. The second %s get's replaced by the next one, and so on. So, the format %s %s %s denotes three strings that are separated with spaces.
Note: \r\n is the newline symbol in Windows.
The code above creates a file with the following content:
