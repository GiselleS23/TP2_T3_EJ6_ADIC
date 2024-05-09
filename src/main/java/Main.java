/* 6.- Escriba un codigo que cuente de 1 hasta 3.000.000 de uno en uno. Cada vez que el contador llegue a un múltiplo de 1.000.000, muestre este número en la pantalla. Utilice su reloj para medir cuánto tiempo tarda cada repetición de 1.000.000 del ciclo.
Sacchetti Maria Giselle C2*/

import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int contador = 0;
    long tiempoInicio = System.currentTimeMillis(); 
    //currentTimeMillis(); se utiliza para obtener el tiempo actual en milisegundos antes y después del bucle while
    while (contador < 3000000){
      contador++;
      if (contador % 1000000 == 0){
        System.out.println(contador);
      }   
    }
    long tiempoFin = System.currentTimeMillis();
    long tiempoTotal = tiempoFin - tiempoInicio;
    System.out.println("Tiempo total: " + tiempoTotal + " milisegundos");
    
    scanner.close();
  }

}
