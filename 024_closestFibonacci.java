class closestFibonacci {
    public static void main(String[] args) {
        System.out.println(closestFibonacci(12));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));

    }

    public static int closestFibonacci(int n) {
        if (n < 1) {
            return 0;
        }

        int firstNum = 1;
        int secondNum = 1;
        int num = 0;

        while (secondNum <= n) {
            num = firstNum;
            firstNum = secondNum;
            secondNum = num + firstNum;
        }
        return firstNum;

    }

}
