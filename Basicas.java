import java.util.Arrays;

public class Basicas {

    /**
     * post: Cuenta la cantidad de elementos de un array.
     * 
     * @param a array de números.
     * @return cantidad de elementos del array.
     */
    public int contarValores(int[] a) {
        return a.length;
    }

    /**
     * post: Cuenta la cantidad de elementos pares que hay en un array.
     * 
     * @param a el array de números
     * @return la cantidad de elementos pares.
     */
    public int contarValoresPares(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * post: Cuenta la cantidad de valores positivos de un array.
     * 
     * @param a el array de números.
     * @return la cantidad de valores positivos del array.
     */
    public int contarValoresPositivos(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * post: Cuenta la cantidad de elementos con indice par de un array
     * 
     * @param a array de números
     * @return la cantidad de de elementos con indice par del aray.
     */
    public int contarValoresPosicionPar(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    // forma planteada por el profesor
    public int contarPosicionPar(int[] a) {
        int resultado = a.length / 2;
        if (a.length % 2 != 0) {
            resultado += 1;
        }
        return resultado;

    }

    /**
     * post: Suma todos los elementos de un array.
     * 
     * @param a array de numeros.
     * @return suma de los elementos
     */
    public int sumarValores(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return suma;
    }

    /**
     * post: Suma todos los valores pares de un array.
     * 
     * @param a array de números.
     * @return suma de los valores pares
     */
    public int sumarValoresPares(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                suma += a[i];
            }
        }
        return suma;
    }

    /**
     * post: Suma los elementos positivos de un array.
     * 
     * @param a array de números.
     * @return la suma de los valores positivos.
     */
    public int sumaValoresPositivos(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                suma += a[i];
            }
        }
        return suma;
    }

    /**
     * post: suma los valores positivos de un array.
     * 
     * @param a array de números.
     * @return suma de valores positivos.
     */
    public int sumarValoresPosicionPar(int[] a) {
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                resultado += a[i];
            }
        }
        return resultado;
    }

    /**
     * post: Promedia el valor de los elementos de un array.
     * 
     * @param a array de números.
     * @return promedio del valor de los elementos.
     */
    public double promediarValores(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return suma / (a.length);
    }

    /**
     * post: Promedia el valor de elementos pares de un array
     * 
     * @param a Array de números.
     * @return Promedio del valor de los elementos pares.
     */
    public double promediarValoresPares(int[] a) {
        int contador = 0;
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                suma += a[i];
                contador++;
            }
        }
        return suma / contador;
    }

    /**
     * post: Promedia el valor de los elementos positivos de un array.
     * 
     * @param a Array de números.
     * @return Promedio del valor de los elementos positivos.
     */
    public double promediarValoresPositivos(int[] a) {
        int contador = 0;
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                suma += a[i];
                contador++;
            }
        }
        return suma / contador;
    }

    /**
     * post: Promedia los valores que tengan indice par en un array.
     * 
     * @param a array de números
     * @return promedio de los valores de indice par.
     */

    public double promediarValoresPosicionPar(int[] a) {
        int contador = 0;
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                contador++;
                suma += a[i];
            }
        }
        return suma / contador;
    }

    /**
     * Pisa los valores de un arreglo al evaluar 3 condiciones:
     * a)que el valor sea 0, b) que sea el primer elemento, c)que sea el ultimo
     * elemento
     * 
     * @param a       Array de números
     * @param pisador Valor que pisara en caso de cumplirse las condiciones
     * @return Array con los elementos pisados.
     */
    public int[] pisarValores(int[] a, int pisador) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                a[i] = pisador;
            } else if (a[i] == 0) {
                a[i] = pisador;
            } else if (i == a.length - 1) {
                a[i] = pisador;
            }
        }
        return a;
    }

    /**
     * Invierte todos los elementos del array.
     * 
     * @param a Array de números
     * @return Arreglo invertido.
     */
    public int[] invertirArreglo(int[] a) {
        int aux = 0;
        int tam = a.length;
        for (int i = 0; i < (tam / 2); i++) {
            aux = a[i];
            a[i] = a[tam - i - 1];
            a[tam - i - 1] = aux;
        }

        return a;
    }

    /**
     * Busca el valor mas grande de un array.
     * 
     * @param a Array de números.
     * @return Valor más grande de los elementos del array.
     */
    public int buscarMax(int[] a) {
        int candidato = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > candidato) {
                candidato = a[i];
            }
        }
        return candidato;
    }

    /**
     * Buscar el valor mas chico de un array.
     * 
     * @param a Array de números.
     * @return Valor mas chico de los elementos de un array
     */
    public int buscarMin(int[] a) {
        int candidato = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < candidato) {
                candidato = a[i];
            }
        }
        return candidato;
    }

    /**
     * Devuelve un nuevo array con la unión de otros 2 arrays de números
     * 
     * @param a Primer array de números.
     * @param b Segundo array de números.
     * @return Array de la unión de los arrays anteriores.
     */
    public int[] unirElementos(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        return c;
    }

    /**
     * Post: Separa un array en dos array de la mitad del tamaño del anterior
     * 
     * @param a arreglo de números.
     */
    public void separarArreglos(int[] a) {
        int[] b = new int[a.length / 2];
        int[] c = new int[a.length - b.length];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = a[b.length + i];
        }

        System.out.println("array original: " + Arrays.toString(a));
        System.out.println("Primer mitad array: " + Arrays.toString(b));
        System.out.println("Segunda mitad array: " + Arrays.toString(c));
    }

    /**
     * post: Mueve los enteros negativos a la izquierda del array.
     * 
     * @param a Array de números.
     * @return El array con los enteros negativos desplazados a la izquierda.
     */
    public int[] moverEnterosNegativos(int[] a) {
        int aux = 0;
        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                aux = a[i];
                a[i] = a[cont];
                a[cont] = aux;

                cont++;
            }
        }
        System.out.println(cont);
        return a;

    }

    public static void main(String[] args) {
        Basicas bc = new Basicas();

        int[] a = { 2, 4, 3, 6, 9, 13, 11, -2 };

        System.out.println("1a)Cantidad de elementos: " + bc.contarValores(a));
        System.out.println("1b)cantidad de valores pares: " + bc.contarValoresPares(a));
        System.out.println("1c)Cantidad de valores positivos: " + bc.contarValoresPositivos(a));
        System.out.println("1d)Cantidad de valores de posicion par: " + bc.contarValoresPosicionPar(a));

        int[] b = { 1, 2, 3, 4, 5, -7, -2 };

        System.out.println("\n" + "2a)Suma de elementos: " + bc.sumarValores(b));
        System.out.println("2b)suma de elementos pares: " + bc.sumarValoresPares(b));
        System.out.println("2c)suma de elementos positivos : " + bc.sumaValoresPositivos(b));
        System.out.println("2d)SumaPosicionesPares: " + bc.sumarValoresPosicionPar(b));

        int[] c = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("\n3a)Promedio de los elementos: " + bc.promediarValores(c));
        System.out.println("3b)Promedio de los elementos pares: " + bc.promediarValoresPares(c));
        System.out.println("3c)Promedio de los elementos positivos: " + bc.promediarValoresPositivos(c));
        System.out.println("3d)Promedio de los elementos de posición par: " + bc.promediarValoresPosicionPar(c));

        int[] e = { 4, 8, 0, -2 };

        System.out.println("\nArreglo original: " + Arrays.toString(e));
        System.out.println("4)Pisar valores: " + Arrays.toString(bc.pisarValores(e, 3)));

        int[] f = { 1, 3, 5, 7, -6, -3 };

        System.out.println("\n5)Arreglo original: " + Arrays.toString(f) +
                "\n Arreglo invertido: " + Arrays.toString(bc.invertirArreglo(f)));

        System.out.println("\nArreglo original: " + Arrays.toString(f));
        System.out.println("6)Maximo del arreglo: " + bc.buscarMax(f));
        System.out.println("6)Minimo del arreglo: " + bc.buscarMin(f));

        System.out.println("\n8)Arreglo original 1: " + Arrays.toString(e) +
                "\nArreglo original 2: " + Arrays.toString(f) +
                "\nArreglo unido: " + Arrays.toString(bc.unirElementos(e, f)));

        int[] g = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("\n9)Separación de array: ");
        bc.separarArreglos(g);

        int[] h = { -1, 1, 2, -3, 6, 8, -2, -20 };
        System.out.println("\nArray original: " + Arrays.toString(h) +
                "\n10)Negativos a la izquierda: " + Arrays.toString(bc.moverEnterosNegativos(h)));

    }

}
