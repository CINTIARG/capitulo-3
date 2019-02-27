
package Cap_3;

public class Gasprices {
    private Integer pricePerBarrel;
    
    public Gasprices(Integer x){
        this.pricePerBarrel=x;
    }

    public String Gasolina(){
        return String.format("Precio de la bomba: %.2f\nPrecio de galon: %.2f",this.pricePerBarrel*0.035,this.pricePerBarrel*0.04);
    }
            
    public Integer getPricePerBarrel() {
        return pricePerBarrel;
    }

    public void setPricePerBarrel(Integer pricePerBarrel) {
        this.pricePerBarrel = pricePerBarrel;
}
}
