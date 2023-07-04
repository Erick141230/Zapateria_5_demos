/**
 * Write a description of class ClaseAtri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ClaseAtri
{
    protected final int numZapatos;
    private int num;
    private int costos;
    
    public int getNumZapatos(){
        return numZapatos;
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
    
    
    int ValorTot(){
        return 0;
    }
    
    public ClaseAtri(int numZapatos, int num, int costos) throws Exception {
        if(numZapatos == 0){
            throw new Exception("valor invalido de zapatos");
        }
        this.numZapatos = numZapatos;
        
        setNum(num);
        setCostos(costos);
    }
}

