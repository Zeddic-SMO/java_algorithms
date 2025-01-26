# HashMap

Arrays and Lists store elements as ordered collections, with each element given an integer index.
HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value).
The put, remove, and get methods are used to add, delete, and access values in the HashMap.

```java
import java.util.HashMap;

public class MyClass {
    public static void main(String[ ] args) {
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);

        System.out.println(points);
        System.out.println(points.get("Dave"));
    }
}

OUTPUT:
{Rob=733, Amy=154, Dave=42}
42
```

> We have created a HashMap with Strings as its keys and Integers as its values.
> Use the get method and the corresponding key to access the HashMap elements.

A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.
The HashMap class provides **containsKey** and **containsValue** methods that determine the presence of a specified key or value.
If you try to get a value that is not present in your map, it returns the value of **null**.

> null is a special type that represents the absence of a value.

## Method Description

put(key, value) - Inserts or updates the key-value pair in the map.
get(key) - Retrieves the value associated with the given key. Returns null if the key is not found.
remove(key) - Removes the key-value pair for the given key.
containsKey(key) - Returns true if the map contains the given key.
containsValue(value) - Returns true if the map contains the given value.
keySet() - Returns a Set view of all the keys in the map.
values() - Returns a Collection view of all the values in the map.
size() - Returns the number of key-value pairs in the map.
isEmpty() - Returns true if the map is empty.
clear() - Removes all the key-value pairs from the map.
