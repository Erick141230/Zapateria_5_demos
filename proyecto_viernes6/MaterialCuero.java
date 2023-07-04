
/**
 * Write a description of class MaerialCuero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaterialCuero extends ClaseAtri
{
    private String materiall1;
   
    public MaterialCuero(String materiall1, int numZapatos, int num, int costos){
        super (numZapatos, num, costos);
        setMateriall(materiall1);
    }
    
    
    public String getMateriall(){
        return materiall1;
    }
    public void setMateriall(String materiall1){
        if (materiall1 != null) this.materiall1 = materiall1;
        else this.materiall1 = "";
    }
    
    int ValorTot(){
        int valorTotal = 0;
        valorTotal += getCostos();
        return valorTotal;
    }
}
