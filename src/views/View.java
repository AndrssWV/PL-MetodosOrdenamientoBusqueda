package views;

import java.util.Scanner;

import models.Person;

public class View {

    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        
        return scanner.nextInt();
    }

    public Person inputPerson() {
        System.out.print("Nombre: ");
        String name = scanner.next();
        while (true) {
            System.out.print("Nombre: ");
            int age = scanner.nextInt();
            if (age>-1) return new Person(age, name);
            System.out.println("(Edad No Valida)");
        }
    }

    public int selectSortingMethod() {
        //lista metodos
        return scanner.nextInt();
    }

    public int selectSearchCriterion() {
        //lista metodos
        return scanner.nextInt();
    }

    public void displayPeople(Person[] people) {
        for (Person p : people) System.out.println(p.toString());;
    }

    public int inputAge() {
        System.out.print("Ingresar Edad: ");
        return scanner.nextInt();
    }
    
    public String inputName() {
        System.out.print("Ingresar Nombre: ");
        return scanner.next();
    }
    
}
