# Threads

Java is a multi-threaded programming language. This means that our program can make optimal use of available resources by running two or more components concurrently, with each component handling a different task.
You can subdivide specific operations within a single application into individual threads that all run in parallel.
The following diagram shows the life-cycle of a thread.

There are two ways to create a thread.

1. Extend the Thread class
   Inherit from the Thread class, override its run() method, and write the functionality of the thread in the run() method.
   Then you create a new object of your class and call it's start method to run the thread.

Example:

```java
class Loader extends Thread {
public void run() {
System.out.println("Hello");
}
}

class MyClass {
public static void main(String[ ] args) {
Loader obj = new Loader();
obj.start();
}
}
```

As you can see, our Loader class extends the Thread class and overrides its run() method.
When we create the obj object and call its start() method, the run() method statements execute on a different thread.

> Note: Every Java thread is prioritized to help the operating system determine the order in which to schedule threads. The priorities range from 1 to 10, with each thread defaulting to priority 5. You can set the thread priority with the setPriority() method.

2. Implement the Runnable interface

The other way of creating Threads is implementing the Runnable interface.
Implement the run() method. Then, create a new Thread object, pass the Runnable class to its constructor, and start the Thread by calling the start() method.

```java
class Loader implements Runnable {
    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Thread t = new Thread(new Loader());
        t.start();
    }
}
```

In this example, the Loader class implements the Runnable interface and overrides its run() method.
When we create the t object and call its start() method, the run() method statements execute on
a different thread.

> Note: The Runnable interface is a functional interface, which means it has only one abstract method,
> which is the run() method. This is why we can use a lambda expression to implement the Runnable interface.

> It may seem that implementing the Runnable interface is a bit more complex than extending from the Thread class. However, implementing the Runnable interface is the preferred way to start a Thread, because it enables you to extend from another class, as well.
