package ArreglosMultidimensionales;

public class AnalizadorDeMatrices {

    public int contarCeros(double[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public int contarElementosEnElRango(double[][] matriz, double desde, double hasta) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > desde && matriz[i][j] < hasta) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public boolean esCuadradoMagico(int[][] matriz) {
        int suma = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;
        boolean esMagico = true;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[0][i];
        }

        for (int i = 0; i < matriz.length && esMagico; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;

            diagonal1 += matriz[i][i];
            diagonal2 += matriz[i][matriz.length - i - 1];

            for (int j = 0; j < matriz[i].length && esMagico; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if (sumaFila != suma || sumaColumna != suma) {
                esMagico = false;
            }
        }

        return diagonal1 == suma && diagonal2 == suma && esMagico;
    }

    public int cerosEnColumnas(int[][] matriz) {
        int contador = 0;
        boolean cero = true;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length && cero; i++) {
                cero = matriz[i][j] != 0;

            }
            if (cero) {
                contador++;

            }
        }
        return contador;

    }
}
