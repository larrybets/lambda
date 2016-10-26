/**
 * Created by DAM on 26/10/16.
 */
public class EjemploLambda {
    public static void main(String[] args) {

        ITallaString talla = (palabra) -> {
            return palabra.substring(0, 3);

        };
        String t = talla.tallaString("salchicha");
        System.out.println(t);


        IsumaNumero suma = (primero, segundo) -> {
            return primero + segundo;
        };
        int num = suma.sumaNumbers(8, 8);
        System.out.println(num);

        IreadNumero muestra
    }

}
