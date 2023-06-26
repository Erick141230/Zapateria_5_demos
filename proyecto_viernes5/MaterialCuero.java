
/**
 * Write a description of class MaterialCuero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaterialCuero
{
    private final String materiall;
    private int numZapatos;
    private int num;
    private int costos;
    
    public int getNumZapatos(){
        return numZapatos;
    }
    public void setNumZapatos(int numZapatos){
        if (numZapatos >= 0) this.numZapatos = numZapatos;
        else numZapatos = 0;
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
    
    
    MaterialCuero(String materiall, int numZapatos, int num, int costos){
        this.materiall = "Cuero";
        setNumZapatos(numZapatos);
        setNum(num);
        setCostos(costos);
    }
    
    
    int ValorTot(){
        int valorTotal = 0;
        valorTotal += costos;
        return valorTotal;
    }
}
