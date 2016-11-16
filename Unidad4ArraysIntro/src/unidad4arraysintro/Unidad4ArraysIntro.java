/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4arraysintro;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Unidad4ArraysIntro {
public static Scanner tc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        CalcularMedia();
        
    }
    public static int leerNota(){
        
        int i,nota=0, acumulador=0;
        for(i=1;i<=10;i++){
        System.out.println("Introduce una nota: ");
        nota=tc.nextInt();
        acumulador=acumulador + nota;
        }
        System.out.println("La suma de todas las notas es: "+acumulador);
        return acumulador;
    }
    public static void CalcularMedia(){
        
        int media;
        int nota = leerNota();
        media= nota/10;
        System.out.println("La nota media es: "+media);  
    }
    public static void Imprimir(){
        
    }
}
