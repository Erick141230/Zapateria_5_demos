
/**
 * Write a description of class MaterialCaucho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaterialCaucho
{
    private final String materiall;
    private int numZapatos3;
    private int num;
    private int costos;
    
    public int getNumZapatos(){
        return numZapatos3;
    }
    public void setNumZapatos(int numZapatos3){
        if (numZapatos3 >= 0) this.numZapatos3 = numZapatos3;
        else numZapatos3 = 0;
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
    
    
    MaterialCaucho(String materiall, int numZapatos3, int num, int costos){
        this.materiall = "Caucho";
        setNumZapatos(numZapatos3);
        setNum(num);
        setCostos(costos);
    }
    
    
    int ValorTot(){
        int valorTotal = 0;
        valorTotal += costos;
        return valorTotal;
    }
}
