
package pkg55.pkgabstract.pkg2;


public class Mercedes extends Araba{
    
    private String cantKalinligi;

    public Mercedes() {
    }

    public Mercedes(String cantKalinligi) {
        this.cantKalinligi = cantKalinligi;
    }

    public Mercedes(String model, String renk, double agirlik) {
        super(model, renk, agirlik);
    }

    public Mercedes(String model, String renk, double agirlik, String cantKalinligi) {
        super(model, renk, agirlik);
        this.cantKalinligi = cantKalinligi;
    }

    public String getCantKalinligi() {
        return cantKalinligi;
    }

    public void setCantKalinligi(String cantKalinligi) {
        this.cantKalinligi = cantKalinligi;
    }

    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Mercedes{" +"model=" + getModel() + ", renk=" + getRenk() + ", ağırlık =" + getAgirlik() + "cantKalinligi=" + cantKalinligi + '}';
    }

    @Override
    public double kmBasiKacLtBenzin() {
        return getAgirlik() * 2;
    }

    
    
    
    
    
}
