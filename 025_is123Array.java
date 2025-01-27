class is123Array {
    public static void main(String[] args) {
        System.out.println(is123Array(new int[] { 1, 2, 3, 3, 2, 1 }));
        System.out.println(is123Array(new int[] { 0, 1, 2, 3, 1, 2, 3 }));
        System.out.println(is123Array(new int[] { 1, 2, 3, 3, 2, 1, 1, 2, 3 }));
        System.out.println(is123Array(new int[] { 1, 2, 3 }));
        System.out.println(is123Array(new int[] {}));

    }

    public static int is123Array(int[] arr) {
        if (arr.length == 0 || arr.length % 3 != 0) {
            return 0;
        }

        for (int i = 0; i < arr.length; i += 3) {
            if (arr[i] != 1 || arr[i + 1] != 2 || arr[i + 2] != 3) {
                return 0;
            }
        }
        return 1;
    }
}
