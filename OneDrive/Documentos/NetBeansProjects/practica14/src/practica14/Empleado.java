//Autor: Miguel Angel Castillo Manilla
//Descripcion: Este codigo guarda datos de los empleados y calcula cuántos años llevan trabajando.

package practica14;


public class Empleado {
    String nombre;
    String puesto;
    String departamento;
    int año;

    public void consultar() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Departamento: " + departamento);
        System.out.println("Año: " + año);
    }

    public int calcularAñosDeServicio(int añoActual) {
        return añoActual - año;
    }
    public void actualizarPuesto(String nuevoPuesto){
        puesto=nuevoPuesto;
        System.out.println("El puesto ha sido actualizado a:"+puesto);
    }
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Miguel Castillo";
        empleado1.puesto = "Gerente";
        empleado1.departamento = "Administracion";
        empleado1.año = 2015;
    
        empleado1.consultar();
        System.out.println("Años de servicio: " + empleado1.calcularAñosDeServicio(2024));
        System.out.println();
        System.out.println("Datos actualizados.");
        System.out.println();
        empleado1.actualizarPuesto("Gerente");
        empleado1.consultar();        
      
    }
}