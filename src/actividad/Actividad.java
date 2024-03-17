package actividad;

import java.util.Scanner;

public class Actividad {

    Scanner data = new Scanner(System.in);
    int n, a = 1, e, j, nue = 1, l, w, f;
    int numeros[] = new int[nue];

    public static void main(String[] args) {
        Actividad ac = new Actividad();
        ac.menu();
    }

    public void menu() {
        System.out.println("menu:");
        System.out.println("1. crear");
        System.out.println("2. adicionar");
        System.out.println("3. actualizar");
        System.out.println("4. eliminar");
        System.out.println("5. mostrar");
        w = data.nextInt();
        switch (w) {
            case 1:
                solicitarnumero();
                break;
            case 2:
                adicionarnum();
                break;
            case 3:
                actualizar();
                break;
            case 4:
                eliminarnume();
                break;
            case 5:
                mostrar();
                break;

            default:
                throw new AssertionError();
        }

    }

    public void solicitarnumero() {
        do {
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Ingrese dato numero: " + a);
                numeros[i] = data.nextInt();
                System.out.println("Desea ingresar otro?");
                System.out.println("1. Si");
                System.out.println("2. No");
                e = data.nextInt();
                a++;
            }
        } while (e != 2);

        menu();
    }

    public void adicionarnum() {
        f = (nue + 1);
        nue = f;
        System.out.println("Ingrese el numero adicional");
        numeros[f] = data.nextInt();
        menu();
    }

    public void actualizar() {

        System.out.println("Este es su arreglo actual, indique la posicion a actualizar");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        j = data.nextInt();

        for (int i = 0; i < j; i++) {
            if (i == j) {
                System.out.println("Ingrese numero nuevo");
                numeros[i] = data.nextInt();
            }
        }
        menu();
    }

    public void eliminarnume() {
        System.out.println("Este es su arreglo actual, indique la posicion a eliminar");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        l = data.nextInt();

        for (int i = 0; i < l; i++) {
            if (i == l) {
                System.out.println("Ingrese numero nuevo");
                numeros[i] = data.nextInt();
            }
        }
        menu();
    }

    public void mostrar() {
        for (int i = 0; i < a; i++) {
            System.out.print(numeros[i]);
        }
        System.out.println(" ");
        menu();
    }
}
