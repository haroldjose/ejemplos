
public class Ejemplo1 {

    public static void main(String[] args) {

        Coche nuevoCoche=new Coche();
        nuevoCoche.incrementarPuertas();
        System.out.println(nuevoCoche.numeroPuertas);

       int resultado= suma(3,5,7);
        System.out.println(resultado);


    }

    public static int suma(int a, int b, int c){

        return a+b+c;
    }
}
class  Coche{
    public int numeroPuertas=0;

    public void incrementarPuertas(){
        this.numeroPuertas++;
    }
}
