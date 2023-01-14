public class Ejercicio4 {
    public static void main(String[] args) {
        Cliente cliente=new Cliente();
        cliente.setEdad(25);
        cliente.setNombre("Julia");
        cliente.setTelefono(65328901);
        cliente.setCredito(23000);
        System.out.println("Nombre: "+cliente.getNombre()+"\n"+
                           "Edad: "+cliente.getEdad()+"\n"+
                           "Telefono: "+cliente.getTelefono()+"\n"+
                           "Credito: "+cliente.getCredito());

        System.out.println("*********************************************");
        Trabajador trabajador=new Trabajador();
        trabajador.setEdad(22);
        trabajador.setNombre("Julian");
        trabajador.setTelefono(65328901);
        trabajador.setSalario(3000);
        System.out.println("Nombre: "+trabajador.getNombre()+"\n"+
                "Edad: "+trabajador.getEdad()+"\n"+
                "Telefono: "+trabajador.getTelefono()+"\n"+
                "Salario: "+trabajador.getSalario());

    }
}
class Persona{
    private int edad;
    private String nombre;
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
class  Cliente extends Persona{
    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}