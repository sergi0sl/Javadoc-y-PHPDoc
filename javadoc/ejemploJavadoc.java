/**
 * Esta es una clase de ejemplo que contiene métodos para realizar operaciones
 * aritméticas básicas.
 */
public class ejemploJavadoc {

    /**
     * Suma dos números enteros.
     * 
     * @param x La primera entrada
     * @param y La segunda entrada
     * @return La suma de x e y
     */
    public int suma(int x, int y) {
        return x + y;
    }

    /**
     * Resta dos números enteros.
     * 
     * @param x El número del que se resta
     * @param y El número que se resta
     * @return La resta de x y y
     */
    public int resta(int x, int y) {
        return x - y;
    }

    /**
     * Multiplica dos números enteros.
     * 
     * @param x El primer factor
     * @param y El segundo factor
     * @return El producto de x e y
     */
    public int multiplicar(int x, int y) {
        return x * y;
    }

    /**
     * Divide dos números enteros.
     * 
     * @param x El dividendo
     * @param y El divisor
     * @return El resultado de la división de x por y
     * @throws ArithmeticException Si y es igual a cero
     */
    public int dividir(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return x / y;
    }
}
