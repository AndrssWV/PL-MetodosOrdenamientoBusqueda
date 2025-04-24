package controllers;

import models.Person;
import views.View;

public class Controller {
    
    private View view;
    private Person[] people;
    private SortingMethods sortingMethod;
    private SearchMethods searchMethods;

    public Controller(View view, SortingMethods sortingMethod, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethod = sortingMethod;
        this.searchMethods = searchMethods;
    }

    public void start() {
        int option = view.showMenu();
        switch (option) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }

    public void inputPeople() {

    }
    
}
