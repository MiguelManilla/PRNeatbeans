//Autor: Miguel Angel Castillo Manilla
//Descripcion: Este codigo muestra detalles de los distintos modelos de los carros

package Practica13;

public class Auto {
    String modelo;
    String color;
    String kilometros;
    int año;
    
    public void avanzar (){
        System.out.println("El auto recorrio 10 km");

                
    }
    public int Kilometrosrecorridos(int kilometros){
        return kilometros;
        
    }
    public static void main (String[]args){
        System.out.println("Aqui la clase");
        Auto objeto1;
        objeto1 = new Auto();
        System.out.println(objeto1.modelo);
        objeto1.modelo="BMW";
        System.out.println(objeto1.modelo);
        System.out.println(objeto1.color);
        objeto1.color="Rojo";
        System.out.println("Mi coche es de color: "+objeto1.color);
        objeto1.avanzar();
        objeto1.Kilometrosrecorridos(10);
         
        Auto objeto2=new Auto ();
        System.out.println("Este es el objeto");
        System.out.println(objeto2.modelo);
        objeto2.modelo="Ford";
        System.out.println(objeto2.modelo);
        
        Auto objeto3=new Auto();
        System.out.println("Este es el tercer objeto");
        System.out.println(objeto3.modelo);
        objeto3.modelo="Audi";
        System.out.println(objeto3.modelo);
        System.out.println(objeto3.color);
        objeto3.color="Verde";
        System.out.println("El modelo es: "+objeto3.modelo );
        System.out.println("El color del Audi es: "+objeto3.color);
        
        
        
        
    }
}
