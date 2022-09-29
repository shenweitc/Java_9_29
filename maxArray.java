package Demo;

public class maxArray {
    public static void main(String[] args) {
        int[] array={1,54,1,654,6,6,56};
        System.out.println(getMax(array));
    }

    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
