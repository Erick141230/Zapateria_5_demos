/**
 * Write a description of class MterialCaucho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaterialCaucho extends ClaseAtri
{
    private String materiall3;
    
    public MaterialCaucho(int numZapatos, int num, String materiall3, int costos) throws Exception{
        super (numZapatos, num, costos);
        setMateriall(materiall3);
    }
    
    
    public String getMateriall(){
        return materiall3;
    }
    public void setMateriall(String materiall3){
        if (materiall3 != null) this.materiall3 = materiall3;
        else this.materiall3 = "";
    }
    
    
    int ValorTot(){
        int valorTotal = 0;
        valorTotal += getCostos();
        return valorTotal;
    }
}
