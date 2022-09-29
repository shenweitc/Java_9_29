package Demo;

public class copyArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] copyArray=copyArray(arr,3,7);
        for (int i = 0; i < copyArray.length; i++) {
            System.out.print(copyArray[i]+" ");
        }
    }

    public static int[] copyArray(int[] arr,int from,int to){
        int[] arr2=new int[to-from];
        int index=0;//伪造索引
        for(int i=from;i<to;i++){
            arr2[index]=arr[i];
            index++;
        }
        return arr2;
    }
}
