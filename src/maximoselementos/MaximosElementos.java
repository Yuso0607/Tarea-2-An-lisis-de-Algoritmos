/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maximoselementos;

/**
 *
 * @author Gloriana
 */
public class MaximosElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloPrueba = {1, 7, 9, 0, 60, 89, 2, 8, 25, 6, 9, 1, 2, 3, 7, 8, 9, 100};
        System.out.println(MaximoDyV(arregloPrueba));
        
    }
    
    public static int MaximoDyV(int[] arreglo)
    {
        return MaximoDyV(arreglo, 0, arreglo.length - 1);
    }
    
    static int MaximoDyV(int[] arreglo, int inf, int sup)
    {
        if (inf == sup) return arreglo[inf];
        int medio = (inf + sup)/2;
        int maxIzq = MaximoDyV(arreglo, inf, medio);
        int maxDer = MaximoDyV(arreglo, medio+1, sup);
        return Math.max(maxIzq, maxDer);
    }
}
