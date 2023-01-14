import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numeroif=s.nextInt();

        if (numeroif>0){
            System.out.println("El numero es positivo");
        }if (numeroif==0){
            System.out.println("el numero es 0");
        }if (numeroif<0){
            System.out.println("el numero es negativo");
        }

        System.out.println("*********Ejercicio while**************");
        int numeroWhile=0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("*********Ejercicio do while**************");

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3);

        System.out.println("*********Ejercicio for **************");

        for (int numeroFor=0;numeroFor <=3;numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("*********Ejercicio switch **************");

        System.out.println("Ingrese el numero del mes para saber en que estacion del año esta: ");
        int estacion=s.nextInt();
        switch (estacion){
            case 3:
            case 4:
            case 5:
                System.out.println("Estas en Primavera");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Estas en Verano");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Estas en Otoño");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println("Estas en Invierno");
                break;

            default:
                System.out.println("Mes y estacion no existen");
        }
    }
}
