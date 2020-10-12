package practico7;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Directorio {
    private TreeMap<Long,Cliente> clientes= new TreeMap<>();
    
    public void agregarCliente(Cliente cliente, long telefono) {
        Cliente c= clientes.put(telefono,cliente);
        if(c!=null){
            System.out.println("No se pudo agregar al cliente "+cliente.getNombre()+" en el directorio.");
        }else{
            System.out.println("Se agrego al cliente "+cliente.getNombre()+" en el directorio exitosamente.");
        }
    }

    public Cliente buscarCliente(long telefono) {
        return clientes.get(telefono);
    }


    public List<Long> buscarTelefono(String apellido) {
        List<Long>clientesAux= new ArrayList<>();
            for(Long t : clientes.keySet()){ 
             Cliente c=clientes.get(t);
              if(c.getApellido().equals(apellido)){ 
                  clientesAux.add(t);
              }
            }
            if(clientesAux.isEmpty()){
                System.out.println("No se encontraron clientes con ese apellido");
            }
         return clientesAux;
    }
    
    public List<Cliente> buscarClientes(String ciudad){
         List<Cliente>clientesAux= new ArrayList<>();
            for(Long t : clientes.keySet()){ 
             Cliente c=clientes.get(t);
              if(c.getCiudad().equals(ciudad)){ 
                  clientesAux.add(c);
              }
            }
            if(clientesAux.isEmpty()){
                System.out.println("No se encontraron clientes en esa ciudad");
            }
         return clientesAux;
     }

   

    public void borrarCliente(long dni){
        boolean aux=false;
        Set<Long> claves = clientes.keySet();
        Iterator<Long> it = claves.iterator();
        long cla;
        while(it.hasNext()){
            cla=it.next();
            if(clientes.get(cla).getDni()==dni){
                it.remove();
                System.out.println("El cliente con dni: "+dni+" fue borrado exitosamente");
                aux=true;
            }
        }
        if(!aux){
            System.out.println("El cliente con dni: "+dni+" no se encontro en la lista");
        }
    }
}
