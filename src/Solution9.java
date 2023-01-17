import java.io.*;
import java.util.*;

public class Solution9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.trim().length()==0){
            System.out.println(0);
        }else{

            String[] letter=s.trim().split("[!,?._'@\\s]+");


            System.out.println(letter.length);
            for (String res: letter){
                System.out.println(res);
            }
        }
        scan.close();
    }
}
