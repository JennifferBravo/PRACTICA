/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.practica2;

/**
 *
 * @author PERSONAL
 */
public class Practica2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        //- Sistemas numéricos (hexadecimal (0x), binario (0b), octal (0)
        /*var hex=0xa3;
        var octal=043;
        var bin=0b1010111011;
        
        System.out.println("hexadecimal;"+hex);
        System.out.println("octal:"+octal);
        System.out.println("binario:"+bin);
         */
        /*
        short num1 = 12;
        String num2 = "3";
        */
        /* CONVERSION DE TIPOS DE DATOS
        String a int (Integer.parseInt("20"));
         
        int result = num1 + (Short.parseShort(num2));

        System.out.println("Resultado:" + result);
         */
        //DE NUMEROS A CADENAS
        
        /*
        String nombre="Sahid";
        int codigo=459;
        
        String nombre_completo=nombre+String.valueOf(codigo);
        
        System.out.println("El resultado es:" + nombre_completo);
        */
        
        /* ESTRUCTURA SECUENCIAL
        
            las instrucciones se ejecutan una tras otra
            system.dut.println("Inicio del programa");
            int a= 5;
            int b= 10;
            System.out.println("La suma es: " + suma);*/
        
        //ESTRUCTURA CONDICIONAL SIMPLE
        
        /*
        int lados=4;
        if (lados==0){
            System.out.println("Es un circulo");
        }
        if (lados==2){
            System.out.println("No definido");
        }
        if (lados==3){
            System.out.println("Es un triangulo");
        }    
        if (lados==4){
            System.out.println("Es un cuadrado");
        }
        if (lados==5){
            System.out.println("Es un pentagono");
        }
        */
        
        //ESTRUCTURA CONDICIONAL DOBLE
        
        int edad=20;
        
        if (edad>0){
            if (edad>=18){
                System.out.println("Eres mayor de edad");
            }else{
                System.out.println("Eres menor de edad");
            }         
        }else{
            System.out.println("El numero ingresado es incorrecto");
        }
        
        
        
    }
}
