//SEARCH ELEMENT IN ARRAY


import java .util.Scanner;
public class Search {

        static int search(int[]arr){
            System.out.println("enter the number");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int n=arr.length;
            // int x=87;
            for(int i=0;i<n;i++){
                if(arr[i]==x)
                    return i;
            }
            return -1;
        }
        public static void main(String[]args){
            int []arr={1,3,5,2,87,23};
            System.out.println(search(arr));
        }
    }

/*OUTPUT: enter the number
//34
-1

 */