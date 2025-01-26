# LinkedList

The LinkedList is very similar in syntax to the ArrayList.
You can easily change an ArrayList to a LinkedList by changing the object type.

```java
import java.util.LinkedList;

public class MyClass {
    public static void main(String[ ] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");
        System.out.println(c);
    }
}
```

You cannot specify an initial capacity for the LinkedList.

> length() method returns the number of characters in a string.

## LinkedList vs. ArrayList

The most notable difference between the LinkedList and the ArrayList is in the way they store objects.
The ArrayList is better for storing and accessing data, as it is very similar to a normal array.
The LinkedList is better for manipulating data, such as making numerous inserts and deletes.

In addition to storing the object, the LinkedList stores the memory address (or link) of the element that follows it. It's called a LinkedList because each element contains a link to the neighboring element.

## Summary:
- Use an ArrayList when you need rapid access to your data.
- Use a LinkedList when you need to make a large number of inserts and/or deletes.