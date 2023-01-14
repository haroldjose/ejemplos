import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class Solution6 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String auxiliar="";
      //  List<String>  letras = new ArrayList<>();
//        int small =0;
//        int large =0;
//        int numero=0;
        int cont = k-1;
        int limite=s.length()-cont;
        String[] letras=new String[limite];


        for (int i=0;i<limite;i++){
            auxiliar=s.substring(i,i+k);
            //letras.add(auxiliar);
            letras[i]=auxiliar;
        }
        //solucion con arraylist
//        letras.sort(null);
//        smallest=letras.get(0);
//        largest=letras.get(letras.size()-1);

        //Arrays.sort(letras);
        for(int i = 0; i < letras.length - 1; i++)
        {
            for(int j = i+1; j < letras.length; j++)
            {
                if(letras[i].compareTo(letras[j]) > 0)//words[i] is greater than words[j]
                {
                    String temp = letras[i];
                    letras[i] = letras[j];
                    letras[j] = temp;
                }
            }
        }
        smallest=letras[0];
        largest= letras[letras.length-1];


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

//    for (int j=0;j<auxiliar.length();j++){
//        numero=numero+(int)auxiliar.charAt(j);
//    }
//            if (numero>large){
//        largest=auxiliar;
//        large=numero;
//        numero=0;
//    }if (numero<large){
//        smallest=auxiliar;
//        small=numero;
//        numero=0;
//    }


//    if (auxiliar.compareTo(largest) <0 || auxiliar.compareTo(smallest)<0){
//        smallest=auxiliar;
//    }if (auxiliar.compareTo(largest)>0){
//        largest=auxiliar;
//    }
}
