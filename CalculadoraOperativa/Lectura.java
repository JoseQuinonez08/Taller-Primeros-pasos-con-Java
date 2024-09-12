/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.miguelav.calculadoraoperativa;
/*
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner; 

public class Lectura {
    
    public static String tecladoCadena(BufferedReader bIn, String label) throws IOException {
    System.out.print(label);
    return bIn.readLine();
    }

    public static double tecladoNumero(BufferedReader bIn, String label) throws IOException {
    do
    {    
        System.out.print(label);
        try
    {
        double retornar = Double.parseDouble(bIn.readLine());
        return retornar;
    }
    catch(NumberFormatException e)
    {
        System.err.println("Debe ingresar un dato numero.");
    }
    }while(true);
    }

    public static boolean tecladoBool(BufferedReader bIn, String label) throws IOException {
    do
    {    
        System.out.print(label);
        try
    {
        boolean retornar = Boolean.parseBoolean(bIn.readLine());
        return retornar;
    }
    catch(NumberFormatException e)
    {
        System.err.println("Debe ingresar un dato numero.");
    }
    }while(true);
    }
    
}