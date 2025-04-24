package controllers;

import models.Person;

public class SearchMethods {
    
    public Person binarySearchByAge(Person[] people, int age) {
        int lower = 0;
        int higher = people.length -1;
        while (higher>=lower) {
            int central = (higher+lower) /2;
            if (people[central].getAge() == age) return people[central];
            if (people[central].getAge() > age) higher = central -1;
            else lower = central+1;
        } 
        return null;
    }

    public Person binarySearchByName(Person[] people, String name) {
        int lower = 0;
        int higher = people.length -1;
        while (higher>=lower) {
            int central = (higher+lower) /2;
            if (people[central].getName().equalsIgnoreCase(name)) return people[central];
            if (people[central].getName().compareTo(name) > 0) higher = central -1;
            else lower = central+1;
        } 
        return null;
    }

    public boolean isSortedByAge(Person[] people) {
        for(int i = 0; i < people.length-1; i++) {
            if (people[i].getAge() > people[i+1].getAge()) return false;
        }
        return true;
    }

    public boolean isSortedByName(Person[] people) {
        for(int i = 0; i < people.length-1; i++) {
            if (people[i].getName().compareTo(people[i+1].getName()) > 0) return false;
        }
        return true;
    }
}
