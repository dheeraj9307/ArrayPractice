// FIND THE LARGEST ELEMENT IN THE ARRAY
public class Largest {

    static int getlargest(int[]arr,int n) {
        int largest = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest])
                largest = i;
            }
            return largest;
        }


    public static void main(String[] args) {
        int[]arr={1,2,4,56,8};
        int n= arr.length;
        System.out.println(getlargest(arr,n));

    }
}

//output:3(index)