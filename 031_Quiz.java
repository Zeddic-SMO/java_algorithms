// What is the output of the following program?

class Quiz {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            if (i % 2 == 0) {

                continue;

            }

            System.out.println(i);

        }

    }
}

// What if the output of the following program?

class Main {

    public static void main(String[] args) {

        int i = 0;

        for (i = 0; i < 10; i++) {

            break;

        }

        System.out.println(i);

    }

}
