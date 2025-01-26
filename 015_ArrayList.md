# ArrayList

The Java API provides special classes to store and manipulate groups of objects.
One such class is the ArrayList. Standard Java arrays are of a fixed length, which means that after they are created, they cannot expand or shrink.
On the other hand, ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged.
When objects are removed, the ArrayList may shrink in size. Note that the ArrayList class is in the java.util package, so it's necessary to import it before using it.
Create an ArrayList as you would any object.

```java
import java.util.ArrayList;
//...
ArrayList colors = new ArrayList();
```

You can optionally specify a capacity and type of objects the ArrayList will hold:

```java
ArrayList<String> colors = new ArrayList<String>(10);
```

The code above defines an ArrayList of Strings with 10 as its initial size. You can add objects to an ArrayList using the add() method:

```java
colors.add("red");
colors.add("green");
colors.add("blue");
...
```

> ArrayLists store objects. Thus, the type specified must be a class type. You cannot pass, for example, int as the objects' type. Instead, use the special class types that correspond to the desired value type, such as Integer for int, Double for double, and so on.

The ArrayList class provides a number of useful methods for manipulating its objects.

> The add() method adds new objects to the ArrayList. Conversely, the remove() method removes objects from the ArrayList.

```java
import java.util.ArrayList;

public class MyClass {
    public static void main(String[ ] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Green");

        System.out.println(colors);
    }
}
```

Other useful methods include the following:

- contains(): Returns true if the list contains the specified element
- get(int index): Returns the element at the specified position in the list
- size(): Returns the number of elements in the list
- clear(): Removes all of the elements from the list

Note: As with arrays, the indexing starts with 0.

## LinkedList vs. ArrayList

The most notable difference between the LinkedList and the ArrayList is in the way they store objects.
The ArrayList is better for storing and accessing data, as it is very similar to a normal array.
The LinkedList is better for manipulating data, such as making numerous inserts and deletes.

In addition to storing the object, the LinkedList stores the memory address (or link) of the element that follows it. It's called a LinkedList because each element contains a link to the neighboring element.

## Summary:
- Use an ArrayList when you need rapid access to your data.
- Use a LinkedList when you need to make a large number of inserts and/or deletes.