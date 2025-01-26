# Sets

A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
One of the implementations of the Set is the HashSet class.

Example:

```java
import java.util.Set;
import java.util.HashSet;

Set<Type> set = new HashSet<>();
```

## Common Methods in Set

add(element) - Adds an element to the set. Returns false if the element is already present.
remove(element) - Removes a specific element from the set.
contains(element) - Returns true if the element exists in the set.
size() - Returns the number of elements in the set.
isEmpty() - Returns true if the set is empty.
clear() - Removes all elements from the set.
addAll(Collection c) - Adds all elements from a collection to the set, ignoring duplicates.
retainAll(Collection c) - Retains only the elements that are also in the specified collection.
removeAll(Collection c) - Removes all elements that are in the specified collection.
iterator() - Returns an iterator over the elements in the set.

> Example: using HashSet

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Try adding a duplicate
        set.add("Apple");

        // Display the set
        System.out.println("Set: " + set);

        // Check for an element
        System.out.println("Contains 'Apple'? " + set.contains("Apple"));

        // Remove an element
        set.remove("Banana");
        System.out.println("After removal: " + set);

        // Loop through the set
        for (String item : set) {
            System.out.println(item);
        }
    }
}

```

## LinkedHashSet

The HashSet class does not automatically retain the order of the elements as they're added. To order the elements, use a LinkedHashSet, which maintains a linked list of the set's elements in the order in which they were inserted.

## What is hashing?

A hash table stores information through a mechanism called hashing, in which a key's informational content is used to determine a unique value called a hash code.
So, basically, each element in the HashSet is associated with its unique hash code.
