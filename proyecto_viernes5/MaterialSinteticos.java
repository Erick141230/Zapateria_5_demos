
/**
 * Write a description of class MaterialSintéticos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaterialSinteticos
{
    private final String materiall;
    private int numZapatos2;
    private int num;
    private int costos;
    
    public int getNumZapatos(){
        return numZapatos2;
    }
    public void setNumZapatos(int numZapatos2){
        if (numZapatos2 >= 0) this.numZapatos2 = numZapatos2;
        else numZapatos2 = 0;
    }
    
    
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        if (num >= 0) this.num = num;
        else this.num = 0;
    }
    
    
    public int getCostos(){
        return costos;
    }
    public void setCostos(int costos){
        if (costos >= 0) this.costos = costos;
        else this.costos = 0;
    }
    
    
    MaterialSinteticos(String materiall, int numZapatos2, int num, int costos){
        this.materiall = "Sinteticos";
        setNumZapatos(numZapatos2);
        setNum(num);
        setCostos(costos);
    }
    
    
    int ValorTot(){
        int valorTotal = 0;
        valorTotal += costos;
        return valorTotal;
    }
}
