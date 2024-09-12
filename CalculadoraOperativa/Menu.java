/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.calculadoraoperativa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Paola
 */
public class Menu {
   
    public static void menuAritmetico(BufferedReader bIn) throws IOException{
    int opcion2, resultadoInt;
    do{
        System.out.println("Operaciones Aritmeticas: /n1. Suma./n2. Resta./n3. Multiplicar./n4. Dividir.");
        opcion2 = (int) Lectura.tecladoNumero(bIn, "Ingrese la opción con la que desea operar: ");
        switch (opcion2){
            case 1:
                resultadoInt = Operacion.sumar(bIn);
                System.out.println("El resultado de la suma es: " + resultadoInt);
                break;
            case 2:
                resultadoInt = Operacion.restar(bIn);
                System.out.println("El resultado de la resta es: " + resultadoInt);
                break;
            case 3:
                resultadoInt = Operacion.multiplicar(bIn);
                System.out.println("El resultado de la multiplicación es: " + resultadoInt);
                break;
            case 4:
                resultadoInt = Operacion.dividir(bIn);
                System.out.println("El resultado de la división es: " + resultadoInt);
                break;
            default:
                System.out.println("Debe ingresar un número correspondiente a las opciones presentadas");
            }
            } while (opcion2 < 1 && opcion2 > 4);
    }
    
    public static Boolean menuRelacional(BufferedReader bIn) throws IOException{
    int opcion2;
    boolean resultadoBool;
    do{
        System.out.println("1. Igualdad.\n2. Desigualdad.\n3. Menor que.\n4. Mayor que.");
        opcion2 = (int) Lectura.tecladoNumero(bIn, "Ingrese la opción con la que desea operar: ");
        switch (opcion2){
            case 1:
                resultadoBool = Operacion.compararIgualdad(bIn);
                if (resultadoBool){System.out.println("La igualdad entre ambos números es verdadera.");}
                else {System.out.println("La igualdad entre ambos números no se cumple");}
                return resultadoBool;
            case 2:
                resultadoBool = Operacion.compararDesigualdad(bIn);
                if (resultadoBool){System.out.println("La desigualdad entre ambos números es verdadera.");}
                else {System.out.println("La desigualdad entre ambos números no se cumple");}
                return resultadoBool;
            case 3:
                return Operacion.compararMenorQue(bIn);
            case 4:
                return Operacion.compararMayorQue(bIn);
            default:
                System.out.println("Debe ingresar un número correspondiente a las opciones presentadas");
                return null;
            }
            } while (opcion2 < 1 && opcion2 > 4);
    }
    
    public static void menuBits(BufferedReader bIn) throws IOException{
    int opcion2;
    do{
        System.out.println("Operaciones Aritmeticas: \n1. AND.\n2. OR.\n3. XOR.\n4. Desplazar a la izquierda.\n5. Desplazar a la Derecha.");
        opcion2 = (int) Lectura.tecladoNumero(bIn, "Ingrese la opción con la que desea operar: ");
        switch (opcion2){
            case 1:
                Operacion.operacionANDBit(bIn);
                break;
            case 2:
                Operacion.operacionORBit(bIn);
                break;
            case 3:
                Operacion.operacionXORBit(bIn);
                break;
            case 4:
                Operacion.operacionDesplazamientoIzquierda(bIn);
                break;
            case 5:
                Operacion.operacionDesplazamientoDerecha(bIn);
                break;
            default:
                System.out.println("Debe ingresar un número correspondiente a las opciones presentadas");
            }
            } while (opcion2 < 1 && opcion2 > 5);
    }
    
    public static void menuBool(BufferedReader bIn) throws IOException{
    int opcion2;
    boolean x, y, resultadoBool;
    do{
        System.out.println("Operaciones Booleanas: \n1. Conjuncion(AND).\n2. Disyuncion(OR).");
        opcion2 = (int) Lectura.tecladoNumero(bIn, "Ingrese la opción con la que desea operar: ");
        switch (opcion2){
            case 1:
                x = Lectura.tecladoBool(bIn, "Ingrese el primer valor de verdad.");
                y = Lectura.tecladoBool(bIn, "Ingrese el segundo valor de verdad.");
                resultadoBool = Operacion.evaluarAND(bIn, x, y);
                System.out.println("El valor de verdad de la expresión es");
                break;
            case 2:
                x = Lectura.tecladoBool(bIn, "Ingrese el primer valor de verdad.");
                y = Lectura.tecladoBool(bIn, "Ingrese el segundo valor de verdad.");
                resultadoBool = Operacion.evaluarOR(bIn, x, y);
                System.out.println("El valor de verdad de la expresión es: "+resultadoBool);
                break;
            default:
                System.out.println("Debe ingresar un número correspondiente a las opciones presentadas");
            }
            } while (opcion2 < 1 && opcion2 > 2);
    }
    
