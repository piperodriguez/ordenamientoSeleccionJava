import java.util.Scanner;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nelementos,aux, minimo;
        System.out.println("Digite la cantidad de elementos: ");
        nelementos = entrada.nextInt();
        arreglo = new int[nelementos];
        for (int i = 0; i< nelementos; i++) {
            System.out.println("paso : "+(i+1)+" digite un numero");
            arreglo[i] = entrada.nextInt();
        }
        for (int i = 0; i<(nelementos-1);i++) {
            minimo = 1;
            for (int j = i+1; j<(nelementos);j++) {
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[minimo];
            arreglo[minimo] = aux;
        }
        System.out.println("elementos del arreglo organizados en seleccion");
        for (int i=0; i < nelementos; i++) {
            System.out.print(arreglo[i]+"   ");
        }
    }
}