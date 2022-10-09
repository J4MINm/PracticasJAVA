import java.util.Scanner;
public class Suma {
    public static void main(String[] args){

        // 'ems' Scanner for input
        Scanner ems = new Scanner(System.in);
        
        // Atributos
        float Numero1, Numero2, Resultado;

        System.out.println("\n;;;;;; ## __ SUMA DE DOS NUMEROS __ ## ;;;;;;;");
        System.out.print("\nIngresa primer numero:  ");
        Numero1 = ems.nextFloat();
        System.out.print("Ingresa segundo numero: ");
        Numero2 = ems.nextFloat();

        // Operation
        Resultado = Numero1 + Numero2;

        // Print 'Resultado'
        System.out.println("\nEl resultado es: "+Resultado);
    }
}
