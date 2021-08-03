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
   
    }

}
