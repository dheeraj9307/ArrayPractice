public class Largest1 {
    public static void main(String[] args) {
        int[]arr={1,2,4,56,8};
        int  max=arr[0];
        for(int i=0;i< arr.length;i++){
         if(arr[i]>max)
             max = arr[i];
         }

        System.out.println(max);
    }
}
//output : 56