
/**
 * Write a description of class zapatos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zapat
{
    int numZapatos;
    int costos;
    int num;

    
    zapat(int numZapatos, int costos, int num){
        this.numZapatos = numZapatos;
        this.costos = costos;
        this.num = num;
    }
    
    double valorTot(){
        double valorTotal = 0;
        valorTotal += costos;
        return valorTotal;
    }
}
