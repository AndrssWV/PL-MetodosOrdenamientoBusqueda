package controllers;

import java.util.Scanner;

import models.Person;
import views.View;

public class Controller {
    
    private View view;
    private Person[] people;
    private SortingMethods sortingMethod;
    private SearchMethods searchMethods;
    private Scanner scan;

    public Controller(View view, SortingMethods sortingMethod, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethod = sortingMethod;
        this.searchMethods = searchMethods;
        scan = new Scanner(System.in);
    }

    public void start() {
        int option = 0;
        while (option < 6) {
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;
                case 2:
                    addPersons();
                    break;
                case 3:
                    sortPersons();
                    break;
                case 4:
                    searchPerson();
                    break;
                case 5:
                    System.out.println("Shutting Down...");
                    break;
            }
        }
    }

    

    public void inputPersons() {
        int length;
        while (true) {
            System.out.print("Nro. Personas: ");
            length = scan.nextInt();
            if (length>0) break;
            else System.out.println("Cantidad No Valida");
        }
        people = new Person[length];
        System.out.println("Person[] Generado");
    }

    public void addPersons() {
        if (people.length == 0) {
            System.out.println("Person[] Indefinida");
            return;
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println("Person[" + (i + 1) + "]");
            people[i] = view.inputPerson();
        }
    }

    public void sortPersons() {
        if (people.length == 0) {
            System.out.println("Person[] Vacio");
            return;
        }
        int option = view.selectSortingMethod();
        switch (option) {
            case 1:
                sortingMethod.sortByNameWithBubble(people);
                break;
            case 2:
                sortingMethod.sortByNameWithSelectionDes(people);
                break;
            case 3:
                sortingMethod.sortByNameWithInsertion(people);
                break;
        }
        view.displayPeople(people);
    }
    

    public void searchPerson() {
        if (people.length == 0) {
            System.out.println("Person[] Vacio");
            return;
        }
        int option = view.selectSearchCriterion();
        if (option==1) {
            boolean orderName = searchMethods.isSortedByName(people);
            if (!orderName) sortingMethod.sortByNameWithInsertion(people);
            String name = view.inputName();
            Person searchedName = searchMethods.binarySearchByName(people, name);
            view.displaySearchResult(searchedName);
        } else {
            boolean orderAge = searchMethods.isSortedByName(people);
            if (!orderAge) sortingMethod.sortByAgeWithInsertion(people);
            int age = view.inputAge();
            Person searchedAge = searchMethods.binarySearchByAge(people, age);
            view.displaySearchResult(searchedAge);
        }
    }
    
}
