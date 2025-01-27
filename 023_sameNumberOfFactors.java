class sameNumberOfFactors {

    public static void main(String[] args) {
        System.out.println(sameNumberOfFactors(-6, 21));
        System.out.println(sameNumberOfFactors(6, 21));
        System.out.println(sameNumberOfFactors(8, 12));
        System.out.println(sameNumberOfFactors(23, 97));
        System.out.println(sameNumberOfFactors(0, 1));
        System.out.println(sameNumberOfFactors(0, 0));
    }

    public static int sameNumberOfFactors(int n1, int n2) {
        if (n1 == n2) {
            return 1;
        }
        if (n1 < 0 || n2 < 0) {
            return -1;
        }
        if (n1 == 0 || n2 == 0) {
            return 0;
        }

        int n1Count = 0;

        for (int i = 2; i <= n1; i++) {
            if (n1 % i == 0) {
                n1Count++;
            }
        }

        int n2Count = 0;
        for (int i = 2; i <= n2; i++) {
            if (n2 % i == 0) {
                n2Count++;
            }
        }

        if (n1Count == n2Count) {
            return 1;
        } else {
            return 0;
        }
    }

}