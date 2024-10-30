

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
        
    }
}
