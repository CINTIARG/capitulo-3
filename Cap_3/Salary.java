
package Cap_3;


public class Salary {
    private Integer sh;
    private Integer h;
    private Integer he;
    
    public Salary(Integer x,Integer y,Integer z){
        this.sh=x;
        this.h=y;
        this.he=z;
    }

    public Integer SalarioS(){
        return ((this.getSh()*this.getH())*5);
    }
    
    public double HorasE(){
        return (this.getHe()*(this.getSh()*1.5))*5;
    }
    
    public String toString(){
        return String.format("Horas: %d\nHoras extra: %d\nSalario semanal: %.2f",this.getH(),this.getHe(),this.SalarioS()+this.HorasE());
    }

    public Integer getSh() {
        return sh;
    }

    public void setSh(Integer sh) {
        this.sh = sh;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getHe() {
        return he;
    }

    public void setHe(Integer he) {
        this.he = he;
    }
    
}

