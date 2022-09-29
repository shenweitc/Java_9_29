package Demo;

public class arrayPrint {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        arrayPrint(array);
    }

    public static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
