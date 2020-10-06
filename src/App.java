import java.util.Scanner;
import java.util.Date;

public class App {
    static Scanner teclado = new Scanner(System.in);
    static Date d = new Date();

    public static void main(String[] args) throws Exception {
        int eleccion;
        System.out.println("\nBienvenido al Examen....\n");
        System.out.println(d.toString());
        System.out.println(
                "Cual ejercicio quieres: \n[1]. Ejercicio1\n[2]. Ejercicio2\n[3]. Ejercicio3\n[4]. Ejercicio4\n[5]. Ejercicio5\n[0]. Salir\n");
        eleccion = teclado.nextInt();
        switch (eleccion) {
            case 1:
                ejercicio1();
                repetir();
                break;
            case 2:
                ejercicio2();
                repetir();
                break;
            case 3:
                ejercicio3();
                repetir();
                break;
            case 4:
                ejercicio4();
                repetir();
                break;
            case 5:
                ejercicio5();
                repetir();
                break;
            case 0:
                System.out.println("Chau....");
                break;
            default:
                break;
        }
    }

    static void ejercicio1() {
        // Definiendo variables
        int unidad1, unidad2, unidad3, trabajoFinal;
        double notaFinal;
        // Datos de entrada
        System.out.println("************ Promediador de Notas ************");
        System.out.print("Cuanto saco en la Unidad 1: ");
        unidad1 = teclado.nextInt();
        System.out.print("Cuanto saco en la Unidad 2: ");
        unidad2 = teclado.nextInt();
        System.out.print("Cuanto saco en la Unidad 3: ");
        unidad3 = teclado.nextInt();
        System.out.print("Cuanto saco en la practica Final: ");
        trabajoFinal = teclado.nextInt();
        // Linea en blanco
        System.out.println(" ");
        // Logica
        notaFinal = ((unidad1 * 0.10) + (unidad2 * 0.15) + (unidad3 * 0.25) + (trabajoFinal * 0.50));
        // Datos de salida
        System.out.println("La nota final del estudiante es: " + notaFinal);
    }

    static void ejercicio2() {
        // Definiedo variables
        int puntos;
        double salario, bono, totalC;
        // Datos de entrada
        System.out.println("*************** Saca Bono ***************");
        System.out.print("Cuanto es tu salario: ");
        salario = teclado.nextInt();
        System.out.print("Cuanto es tu puntaje: ");
        puntos = teclado.nextInt();
        // Logica
        if (puntos >= 50 && puntos <= 100) {
            bono = salario * 0.10;
            totalC = salario + bono;
            // Datos de salida
            System.out.println("Tu bono sera de " + bono);
            System.out.println("Total a Cobrar: " + totalC);
        } else if (puntos >= 101 && puntos <= 150) {
            bono = salario * 0.50;
            totalC = salario + bono;
            // Datos de salida
            System.out.println("Tu bono sera de " + bono);
            System.out.println("Total a Cobrar: " + totalC);
        } else if (puntos >= 151) {
            bono = salario * 0.80;
            totalC = salario + bono;
            // Datos de salida
            System.out.println("Tu bono sera de " + bono);
            System.out.println("Total a Cobrar: " + totalC);
        } else {
            System.out.println("No tienes bono....");
        }
        // Final y despedida
        System.out.println("Gracias....");
    }

    static void ejercicio3() {
        // Declarando variables
        String nombre;
        int edad, sexo;
        // Datos de entrada
        System.out.println("************ Determinador de vacuna del Covid19 ************");
        System.out.print("Dime tu nombre: ");
        nombre = teclado.next();
        System.out.print("Marca 1 = Masculino y 0 = Femenino : ");
        sexo = teclado.nextInt();
        System.out.print("Dime tu edad: ");
        edad = teclado.nextInt();
        // Logica y datos de salida
        if (edad > 70) {
            System.out.println("Vacuna de tipo [ C ] para " + nombre);
        } else if (edad >= 16 && edad <= 69) {
            if (sexo == 0) {
                System.out.println("Vacuna de tipo [ B ] para " + nombre);
            } else if (sexo == 1) {
                System.out.println("Vacuna de tipo [ A ] para " + nombre);
            } else {
                System.out.println("error");
            }
        } else if (edad < 16) {
            System.out.println("Vacuna de tipo [ A ] para " + nombre);
        } else {
            System.out.println("error.....");
        }
        // Final y despedida

        System.out.println("Gracias....");
    }

    static void ejercicio4() {
        // Definiendo variables
        int a, b, operacion, signo;
        // Dato de entrada
        System.out.println("************ Interpretador de Operaciones Aritmeticas ************");
        System.out.print("Que operacion aritmetica aras:\n1. [+]\n2. [-]\n3. [*]\n4. [/]\n5. [^]\n");
        signo = teclado.nextInt();
        System.out.print("Cual es el valor a: ");
        a = teclado.nextInt();
        System.out.print("Cual es el valor b: ");
        b = teclado.nextInt();
        // Logica
        switch (signo) {
            case 1:
                operacion = a + b;
                System.out.println("Es igual a : " + operacion);
                break;

            case 2:
                operacion = a - b;
                System.out.println("Es igual a : " + operacion);
                break;

            case 3:
                operacion = a * b;
                System.out.println("Es igual a : " + operacion);
                break;

            case 4:
                operacion = a / b;
                System.out.println("Es igual a : " + operacion);
                break;

            case 5:
                operacion = a ^ b;
                System.out.println("Es igual a : " + operacion);
                break;

            default:
                System.out.println("err [Ingreso una opcion erronea]");
                break;
        }

    }

    static void ejercicio5() {
        // Definir variables
        int salario;
        double salarioIncremento;
        int años = 6;
        // Datos de entrada
        System.out.println("************ Determinador de salarios especifico de 6 Años ************");
        System.out.print("Cauanto es tu salario: ");
        salario = teclado.nextInt();
        // Logica
        salarioIncremento = salario * 0.10;
        System.out.println("Año " + " : " + " Salario");
        for (int i = 1; i <= años; i++) {
            salario += salarioIncremento;
            System.out.println(i + "    :  " + salario);
        }
        // Final y despedida
        System.out.println("Gracias....");
    }

    static void repetir() throws Exception {
        int repetir;
        System.out.println("Quieres ir a seccion de menu:\n[1] Si\n[2] No ");
        repetir = teclado.nextInt();
        switch (repetir) {
            case 1:
                main(null);
                break;
            case 2:
                System.out.println("Gracias");
                break;
            default:
                System.out.println("errr");
                break;
        }
    }

}
