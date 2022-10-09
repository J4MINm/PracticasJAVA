import java.util.Scanner;
public class Resta {
    public static void main(String[] args){
        Scanner ems = new Scanner(System.in);
        float Numero1, Numero2, Resultado;
        System.out.print("\n;;;; ### RESTA DE DOS NUMEROS ### ;;;;");
        System.out.print("\nIngresa primer numero: ");
        Numero1 = ems.nextFloat();
        System.out.print("Ingresa segundo numero: ");
        Numero2 = ems.nextFloat();

        // Operacion
        Resultado = Numero1-Numero2;

        // Print 'Resultado'
        System.out.println("\nEl resultado es: "+Resultado);
    }
}
