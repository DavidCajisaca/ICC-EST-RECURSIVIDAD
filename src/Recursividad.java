

public class Recursividad {
    public int factorial(int n) {
        //Caso base :  n sea 0! y 1! son iguales a 1 
        System.out.println("Calculando el factorial de " + n + "");
        if (n == 0 || n == 1) {
            System.out.println("Factorial de " + n + " es 1");
            return 1;
        }
        int resultado = n * factorial(n - 1);
        System.out.println("Factorial de " + n + " es " + resultado);
        return resultado;
            //return n * factorial(n - 1);
        
        
    }
    //calcular la suma de los n primeros numeros consecutivos
    //n = 5 resultado = 15 (1+2+3+4+5)
    public int sumaconsecutivos(int n) {
        // caso base
        if (n == 1) {
            return 1;
        }
        System.out.println("los numeros a sumar son " + n + " y " + (n - 1) + "");
        return n + sumaconsecutivos(n - 1);
    }
    //calcular la potencia de un numero base elevado a un exponente
    public int potencia(int base, int exponente) {
        //caso base
        if (exponente == 0) {
            return 1;
        }
        int resultado = base * potencia(base, exponente - 1);
        System.out.println("Potencia de " + base + " elevado a " + exponente + " es " + resultado + "");
        return resultado;
    }
    //Crear un metodo  que sume los digitos de un numero entero
    // si mando 456 sea igual a 15 (4+5+6)
    public int sumadigitos(int n) {
        //caso base
       int suma = 0;
       while (n > 0) {
        suma += n % 10;
        n /= 10;
        System.out.println("Suma de los digitos de " + n + " es " + suma + "");
       }
       return suma;
    }
    // Metodo de fibonacci
    public int fibonacci(int n) {
        //caso base
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }
        // caso recursivo
        return fibonacci(n-1)+fibonacci(n-2);
    }     
    
    //Metodo de busqueda binaria con recursividad
    public int busquedaBinaria(int[] array, int busqueda, int inicio, int fin) {
        // caso base
        if (inicio > fin) {
            return -1;
        }
        int medio = (inicio + fin) / 2;
        if (array[medio] == busqueda) {
            return medio;
        } else if (array[medio] < busqueda) {
            return busquedaBinaria(array, busqueda, medio + 1, fin);
        } else {
            return busquedaBinaria(array, busqueda, inicio, medio - 1);
        }
    }
    // Metodo de busqueda secuencial con recursividad   
    public int busquedaSecuencial(int[] array, int busqueda, int indice) {
        // caso base
        if (indice == array.length) {
            return -1;
        }
        if (array[indice] == busqueda) {
            return indice;
        } else {
            return busquedaSecuencial(array, busqueda, indice + 1);
        }
    }
}