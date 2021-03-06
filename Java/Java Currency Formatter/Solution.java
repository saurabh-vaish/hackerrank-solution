/*
Input Format

A single double-precision number denoting .


Output Format

On the first line, print US: u where  is  formatted for US currency. 
On the second line, print India: i where  is  formatted for Indian currency. 
On the third line, print China: c where  is  formatted for Chinese currency. 
On the fourth line, print France: f, where  is  formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

       // here we will use NumberFormat class getCurrencyInstance(Locale ) method to format number to currency .
        // where Locale denotes currency in which we have to format.

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(d);

        // or

        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(d);
        String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(d);
        // since india has no Locale so we have to construct one .
        Locale india = new Locale("en","IN");
        String in = NumberFormat.getCurrencyInstance(india).format(d);

        System.out.println("India : "+in);
        System.out.println("Us : "+us);
        System.out.println("China : "+ch);
        System.out.println("France : "+fr);
    }
}

