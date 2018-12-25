
//This exercise is to test your understanding of Java Strings.
//
//The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
//
//Output Format
//
//There are three lines of output: 
//For the first line, sum the lengths of A and B. 
//For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
//For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
//
//Sample Input
//
//hello
//java


//Sample Output
//
//9
//No
//Hello Java
//Explanation


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next().toLowerCase();
        String B=sc.next().toLowerCase();
        /* Enter your code here. Print output to STDOUT. */
        String c =A+B;
        System.out.println(c.length());
        if(A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        else
        System.out.println("No");
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(A+" "+B);
        
    }
}



