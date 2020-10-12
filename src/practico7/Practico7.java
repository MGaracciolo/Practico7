/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico7;

/**
 *
 * @author mgara
 */
public class Practico7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1=new Cliente("Juan Jose","Barrera","Mendoza","Las Heras",40221380);
        Cliente c2=new Cliente("Carina","Aloi","Buenos Aires","Av Alvarez Jonte",20619607);
        Cliente c3=new Cliente("Juan Jose","Barrera","Mendoza","Las Heras",40221380);
        Cliente c4=new Cliente("Marianela Belen","Garacciolo","Buenos Aires","Av Alvarez Jonte 7550",40730583);
        Directorio directorioPersonas= new Directorio();
        long t= 266430086;
        long t2=265720495;
        String apellido="Barrera";
        
        directorioPersonas.agregarCliente(c1, 266430086);
        directorioPersonas.agregarCliente(c2, 154587912);
        directorioPersonas.agregarCliente(c3, 664300866);
        directorioPersonas.agregarCliente(c4,265720495);
        System.out.println("Los clientes de la ciudad de Mendoza son: ");
        System.out.println(directorioPersonas.buscarClientes("Buenos Aires"));
        System.out.println("El cliente con telefono "+t+" es: ");
        System.out.println(directorioPersonas.buscarCliente(t));
        System.out.println("El cliente con telefono "+t2+" es:");
        System.out.println(directorioPersonas.buscarCliente(t2));
        System.out.println("El/Los telefonos de "+apellido+" es/son:");
        System.out.println(directorioPersonas.buscarTelefono(apellido));
        directorioPersonas.borrarCliente(40730583);
    } 
}
    
