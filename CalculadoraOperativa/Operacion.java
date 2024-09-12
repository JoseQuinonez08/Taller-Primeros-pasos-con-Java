/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.calculadoraoperativa;
import java.io.BufferedReader;
import java.io.IOException;
import com.miguelav.calculadoraoperativa.Lectura;

/**
 *
 * @author Paola
 */
public class Operacion {
    
    public static int sumar(BufferedReader bIn) throws IOException {
    // Solicitar los números al usuario
    int x = (int) Lectura.tecladoNumero (bIn, "Ingrese el primer numero = " );    
    int y = (int) Lectura.tecladoNumero (bIn, "Ingrese el segundo numero = " );
    System.out.println("Primero tomamos el valor " + x);
    System.out.println("Luego tomamos el valor " + y);
    System.out.println("Ahora, sumamos ambos valores: " + x + " + "+ y); 
    int z = x + y;
    System.out.println("El resultado es : " + z );
    return z;
    }
    
    public static int restar(BufferedReader bIn) throws IOException {
    // Solicitar los números al usuario
    int x = (int) Lectura.tecladoNumero (bIn, "Ingrese el primer numero = " );
    int y = (int) Lectura.tecladoNumero (bIn, "Ingrese el segundo numero = " );
    int z = x + y;
    System.out.println("Primero tomamos el valor " + x);
    System.out.println("Luego tomamos el valor " + y);
    System.out.println("Ahora, restamos ambos valores: " + x + " - "+ y); 
    System.out.println("El resultado es : " + z );
    return z;
    }
    
    public static int multiplicar(BufferedReader bIn) throws IOException {
    // Solicitar los números al usuario
    int x = (int) Lectura.tecladoNumero (bIn, "Ingrese el primer numero = " );
    int y = (int) Lectura.tecladoNumero (bIn, "Ingrese el segundo numero = " );
    int z = x + y;
    System.out.println("El resultado es : " + z );
    System.out.println("Primero tomamos el valor " + x);
    System.out.println("Luego tomamos el valor " + y);
    System.out.println("Ahora, multiplicamos ambos valores: " + x + " * "+ y); 
    return z;
    }
    
    public static int dividir(BufferedReader bIn) throws IOException {
    // Solicitar los números al usuario
    int x = (int) Lectura.tecladoNumero (bIn, "Ingrese el primer numero = " );
    int y = (int) Lectura.tecladoNumero (bIn, "Ingrese el segundo numero = " );
    int z = x + y;
    System.out.println("Primero tomamos el valor " + x);
    System.out.println("Luego tomamos el valor " + y);
    System.out.println("Ahora, dividimos ambos valores: " + x + " / "+ y); 
    System.out.println("El resultado es : " + z );
    return z;
    }
    
    public static int sumarIncremental(BufferedReader bIn) throws IOException  {
        int z = 0; //se inicializa en 0 para sumarle de 1 en 1 los valores ingresas con el operador '++'
        // Solicitar los números al usuario
        int x = (int) Lectura.tecladoNumero (bIn, "Ingrese el primer numero = " );    
        int y = (int) Lectura.tecladoNumero (bIn, "Ingrese el segundo numero = " );
        System.out.println("Explicación de la operación de suma incremental:");
        System.out.println("Numero 1: "+x);
        System.out.println("Numero 2: "+y);
        System.out.println("Sumando de forma incremental hasta alcanzar el numero "+(x+y)+":");
        while (z < x + y){
            ++z;
            System.out.println("z: "+z);
        }
        System.out.println("El resultado final despues de la suma incremental es : " + z );
        return z;
    }
    
            
    public static int restarIncremental(BufferedReader bIn) throws IOException {
        // Solicitar los números al usuario
        int x = (int) Lectura.tecladoNumero (bIn, "Ingrese el primer numero = " );   
        int z = x;
        int y = (int) Lectura.tecladoNumero (bIn, "Ingrese el segundo numero = " );
        System.out.println("Explicación de la operación de resta decremental:");
        System.out.println("Numero 1: "+x);
        System.out.println("Numero 2: "+y);
        System.out.println("Iniciando z en "+z+" y disminuyendo hasta alcanzar "+(x-y)+":");
        while (z > x - y){
            --z;
            System.out.println("z: "+z);
    } 
    System.out.println("El resultado final despues de la resta decremental es : " + z );
    return z;
    }
    
