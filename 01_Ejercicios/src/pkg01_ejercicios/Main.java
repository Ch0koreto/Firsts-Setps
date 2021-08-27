package pkg01_ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//Ejercicio 1.1
//int usuario;
//
//System.out.println("Introduzca su nº de usuario:");
//
//usuario = sc.nextInt();
//
//System.out.println("Su usuario es:" + usuario);
//Ejercicio 1.2
//int edad;
//
//System.out.println("Cuál es su edad?");
//
//edad = sc.nextInt();
//
//System.out.println("El próximo año tendrás " + ++edad + "ahnos");
//Ejercicio 1.3
//int ahnoActual;
//int ahnoNacimiento;
//int edad;
//
//System.out.println("Intruduzca el año en el que estamos:");
//ahnoActual = sc.nextInt();
//
//System.out.println("Introduzca su año de nacimiento:");
//ahnoNacimiento = sc.nextInt();
//
//edad = ahnoActual - ahnoNacimiento;
//
//System.out.println("Actualmente tienes:" + edad + " años.");
//Ejercicio 1.4
//        short num;
//
//        num = 32767;
//
//        System.out.println("Valor máximo para el tipo short: " + num);
//
//        System.out.println("Valor mínimo para el tipo short: " + ++num);
//Ejercicio 1.5 (No me permite poner las notas con decimales)
//        double nota1, nota2;
//        double media;
//
//        System.out.println("nota1: ");
//
//        nota1 = sc.nextDouble();
//
//        System.out.println("nota2: ");
//
//        nota2 = sc.nextDouble();
//
//        media = (nota1 + nota2) / 2;
//        System.out.println(media);
//        int nota1, nota2;
//        double media;
//
//        System.out.print("Nota 1: ");
//        nota1 = sc.nextInt();
//        System.out.print("Nota 2: ");
//        nota2 = sc.nextInt();
//
//        media = (double) (nota1 + nota2) / 2;
//
//        System.out.println(media);
//
//System.out.println("La nota media es de: " + media);
//Ejercicio 1.6 (No funciona con números decimales)
//        double nota1, nota2, nota3;
//        int media;
//
//        System.out.println("Nota1: ");
//        nota1 = sc.nextDouble();
//        System.out.println("Nota2: ");
//        nota2 = sc.nextDouble();
//        System.out.println("Nota3: ");
//        nota3 = sc.nextDouble();
//        media = (int) (nota1 + nota2 + nota3) / 3;
//        System.out.println(media);
//        Ejercicio 1.7
//        double numero;
//        int result;
//
//        System.out.println("Introduzca el número a redondear: ");
//        numero = sc.nextDouble();
//
//        numero = numero + 0.5;
//        result = (int) numero;
//        System.out.println(result);
//        Ejercicio 1.8
//        int manzanaT1, manzanaT2, manzanaT3, manzanaT4, manzanaTotal;
//        int peraT1, peraT2, peraT3, peraT4, peraTotal;
//
//        final double priceApplePerKile = 2.35;
//        final double princePearPerKile = 1.95;
//
//        double totalSaleApple, totalSalePear;
//
//        System.out.print("Venta (en Kilos) de manzanas el primer trimestre: ");
//        manzanaT1 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de manzanas el segundo trimestre: ");
//        manzanaT2 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de manzanas el tercer trimestre: ");
//        manzanaT3 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de manzanas el cuarto trimestre: ");
//        manzanaT4 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de peras el primer trimestre: ");
//        peraT1 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de peras el segundo trimestre: ");
//        peraT2 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de peras el tercer trimestre: ");
//        peraT3 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de peras el cuarto trimestre: ");
//        peraT4 = sc.nextInt();
//
//        manzanaTotal = manzanaT1 + manzanaT2 + manzanaT3 + manzanaT4;
//        peraTotal = peraT1 + peraT2 + peraT3 + peraT4;
//
//        totalSaleApple = manzanaTotal * priceApplePerKile;
//        totalSalePear = peraTotal * princePearPerKile;
//
//        System.out.print("Has vendido este año " + totalSaleApple + " euros en manzana"
//        " y " + totalSalePear + " euros en peras.");
//        Ejercicio 1.9
//        int manzanaT1, manzanaT2, manzanaT3, manzanaT4, manzanaTotal;
//        int peraT1, peraT2, peraT3, peraT4, peraTotal;
//
//        double priceApplePerKile;
//        double princePearPerKile;
//
//        double totalSaleApple, totalSalePear;
//
//        System.out.print("Precio por kilo de las manzanas: ");
//        priceApplePerKile = sc.nextDouble();
//        System.out.print("Precio por kilo de las peras: ");
//        princePearPerKile = sc.nextDouble();
//
//        System.out.print("Venta (en Kilos) de manzanas el primer trimestre: ");
//        manzanaT1 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de manzanas el segundo trimestre: ");
//        manzanaT2 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de manzanas el tercer trimestre: ");
//        manzanaT3 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de manzanas el cuarto trimestre: ");
//        manzanaT4 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de peras el primer trimestre: ");
//        peraT1 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de peras el segundo trimestre: ");
//        peraT2 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de peras el tercer trimestre: ");
//        peraT3 = sc.nextInt();
//        System.out.print("Venta (en Kilos) de peras el cuarto trimestre: ");
//        peraT4 = sc.nextInt();
//
//        manzanaTotal = manzanaT1 + manzanaT2 + manzanaT3 + manzanaT4;
//        peraTotal = peraT1 + peraT2 + peraT3 + peraT4;
//
//        totalSaleApple = manzanaTotal * priceApplePerKile;
//        totalSalePear = peraTotal * princePearPerKile;
//
//        System.out.print("Has vendido este año " + totalSaleApple + " euros en manzana y " 
//                + totalSalePear + " euros en peras.");
//        Ejercicio 1.10 
//          double radio, longitud, area;
//          final double Pi = 3.14;
//          
//          System.out.print("Introduzca la radio de la circunferencia: ");
//          radio = sc.nextDouble();
//           
//          longitud = 2 * Pi * radio;
//          area = Pi * (radio * radio);
//          
//          System.out.println("La longitud de la circunferencia es de: " + longitud );
//          System.out.println("El area de la circunferencia es de: " + area );
//         
//        Ejercicio Propuestos 
//        Ejercicio 1.1
//          final double Iva;
//          double BI, importeIva, Total;
//          
//          System.out.print("Introduzca el IVA a aplicar en decimales: ");
//          Iva = sc.nextDouble();
//          System.out.print("Introduzca el base imponible: ");
//          BI = sc.nextDouble();
//          
//          importeIva = BI * Iva;
//          Total = BI * (1+Iva);
//          
//          System.out.println("El importe del Iva es de: " + importeIva "€" );
//          System.out.print("El total es de: " + Total "€");
//         Ejercicio 1.2
//           int numero, suma, result;
//           
//           System.out.print("Indique el número comprendido entre 2 y 13 : ");
//           numero = sc.nextInt();
//           
//           if(numero < 7)
//           {suma = 7 - numero;
//           System.out.print("Hay que sumerle " + suma " para que sea múltipo de 7")};
//           
//           
//           else(numero > 7); 
//           {suma = 14 - numero;
//           System.out.print("Hay que sumerle " + suma " para que sea múltipo de 7")};
//           Ejercicio 1.3
//         Ejercicio 1.4
//          double base, altura, area;
//          
//          System.out.print("indique la base del triángulo: ");
//          base = sc.nextDouble();
//          System.out.print("Indique la altura del triángulo: ");
//          altura = sc.nextDouble();
//          
//          area = (base * altura) / 2;
//          
//          System.out.println("El área del triángulo es de " + area);
//         Ejercicio 1.5
//           double a, b, c, x, y;
//           
//           System.out.print("Indique el valor de a: ");
//           a = sc.nextDouble();
//           System.out.print("Indique el valor de b: ");
//           b = sc.nextDouble();
//           System.out.print("Indique el valor de c: ");
//           c = sc.nextDouble();
//           System.out.print("Indique el valor de x: ");
//           x = sc.nextDouble();
//           
//           y = a*(x*x) + b*x + c;
//           
//           System.out.println("La solución del polinomio es:" + y);
//         Ejercicio 1.6
//           int segundos, minutos, horas, segundosTotales;
//           
//           System.out.print("Indique los segundos totales: ");
//           segundosTotales = sc.nextInt();
//           
//           segundos = segundosTotales % 60;
//           minutos = segundosTotales / 60;    
//           horas = minutos / 60;
//           minutos = minutos % 60;
//           
//                     
//           System.out.print("Es en total " + horas +" horas, " + minutos + " minutos y "
//           + segundos + " segundos.");
//         
//         Ejercicio 1.7
//
//           int milimetros, centimetros, metros, centimetrosTotales;
//           
//           System.out.print("Introduzca la primera distancia en milímetros: ");
//           milimetros = sc.nextInt();
//           System.out.print("Introduzca la segunda distancia en centímetros: ");
//           centimetros = sc.nextInt();
//           System.out.print("Introduzca la tercera distancia en metros: ");
//           metros = sc.nextInt();
//           
//           centimetrosTotales = (milimetros / 100) + centimetros + (metros * 100);
//           
//           System.out.print("La distancia total es de " + centimetrosTotales + " centímetros.");

//        Ejercicio 1.8

//          int hormigas, aranhas, cochinillas, patas;
//          
//          System.out.print("Introduzca el número de hormigas: ");
//          hormigas = sc.nextInt();
//          System.out.print("Introduzca el número de arañas: ");
//          aranhas = sc.nextInt();
//          System.out.print("Indique el número de cochinillas");
//          cochinillas = sc.nextInt();
//          
//          patas = (hormigas * 6) + (aranhas * 8) + (cochinillas * 14);
//          
//          System.out.print("El total de patas contabilizadas es de " + patas + " patas.");
    
    
    
    
    
    
    
    }

}
