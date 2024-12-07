//Autor: Miguel Angel Castillo Manilla
//Descripcion:Este codigo funciona para poder ingresar el costo de la compra y con cuanto efectivo vas a pagar
//para despues de calcular los valores y te aparezca el cambio, todo estos datos se veran en una ventana emergente

package practica12;

import javax.swing.JOptionPane;

public class Practica12 {
    public static void main(String[] args) {
        String totalStr = JOptionPane.showInputDialog(null, "Ingresa el costo total de la compra:", 
                "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
        float total = Float.parseFloat(totalStr); 

        String pagoStr = JOptionPane.showInputDialog(null, "Ingresa la cantidad con la que se va a pagar:", 
                "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
        float pago = Float.parseFloat(pagoStr);

        float cambio = pago - total;

        JOptionPane.showMessageDialog(null, "El cambio es: " + cambio, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

