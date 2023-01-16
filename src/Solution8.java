
import java.util.Scanner;

public class Solution8 {

    static boolean isAnagram(String a, String b) {
        boolean resultado=false;
        int cont1=0;
        int cont2=0;
     if (a.length()==b.length()){
       for (int i=0;i<a.length();i++){
         for (int j=0;j<b.length();j++){
            if (a.toLowerCase().charAt(i) == a.toLowerCase().charAt(j)){
                cont1++;
            }
            if (a.toLowerCase().charAt(i)==b.toLowerCase().charAt(j)){
                cont2++;
            }
        }

        if (cont1==cont2){
            resultado=true;
            cont1=0;
            cont2=0;
            continue;
        }
        else {
            return false;
        }
       }
    }else{
         resultado=false;
     }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }


}