    public static boolean compararIgualdad(BufferedReader bIn) throws IOException {
    boolean z;
    double x = Lectura.tecladoNumero (bIn, "Ingrese el primer numero = " );    
    double y = Lectura.tecladoNumero (bIn, "Ingrese el segundo numero = " );
    z = (x == y);
    return z;
    }
    
    public static boolean compararDesigualdad(BufferedReader bIn) throws IOException {
    boolean z;
    double x = Lectura.tecladoNumero (bIn, "Ingrese el primer numero = " );    
    double y = Lectura.tecladoNumero (bIn, "Ingrese el segundo numero = " );
    z = (x != y);
    return z;
    }
    
    public static boolean compararMenorQue(BufferedReader bIn) throws IOException {
    boolean z;
    double x = Lectura.tecladoNumero (bIn, "Ingrese el numero que se comparara como menor al siguiente = " );    
    double y = Lectura.tecladoNumero (bIn, "Ingrese el numero que se comparara como mayor al anterior = " );
    z = (x < y);
    if (z){System.out.println(x + " es menor que " + y + ".");}
    else {System.out.println(x + " NO es menor que " + y + ".");}
    return z;
    }
    
    public static boolean compararMayorQue(BufferedReader bIn) throws IOException {
    boolean z;
    double x = Lectura.tecladoNumero (bIn, "Ingrese el numero que se comparara como mayor al siguiente = " );    
    double y = Lectura.tecladoNumero (bIn, "Ingrese el numero que se comparara como menor al anterior = " );
    z = (x > y);
    if (z){System.out.println(x + " es menor que " + y + ".");}
    else {System.out.println(x + " NO es menor que " + y + ".");}
    return z;
    }
    
    public static boolean evaluarAND(BufferedReader bIn, boolean x, boolean y) throws IOException {
    boolean z;
    z = (x && y);
    if (z){System.out.println("Ambas condiciones se cumplen. Las expresion es verdadera.");}
    else {System.out.println("La expresión es falsa.");}
    return z;
    }
    
    public static boolean evaluarOR(BufferedReader bIn, boolean x, boolean y) throws IOException {
    boolean z;
    z = (x || y);
    if (z){System.out.println("Una o ambas condiciones se cumplen. Las expresion es verdadera.");}
    else {System.out.println("Ninguna de las condiciones se cumple. La expresión es falsa.");}
    return z;
    }
    
    public static boolean compararCadenas(BufferedReader bIn) throws IOException {
    String cadena1 = Lectura.tecladoCadena(bIn, "Ingrese la primera cadena: ");
    String cadena2 = Lectura.tecladoCadena(bIn, "Ingrese la segunda cadena: ");
    return cadena1.equals(cadena2);
    }
    
    public static String concatenarCadenas(BufferedReader bIn) throws IOException {
    String cadena1 = Lectura.tecladoCadena(bIn, "Ingrese la primera cadena: ");
    String cadena2 = Lectura.tecladoCadena(bIn, "Ingrese la segunda cadena: ");
    return cadena1 + cadena2;
    }
    
    public static int operacionANDBit(BufferedReader bIn) throws IOException {
    int x = (int) Lectura.tecladoNumero(bIn, "Ingrese el primer número: ");
    int y = (int) Lectura.tecladoNumero(bIn, "Ingrese el segundo número: ");
    // Realizamos la operación bitwise AND (&)
    int resultado = x & y;
    // Explicación paso a paso
    System.out.println("Explicación de la operación & bit a bit:");
    System.out.println("Número 1 (" + x + ") en binario: " + Integer.toBinaryString(x));
    System.out.println("Número 2 (" + y + ") en binario: "  + Integer.toBinaryString(y));
    System.out.println("El operador de bit & compara los bit de los operando y establece el bit "
                + "resultante en 1 si ambos bits correspondientes son 1, y en 0 en cualquier otro caso.");
    System.out.println("Resultado (" + resultado + ") en binario: " + Integer.toBinaryString(resultado));
    System.out.println("El resultado de la operación " + x + " & " + y + " es: " + resultado);
    return resultado;
    }

