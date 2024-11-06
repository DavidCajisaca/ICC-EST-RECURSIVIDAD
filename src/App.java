

public class App {
    public static void main(String[] args) throws Exception {
        Recursividad re = new Recursividad();
        Renombrar renombrar = new Renombrar();

        System.out.println(re.factorial(5));
        System.out.println(re.sumaconsecutivos(5));
        System.out.println(re.potencia(5, 5));
        System.out.println(("La suma de los digitos es ---> ")+re.sumadigitos(456));
        System.out.println(("El fibonacci ---> ")+re.fibonacci(9));
        renombrar.renombrardirectorio("src\\carpeta"); 
        //Llamar metodo busqueda binaria 
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int busqueda = 5;
        int inicio = 0;
        int fin = array.length - 1;
        System.out.println(("La busqueda en binaria ---> ")+re.busquedaBinaria(array, busqueda, inicio, fin));
        //Llamar metodo busqueda secuencial
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int busqueda2 = 3;
        int indice = 0;
        System.out.println(("La busqueda en secuencial ---> ")+re.busquedaSecuencial(array2, busqueda2, indice));
        
    }
}
