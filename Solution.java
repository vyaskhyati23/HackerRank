/**
Input Format

The first line contains an integer,N  (the number of integers in )A. 
The second line contains N space-separated integers describing A.

Output Format

Print all  integers in A in reverse order as a single line of space-separated integers.
 */


import java.util.*;

public class Solution {
         private static int[]Array;
            private int Arraysize;
    
    Solution(int size){
        Arraysize=size;
        Array=new int[size];
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       Solution a=new Solution(n);
       for(int i=0;i<n;i++)
    	   Array[i]=sc.nextInt();
        a.reverse();
  
    }
    
    public void reverse(){
        for(int i=Array.length-1;i>=0;i-- )
            System.out.print(Array[i]+" ");
    }
}