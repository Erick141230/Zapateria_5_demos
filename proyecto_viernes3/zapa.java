
/**
 * Write a description of class zapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zapa
{
    private int numZapatos;
    private int num;
    private int costos;
    
    public int getNumZapatos(){
        return numZapatos;
    }
    public void setNumZapatos(int numZapatos){
        if (numZapatos >= 0) this.numZapatos = numZapatos;
        else this.numZapatos = 0;
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
    
    
    zapa(int numZapatos, int num, int costos){
        setNumZapatos(numZapatos);
        setNum(num);
        setCostos(costos);
    }
    
    
    double valorTot(){
        double valorTotal = 0;
        valorTotal += costos;
        return valorTotal;
    }
}
