public class Ejemplo3 {

    public static void main(String[] args) {
        Persona primeraPersona=new Persona();
        primeraPersona.setNombre("Luis");
        primeraPersona.setEdad(20);
        primeraPersona.setTelefono(7659402);

        Persona segundaPersona=new Persona();
        segundaPersona.setNombre("Carla");
        segundaPersona.setEdad(25);
        segundaPersona.setTelefono(6653462);

        System.out.println("Nombre: "+primeraPersona.getNombre()+ "\n"+
                              "Edad: "+primeraPersona.getEdad()+ " \n"+
                              "Telefono:"+primeraPersona.getTelefono());

        System.out.println("****************************************");

        System.out.println("Nombre: "+segundaPersona.getNombre()+" \n"+
                           "Edad: "+segundaPersona.getEdad()+" \n"+
                           "Telefono: "+segundaPersona.getTelefono());

    }
}
class Persona1{
    private int edad;
    private  String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}