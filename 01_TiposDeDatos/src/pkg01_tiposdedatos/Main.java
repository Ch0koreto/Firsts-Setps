/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_tiposdedatos;

import java.util.Scanner;

/**
 *
 * @author junjie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*       
        Como declarar una variable 
        1º: Indicar el tipo de variable 
        2º: Nombre de la variable    
        Opcional: Indicar su valor 
         */

//        int number;
//        int number2 = 20;

        /*
        Principales variables que utilizamos
        "int" para números enteros 
        "double" para números con decimales
        "boolean" para true of false 
         */
        
//        number = 122;

        //System.out.println(number);

//        number = number + 1;

        /*
        Es imprescindible denominar el nombre de la variable con la 
        mayor precisión y concretación posicble para mantener la orden y 
        la limpieza de las ideas
         */
        
//        boolean moreThan18Ages;
        
        /*
        "final" es usado para denominar una constante
        */

//        final int BIRTHDAY = 1998;

        //System.out.println(BIRTHDAY);

        // BIRTHDAY = 1999
        
        /*
        Cálculos básicos
         */
        
//        int number1 = 10;
//        int number2 = 3;
//        
//        int result = 0;
//        int result2 = 0, result3 = 0;
//        double result4 = 0;
//        
//        result = number1 + number2;
//        result2 = number1 - number2;
//        result3 = number1 * number2;
//        result4 = number1 / number2;

//        System.out.println(result);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
        
        /*
        Para que una división resulte en un nº con decimales, los operadores an
        de ser igualmente "double"
        */
        
        
        //INCREMENTO 
       
        
//        int number = 12;
//        
//        number = number + 1;
//        number++;
//            
//        System.out.println(number);
//        
//        int number2 = 12;
//        
//        //number2 = number2 - 1;
//        number2--;
//        
//        System.out.println(number2);
//        
//        //Sólo es válido incrementar en 1
//        
//        int number3 = 12;
//        
//        number3 = number3 + 2;
//               
//        System.out.println(number3);

//          int number = 10;
//          
//          System.out.println(++number);

          // Obtener del resto de una división
          
//          int number1 = 11;
//          int number2= 3;
//          
//          int resto;
//          
//          resto = number1 % number2;
//          
//          System.out.println(resto);
          
          //Suele utilizarce para determinar la pariedad de los problemas
          
          //Operadores relacionales
          //Sirven para comparar
          
//          int number1 = 8;
//          int number2 = 2;
//          
//          boolean result;
//          
          // ( <, >, ==, <=, >= y != (Distinto que) )
//          
//          result = number1 < number2;
//          
//          System.out.println(result);
          
          //Operadores lógicos
          
//          int number1 = 10;
//          int number2 = 5;
//          
//          boolean result, result2, result3, result4, result5;
//          
//          result = number1 != number2;
//          result2 = number2 > number1;
          
          //Operador lógico AND
//          result3= result && result2;
          
          //Operador lógico OR
//          result4= result || result2;
          
          //Operador lógico ! (Negación) Sirve para negar algo lógico
//          result5= !result || result2;
//          
//          
//          System.out.println(result);
//          System.out.println(result2);
//          System.out.println(result3);
//          System.out.println(result4);               
//          System.out.println(result5); 

          //Opera y asigna (+=, -=, *=, /=, %=)
          
//          int number = 10;
//          int number2 = 5;
          
          //number = number + number2;
//          number += number2;    
//          
//          System.out.println(number);

          //Concatenar " + a + "
          
//          int edad = 8;
//          
//          System.out.println("Su edad es de " + edad + " años.");

          //ENTRADA DE DATOS POR TERMINAL
          
          Scanner sc = new Scanner(System.in);
          
//          int edad = 0;
//          
//          System.out.println(" Dime tu edad: ");
//          
//          edad = sc.nextInt();
//          
//          System.out.println("Tu edad es: " + edad);
            
            int age = 0;
            String color = "";
            
            System.out.println(" Dime tu edad:");
            
            age = sc.nextInt();
            
            System.out.println(" Dime tu color preferido: ");
            
            sc.nextLine();
            
            color = sc.nextLine();
            
            System.out.println("Tienes " + age + " y tu color preferido es "
                    + color);
          
          // 
        
   
    
    }

}
