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
