import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese las veces a realizar la operacion");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int resultado=0;
            for (int j=0;j<n;j++){
                if(j==0){
                    resultado=a+(1*b);
                    System.out.print(resultado+" ");
                    if (i==1){
                        System.out.print(resultado+" ");
                    }
                }else{
                    resultado=resultado+ (int) (Math.pow(2,j)*b);
                    System.out.print(resultado+" ");
                    if (i==1){
                        System.out.print(resultado+" ");
                    }
                }
            }
        }
    }



}