    public static void menuIncremental(BufferedReader bIn) throws IOException{
    int opcion2, resultadoInt;
    do{
        System.out.println("Operaciones Incrementales: \n1. Suma.\n2. Resta.");
        opcion2 = (int) Lectura.tecladoNumero(bIn, "Ingrese la opción con la que desea operar: ");
        switch (opcion2){
            case 1:
                resultadoInt = Operacion.sumarIncremental(bIn);
                System.out.println("El resultado de la suma es: "+resultadoInt);
                break;
            case 2:
                resultadoInt = Operacion.restarIncremental(bIn);
                System.out.println("El resultado de la resta es: "+resultadoInt);
                break;
            default:
                System.out.println("Debe ingresar un número correspondiente a las opciones presentadas");
            }
            } while (opcion2 < 1 && opcion2 > 2);
    }
    
    public static void menuCondicional(BufferedReader bIn) throws IOException{
    int opcion2;
    boolean x, y;
    do{
        System.out.println("Operaciones Condicionales: \n1. Conjunción(AND).\n2. Disyuncion(OR).");
        opcion2 = (int) Lectura.tecladoNumero(bIn, "Ingrese la opcion con la que desea operar: ");
        switch (opcion2){
            case 1:
                System.out.println("Escoja la primera operación que desea comprobar: ");
                x = menuRelacional(bIn);
                System.out.println("Escoja la segunda operación que desea comprobar: ");
                y = menuRelacional(bIn);
                Operacion.evaluarAND(bIn, x, y);
                break;
            case 2:
                System.out.println("Escoja la primera operación que desea comprobar: ");
                x = menuRelacional(bIn);
                System.out.println("Escoja la segunda operación que desea comprobar: ");
                y = menuRelacional(bIn);
                Operacion.evaluarOR(bIn, x, y);
                break;
            default:
                System.out.println("Debe ingresar un número correspondiente a las opciones presentadas");
            }
            } while (opcion2 < 1 && opcion2 > 4);
    }
    public static void menuString(BufferedReader bIn) throws IOException{
    int opcion2;
    do{
        System.out.println("Operaciones de cadenas: \n1. Comparar cadenas.\n2. Concatenar cadenas.");
        opcion2 = (int) Lectura.tecladoNumero(bIn, "Ingrese la opcion con la que desea operar: ");
        switch (opcion2){
            case 1:
                boolean resultado = Operacion.compararCadenas(bIn);
                if (resultado) {
                    System.out.println("Las cadenas son iguales.");
                } else {
                    System.out.println("Las cadenas son diferentes.");
                }
                break;
            case 2:
                String resultadoStr = Operacion.concatenarCadenas(bIn);
                System.out.println("El resultado de la concatenacion es: " + resultadoStr);
                break;
            default:
                System.out.println("Debe ingresar un número correspondiente a las opciones presentadas");
            }
            } while (opcion2 < 1 && opcion2 > 2);
    }
    public static void menuPrincipal() throws IOException{
    BufferedReader bIn = new BufferedReader( new InputStreamReader (System.in) );
    int opcion;
    String resp = ""; 
    do{
    do {
    System.out.println("""
                       Escoge que tipo de operador quieres usar: 
                       1. Aritmeticos.
                       2. Relacionales.
                       3. de Bits
                       4. Booleanas
                       5. Incrementales. 
                       6. Condicionales. 
                       7. de Cadenas.
                       8. Cerrar programa""");
    opcion = (int) Lectura.tecladoNumero(bIn, "Ingrese la opción que desea operar: ");
    switch (opcion){
        case 1:
            menuAritmetico(bIn);
            break;
        case 2:
            System.out.println("Operaciones Relacionales:"); 
            menuRelacional(bIn);
            break;
        case 3:
            menuBits(bIn);
            break;
        case 4:
            menuBool(bIn);
            break;    
        case 5:
            menuIncremental(bIn);
            break;
        case 6:
            menuCondicional(bIn);
            break;
        case 7:
            menuString(bIn);
            break;
        case 8:
            resp = Lectura.tecladoCadena(bIn, "¿Desea realizar otra operación?\nIngrese 'si' o 'no': ");
            break;
        default:
            System.out.println("Debe ingresar un número correspondiente a las opciones presentadas");
        } 
    } while (opcion < 1 && opcion > 8);
    } while ((resp.toLowerCase()).equals("no") != true);
        System.out.println("El programa se ha cerrada.");
    }
}
