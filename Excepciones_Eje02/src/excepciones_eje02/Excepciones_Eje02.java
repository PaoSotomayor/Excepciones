package excepciones_eje02;

/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para generar y capturar una excepción 
ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).
 */
public class Excepciones_Eje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int[] array = new int[6];

            array[8] = 25;
        } catch (Exception e) {
            System.err.println(" Indice fuera de rango");

        }finally{
            System.out.println(".......................");
        }

    }

}
