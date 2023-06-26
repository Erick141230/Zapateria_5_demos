
/**
 * Write a description of class object here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class object
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
  
        zaátps[] zapatos = new zaátps[50];
        int numZapatos, costos = 0, num;
        double valorTotal = 0;
        int talla_35 = 0, talla_36 = 0, talla_37 = 0, talla_38 = 0, talla_39 = 0, talla_40 = 0;       
        
        System.out.println("Digite cuantos pares de zapatos se adquirieron: ");
        numZapatos = sc.nextInt();
        
        for (int i = 0; i < numZapatos; i++){
            System.out.println("Digite la talla del par de zapatos");
            num = sc.nextInt();
            System.out.println("Digite el costo del par de zapatos");
            costos = sc.nextInt();
            // We create a switch statement based on the size number
            switch (num) {
                case 35:
                    talla_35 = talla_35 + 1;
                    break;
                case 36:
                    talla_36 = talla_36 + 1;
                    break;
                case 37:
                    talla_37 = talla_37 + 1;
                    break;
                case 38:
                    talla_38 = talla_38 + 1;
                    break;
                case 39:
                    talla_39 = talla_39 + 1;
                    break;
                case 40:
                    talla_40 = talla_40 + 1;
                    break;
                default:
                    System.out.println("La talla ingresada no es valida.");
                    break;
                }
            zaátps unPar = new zaátps();
            unPar.numZapatos = numZapatos;
            unPar.num = num;
            unPar.costos = costos;
            zapatos[i] = unPar;
        }
        
        for (int i = 0; i < numZapatos; i++) {
            // The cost of each shoe entered into the system is added to the variable valorTotal
            valorTotal = valorTotal + zapatos[i].costos;
        }
        
        System.out.println("Se compro "+ talla_35 +" pares de zapatos de la talla 35.");
        System.out.println("Se compro "+ talla_36 +" pares de zapatos de la talla 36.");
        System.out.println("Se compro "+ talla_37 +" pares de zapatos de la talla 37.");
        System.out.println("Se compro "+ talla_38 +" pares de zapatos de la talla 38.");
        System.out.println("Se compro "+ talla_39 +" pares de zapatos de la talla 39.");
        System.out.println("Se compro "+ talla_40 +" pares de zapatos de la talla 40.");
        System.out.println("Con un gasto total de: " + valorTotal + " pesos");
    }
}
