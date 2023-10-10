package matrices;
import java.util.Scanner;
import java.util.Random;

public class matricesmain {
        public static void main(String[] args) {
            //TODOcode application logic here

            Scanner sn = new Scanner(System.in);

            //Matriz cuadrada de 4x4
            int matriz[][] = new int[4][3];

            //Variables utilizadas
            boolean salir = false;
            int opcion, fila;

            //Utilizado para indicar si hemos entrado en la 1ª opcion
            boolean rellenado = false;
            //Menu
            do {
            //Mensajes del menu
                // System.out.println("Menu");
                System.out.println("1. Rellenar Matriz.");
                System.out.println("2. Sumar fila.");
                System.out.println("3. Salir.");
                System.out.println("4. Mostrar matriz.");
                System.out.println("5. Suma Diagonal.");
                System.out.println("6. Suma Diagonal Inversa.");
                opcion = sn.nextInt();
            switch (opcion) {
            case 1:
                rellenarMatriz(sn, matriz);

                //Ahora si podemos acceder al resto de opciones
                rellenado = true;
                break;
            case 2:
                if (rellenado) {
                //Validamos la fila
                do {
                    System.out.println("Elige una fila");
                    fila = sn.nextInt();
                } while (!(fila >= 0 && fila < matriz.length));
                    System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));
                } else {
                    System.out.println("Debes rellenar la matriz primero");
                }
                break;
            case 3:
                salir = true;
                break;
            case 4:
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        
                        System.out.print(matriz[i][j]+"---");
                    }
                    System.out.println("");
                }
                break;
                case 5:
                    if (rellenado) {
                    //Validamos la fila
                    do {
                        System.out.println("Elige una fila");
                        fila = sn.nextInt();
                    } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaDiagonal(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 6:
                    if (rellenado) {
                    //Validamos la fila
                    do {
                        System.out.println("Elige una fila");
                        fila = sn.nextInt();
                    } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaDiagonalInversa(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                default:
                System.out.println("Tienes que meter un valor entre 1 y 7");
        }
    } while (!salir);
        System.out.println("FIN");
    }
    /**
    * Rellena la matriz con valores insertados por el usuario
    *
    * @param sn
    * @param matriz
    */
    
    public static int sumaDiagonalInversa(int[][] matriz, int fila) {
        // int suma = 0;
        int x=matriz.length;    // Representa al valor de i (eje x)
        int y=0;                // Representa al valor de j (eje y)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (y<matriz[i].length){
                    y=matriz[i].length;
                }
            }
        }
        System.out.println("El valor de x es: "+x);
        System.out.println("El valor de y es: "+y);

        // for (int i = 0; i < matriz.length; i++) {
        //     for (int j = 0; j < matriz[i].length; j++) {
        //         if (i == j) {
        //             System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
        //             suma += matriz[i][j];
        //         }
        //     }
        // }
        return y;
    }
    public static int sumaDiagonal(int[][] matriz, int fila) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }
    
    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                //System.out.println("Escribe un numero en la posicion " + i + " " + j);
                Random rand = new Random();
                int numeroAleatorio = rand.nextInt(11);
                matriz[i][j] = numeroAleatorio;
                //matriz[i][j] = sn.nextInt();
            }
        }
    }
    /**
     * Suma los valores de una determinada fila
     *
     * @param matriz
     * @param fila
     * @return
     */
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }
    }
