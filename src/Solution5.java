import java.io.*;
import java.util.*;

public class Solution5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a=A.length();
        int b=B.length();
        System.out.println(a+b);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
            String resultado=(A.toUpperCase().charAt(0)+A.substring(1).toLowerCase())+" "+(B.toUpperCase().charAt(0)+B.substring(1).toLowerCase());
            System.out.println(resultado);
        }else{
            System.out.println("No");
            String resultado=(A.toUpperCase().charAt(0)+A.substring(1).toLowerCase())+" "+(B.toUpperCase().charAt(0)+B.substring(1).toLowerCase());
            System.out.println(resultado);
        }


    }
}