    public static int operacionORBit(BufferedReader bIn) throws IOException {
    // Solicitar los números al usuario
    int x = (int) Lectura.tecladoNumero(bIn, "Ingrese el primer número: ");
    int y = (int) Lectura.tecladoNumero(bIn, "Ingrese el segundo número: ");
    
    // Realizamos la operación bitwise OR (|)
    int resultado = x | y;
    
    // Explicación paso a paso
    System.out.println("Explicación de la operación | bit a bit:");
    System.out.println("Número 1 (" + x + ") en binario: " + Integer.toBinaryString(x));
    System.out.println("Número 2 (" + y + ") en binario: " + Integer.toBinaryString(y));
    System.out.println("El operador de bit | compara los bits de los operandos y establece el bit resultante en 1 "
            + "si al menos uno de los bits correspondientes es 1, y en 0 si ambos bits son 0.");
    System.out.println("Resultado (" + resultado + ") en binario: " + Integer.toBinaryString(resultado));
    System.out.println("El resultado de la operación " + x + " | " + y + " es: " + resultado);
    
    return resultado;
}

    
    public static int operacionXORBit(BufferedReader bIn) throws IOException {
    // Solicitar los números al usuario
    int x = (int) Lectura.tecladoNumero(bIn, "Ingrese el primer número: ");
    int y = (int) Lectura.tecladoNumero(bIn, "Ingrese el segundo número: ");
    // Realizamos la operación bitwise XOR (^)
    int resultado = x ^ y;
    // Explicación paso a paso
    System.out.println("Explicación de la operación ^ bit a bit:");
    System.out.println("Número 1 (" + x + ") en binario: " + Integer.toBinaryString(x));
    System.out.println("Número 2 (" + y + ") en binario: " + Integer.toBinaryString(y));
    System.out.println("El operador de bit ^ compara los bits de los operandos y establece el bit resultante en 1 "
            + "si los bits correspondientes son diferentes, y en 0 si son iguales.");
    System.out.println("Resultado (" + resultado + ") en binario: " + Integer.toBinaryString(resultado));
    System.out.println("El resultado de la operación " + x + " ^ " + y + " es: " + resultado);
    return resultado;
    }
    
    public static int operacionDesplazamientoIzquierda(BufferedReader bIn) throws IOException {
    // Solicitar el número y el número de posiciones al usuario
    int x = (int) Lectura.tecladoNumero(bIn, "Ingrese el número: ");
    int posiciones = (int) Lectura.tecladoNumero(bIn, "Ingrese el número de posiciones para desplazar a la izquierda: ");
    // Realizamos la operación de desplazamiento a la izquierda (<<)
    int resultado = x << posiciones;
    // Explicación paso a paso
    System.out.println("Explicación de la operación << bit a bit:");
    System.out.println("Número (" + x + ") en binario: " + Integer.toBinaryString(x));
    System.out.println("Desplazando el número " + x + " a la izquierda por " + posiciones + " posiciones.");
    System.out.println("El operador de desplazamiento a la izquierda (<<) mueve todos los bits del operando "
            + "hacia la izquierda por el número de posiciones especificado. Los bits vacíos a la derecha "
            + "se llenan con ceros.");
    System.out.println("Resultado (" + resultado + ") en binario: " + Integer.toBinaryString(resultado));
    System.out.println("El resultado de la operación " + x + " << " + posiciones + " es: " + resultado);
    return resultado;
    }
    
    public static int operacionDesplazamientoDerecha(BufferedReader bIn) throws IOException {
    // Solicitar el número y el número de posiciones al usuario
    int x = (int) Lectura.tecladoNumero(bIn, "Ingrese el número: ");
    int posiciones = (int) Lectura.tecladoNumero(bIn, "Ingrese el número de posiciones para desplazar a la derecha: ");
    // Realizamos la operación de desplazamiento a la derecha (>>)
    int resultado = x >> posiciones;
    // Explicación paso a paso
    System.out.println("Explicación de la operación >> bit a bit:");
    System.out.println("Número (" + x + ") en binario: " + Integer.toBinaryString(x));
    System.out.println("Desplazando el número " + x + " a la derecha por " + posiciones + " posiciones.");
    System.out.println("El operador de desplazamiento a la derecha (>>) mueve todos los bits del operando "
            + "hacia la derecha por el número de posiciones especificado. Los bits vacíos a la izquierda "
            + "se llenan con el bit de signo (en el caso de enteros con signo).");
    System.out.println("Resultado (" + resultado + ") en binario: " + Integer.toBinaryString(resultado));
    System.out.println("El resultado de la operación " + x + " >> " + posiciones + " es: " + resultado);
    return resultado;
    }

}   

 
