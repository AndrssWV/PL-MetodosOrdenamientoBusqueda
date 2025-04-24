package views;

import java.util.Scanner;

import models.Person;

public class View {

    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("BUSQUEDA");
        System.out.println("1. Crear Lista Personas");
        System.out.println("2. Ingresar Personas");
        System.out.println("3. Ordenar Personas");
        System.out.println("4. Buscar Persona");
        System.out.println("5. Salir");
        while (true) {
            System.out.print("Seleccione una: ");
            int option = scanner.nextInt();
            if (option>=1 && option<=5) return option;
            else System.out.println("Opcion No Valida");
        }
    }

    public Person inputPerson() {
        System.out.print("Nombre: ");
        String name = scanner.next();
        while (true) {
            System.out.print("Edad: ");
            int age = scanner.nextInt();
            if (age>-1) return new Person(age, name);
            System.out.println("(Edad No Valida)");
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int selectSortingMethod() {
        System.out.println("SORTING");
        System.out.println("1. Metodo Burbuja");
        System.out.println("2. Metodo Selección (Desc)");
        System.out.println("3. Metodo Inserción");
        while (true) {
            System.out.print("Seleccione una: ");
            int option = scanner.nextInt();
            if (option>=1 && option<=3) return option;
            else System.out.println("No Valido");
        }
    }

    public void displaySearchResult(Person person) {
        if (person != null) {
            System.out.println("Persona Encontrada");
            System.out.println(person.toString());
        } else {
            System.out.println("No Encontrada...");
        }
    }

    public int selectSearchCriterion() {
        while (true) {
            System.out.println("1. Por Nombre");
            System.out.println("2. Por Edad");
            int option = scanner.nextInt();
            if (option == 1 || option == 2) return option;
            else System.out.println("Opcion No Valida");
        }
    }

    public void displayPeople(Person[] people) {
        for (Person p : people) System.out.println(p.toString());;
    }

    public int inputAge() {
        while (true) {
            System.out.print("Ingresar Edad: ");
            int age = scanner.nextInt();
            if (age>=0) return age;
            else System.out.println("Edad No Valida");
        }
    }
    
    public String inputName() {
        System.out.print("Ingresar Nombre: ");
        return scanner.next();
    }
    
}
