// We are writing a registration program for our app. At first it should welcome
// the users, then ask the users to enter their names.
// But program you are given executes this sequence in reverse order.
// Complete the program by extending the Thread class for Welcome and Name
// classes, then setting priorities for their run methods so that the program
// outputs the messages in the correct order.

// Note: Use setPriority(number) method on the objects - obj.setPriority(number).
// The higher the number, the higher the priority.

class Main {
    public static void main(String[] args) {
        Name name = new Name();
        // set priority
        name.setPriority(Thread.MAX_PRIORITY);

        Welcome welcome = new Welcome();
        // set priority
        welcome.setPriority(Thread.MAX_PRIORITY);

        name.start();
        welcome.start();
    }
}

class Welcome extends Thread {
    public void run() {
        System.out.println("Welcome!");
    }
}

class Name extends Thread {
    public void run() {
        System.out.println("Please enter your name");
    }
}