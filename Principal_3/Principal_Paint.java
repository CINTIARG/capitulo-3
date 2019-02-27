
package Principal_3;

import Cap_3.PaintCalculator;

public class Principal_Paint {
    public static void main(String [] args){
        
    PaintCalculator pc= new PaintCalculator(30, 30, 1);
      Double costo= pc.calcularGasto();
      
    PaintCalculator pc2= new PaintCalculator(10, 10, 10);
    Double costo2= pc.calcularGasto();
    }
}
