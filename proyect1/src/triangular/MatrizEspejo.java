package triangular;
import java.util.Scanner;


public class MatrizEspejo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();

        // Crear una matriz cuadrada con el número máximo de columnas
        int columnasMaximas = filas * 2 - 1;
        int[][] matriz = new int[filas][columnasMaximas];

        // Llenar la matriz con datos en función del patrón deseado
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("Ingrese el valor para la fila " + (i + 1) + " columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();

                // Completar la parte espejo de la matriz
                int columnaEspejo = columnasMaximas - j - 1;
                matriz[i][columnaEspejo] = matriz[i][j];
            }
        }

        // Imprimir la matriz completa
        System.out.println("Matriz completa:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnasMaximas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

