
package Cap_3;

public class PaintCalculator {
    private Integer length;
    private Integer height;
    private Integer width;
    
    public PaintCalculator(Integer l, Integer h, Integer w){
        this.length= l;
        this.height=h;
        this.width=w; 
    }
    public Integer calcularArea(){
        return 2*height*width+ 2*height*length;
    }
    public Double CalcularGalones(){
        return calcularArea()/350;
    }
    public Double calcularGasto(){
        return CalcularGalones()/32;
    }
}
