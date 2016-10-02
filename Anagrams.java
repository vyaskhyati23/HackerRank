/*
 * Input Format

The first line contains a single string a. 
The second line contains a single string b.

Output Format

Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagrams {
    public static int numberNeeded(String first, String second) {
        Map<Character, Integer> count = new HashMap<>();
        
        ////if key is already present, get the count and add 1
        for( char ch: first.toCharArray() ) {
            int ct = count.containsKey(ch) ? count.get(ch) : 0;
            count.put(ch, (ct + 1));
            System.out.println("key is :"+ch+" ,Value is :"+(ct+1));
        }
        
      //if key is already present, deduct 1 to avoid re-calculating duplicates
       // first - a --> 1  second - a--> -1 
        //therefore, while computing total, they cancel each other out.
        for( char ch: second.toCharArray() ) {
            int ct = count.containsKey(ch) ? count.get(ch) : 0;
            count.put(ch, (ct - 1));
            System.out.println("key is :"+ch+" ,Value is :"+(ct-1));
        }
        
        //add all the abs values.
        List<Integer> values = new ArrayList<>( count.values() );
        int total = 0;
        for( Integer v: values ) {
            total += Math.abs(v);
        }
        return total;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}