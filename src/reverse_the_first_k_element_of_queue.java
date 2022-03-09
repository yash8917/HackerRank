//public class reverse_the_first_k_element_of_queue {
//}
//    Ram has a queue. He wants to reverse the first K element of his queue. Help him do the same using Stack data structure.
//
//        Input Format
//
//        size of queue
//
//        integer K denoting number of elements that need to be reversed
//
//        input the queue
//
//        Constraints
//
//        1
//
//        Output Format
//
//        reverse queue
//
//        Sample Input 0
//
//        7
//        3
//        12 3 4 67 88 22 54
//        Sample Output 0
//
//        4 3 12 67 88 22 54
//--------------------------------------------------------------------------------------
import java.io.*;
        import java.util.*;

public class  reverse_the_first_k_element_of_queue {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> stk = new Stack<>();
        int arr[]= new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }

        for(int i=0;i<k;i++){
            stk.push(arr[i]);
        }

        for(int i=0;i<k;i++){
            arr[i]=stk.pop();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }


}