
/**
 * Write a description of class MaterialSinte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaterialSinte extends ClaseAtri
{
    private String materiall2;
   
    public MaterialSinte(String materiall2, int numZapatos, int num, int costos){
        super (numZapatos, num, costos);
        setMateriall(materiall2);
    }
    
    
    public String getMateriall(){
        return materiall2;
    }
    public void setMateriall(String materiall2){
        if (materiall2 != null) this.materiall2 = materiall2;
        else this.materiall2 = "";
    }
    
    int ValorTot(){
        int valorTotal = 0;
        valorTotal += getCostos();
        return valorTotal;
    }
}
