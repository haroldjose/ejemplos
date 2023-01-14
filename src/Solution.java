import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("================================");
        for(int i=0;i<1;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
            String s1="python";
            int x=5;
            String resultado=s1;
            String numero=Integer.toString(x);
           while (resultado.length()<15){
               resultado=resultado+"-";
           }
           if (resultado.length()==15 && resultado.length()<19){
               if (numero.length()==2){
                   numero="0"+ numero;
               } else if (numero.length()==1) {
                   numero="00"+ numero;
               }
               resultado=resultado+numero;

            }
            System.out.println(resultado);

        }
      //  System.out.println("================================");

    }
}
