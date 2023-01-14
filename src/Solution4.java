import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        numeroGrande();


    }
    public static void numeroGrande(){
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese valor a: ");
        BigInteger a=s.nextBigInteger();
        System.out.println("Ingrese valor b: ");
        BigInteger b=s.nextBigInteger();

        BigInteger A=new BigInteger(String.valueOf(a));
        BigInteger B=new BigInteger(String.valueOf(b));

        BigInteger resultado =A.add(B);
        System.out.println(resultado);

        BigInteger resultado1 =A.multiply(B);
        System.out.println(resultado1);
    }
}