/*

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.

If B or H , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static int B,H;
static boolean flag;

static{
    Scanner sc = new Scanner(System.in);
      B = sc.nextInt();
      H = sc.nextInt();
      flag = B>0 && H>0;
    if(!flag)
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        //flag = false;
    }
   
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
