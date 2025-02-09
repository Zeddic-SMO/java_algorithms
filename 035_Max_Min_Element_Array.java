// Given an array, find the maximum and the mininmum elements in it...

class Max_Min_Element_Array {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum element is " + max);
        System.out.println("Minimum element is " + min);

    }

}
