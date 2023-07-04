
/**
 * Write a description of class Precios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Precios
{
    static int talla_35 = 0, talla_36 = 0, talla_37 = 0, talla_38 = 0, talla_39 = 0, talla_40 = 0;
    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);    
        Zapateria miZapate = new Zapateria("76542","Zapatos bendicion","Fontibon");
        String materiall1 = "", materiall2 = "", materiall3 = "";
        int valorTotal = 0;
        
        System.out.println("Digite el numero de pares de zapatos comprados: ");
        int numZapatos1 = sc.nextInt();
        
        
        for(int i = 0; i < numZapatos1; i++){
            int num, costos;
            do {
                System.out.println("Digite el material del zapato 'cuero'");
                materiall1 = sc.next();
            }while (materiall1 == "cuero");
            System.out.println("Digite la talla del par de zapatos");
            num = sc.nextInt();
            System.out.println("Digite el costo del par de zapatos");
            costos = sc.nextInt();
            agregarTalla(num);
            miZapate.adicionarZapa(materiall1, numZapatos1, num, costos);
        }
        
        
        System.out.println("Digite el numero de pares de zapatos comprados: ");
        int numZapatos2 = sc.nextInt();
        
        for(int i = 0; i < numZapatos2; i++){
            int num, costos;
            do {
                System.out.println("Digite el material del zapato 'sintetico'");
                materiall2 = sc.next();
            } while (materiall2 == "sintetico");
            System.out.println("Digite la talla del par de zapatos");
            num = sc.nextInt();
            System.out.println("Digite el costo del par de zapatos");
            costos = sc.nextInt();
            agregarTalla(num);
            miZapate.adicionarZapaSinteticos(materiall2, numZapatos2, num, costos);
        }
        
        
        System.out.println("Digite el numero de pares de zapatos comprados: ");
        int numZapatos3 = sc.nextInt();
        
        for(int i = 0; i < numZapatos3; i++){
            int num, costos;
            do {
                System.out.println("Digite el material del zapato 'caucho'");
                materiall3 = sc.next();
            } while (materiall3 == "caucho");
            System.out.println("Digite la talla del par de zapatos");
            num = sc.nextInt();
            System.out.println("Digite el costo del par de zapatos");
            costos = sc.nextInt();
            agregarTalla(num);
            miZapate.adicionarZapaCaucho(materiall3, numZapatos3, num, costos);
        }
        
        
        valorTotal = miZapate.ValorTotal();
        System.out.println("Se compro "+ talla_35 +" pares de zapatos de la talla 35.");
        System.out.println("Se compro "+ talla_36 +" pares de zapatos de la talla 36.");
        System.out.println("Se compro "+ talla_37 +" pares de zapatos de la talla 37.");
        System.out.println("Se compro "+ talla_38 +" pares de zapatos de la talla 38.");
        System.out.println("Se compro "+ talla_39 +" pares de zapatos de la talla 39.");
        System.out.println("Se compro "+ talla_40 +" pares de zapatos de la talla 40.");
        System.out.println("Con un gasto total de: " + valorTotal +" pesos");
    }
    
    
    public static void agregarTalla(int num) {
        switch (num) {
            case 35:
                talla_35 ++;
                break;
            case 36:
                talla_36 ++;
                break;
            case 37:
                talla_37 ++;
                break;
            case 38:
                talla_38 ++;
                break;
            case 39:
                talla_39 ++;
                break;
            case 40:
                talla_40 ++;
                break;
            default:
                System.out.println("La talla ingresada no es válida.");
            break;
        }
    }
}

    