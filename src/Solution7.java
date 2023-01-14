import java.util.Arrays;
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String[] a=A.split("");
        String[] b=new String[a.length];
        String c="";
        int j=0;

        for (int i=a.length-1;i>=0;i--){
                b[j]=a[i];
                j++;
        }
        //c= String.join("",b);
        //String c=(String) Arrays.toString(b);
        for (String q:b){
            c=c+q;
        }
        if (A.compareTo(c)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
