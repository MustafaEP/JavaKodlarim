
package pkg55.pkgabstract.pkg2;


public class Bmw extends Araba{
    
    private int devirSayisi;

    public Bmw() {
    }

    public Bmw(String model, String renk, double agirlik, int devirSayisi) {
        super(model, renk, agirlik);
        this.devirSayisi = devirSayisi;
    }

    public int getDevirSayisi() {
        return devirSayisi;
    }

    public void setDevirSayisi(int devirSayisi) {
        this.devirSayisi = devirSayisi;
    }

    
    
    
    @Override
    public String toString() {
        return "Bmw{" +"model=" + getModel() + ", renk=" + getRenk() + ", agirlik=" + getAgirlik()+ "devirSayisi=" + devirSayisi + '}';
    }

    @Override
    public double kmBasiKacLtBenzin() {
        return getAgirlik() * 3;
    }
    
    
    
    
}
