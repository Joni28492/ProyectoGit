
import net.intergrupo.contacto.Contacto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno36
 */
public class PruebaContacto {
 
    
    
    public static void main(String[] args) {
        
        
       // System.out.println(Contacto.getNumeroDeContactos());//metodo static
        Contacto contacto1=new Contacto("Pepe", "987676767");
        Contacto contacto2=new Contacto("Juan", "987121212");
            
        
        Contacto.setNumeroDeContactos(2);//se cambia el dato a traves de la correspondiente clase 
        
        System.out.println("Nº contactos: " + Contacto.getNumeroDeContactos());
        
        System.out.println("contacto 1: " + contacto1.getNombre() );
        System.out.println("contacto 2: " + contacto2.getNombre() );
        
        
    }
    
}
