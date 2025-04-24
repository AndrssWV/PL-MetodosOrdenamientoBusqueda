package controllers;

import models.Person;

public class SortingMethods {
    
    public void sortByNameWithBubble(Person[] people) {
        for(int i = 0; i < people.length; i++) {
			for(int j = i+1; j < people.length; j++) {
				if (people[i].getName().compareTo(people[j].getName()) > 0) {
                    Person aux = people[i];
                    people[i] = people[j];
                    people[j] = aux;
                }
			}
		}
    }

    public void sortByNameWithSelectionDes(Person[] people) {
		for (int i = 0; i < people.length - 1; i++) {
			int iM = i;
			for (int j = i + 1; j < people.length; j++) {
				if (people[j].getName().compareTo(people[iM].getName()) < 0) {
                    iM = j;
                }
			}
			
			if (iM != i) {
				Person aux = people[i];
				people[i] = people[iM];
				people[iM] = aux;
			}
		}
	}

    public void sortByAgeWithInsertion(Person[] people) {
		for (int i = 1; i < people.length; i++) {
			Person actual = people[i];
			int j = i - 1;
			while (j >= 0 && people[j].getAge() > actual.getAge()) {
                people[j + 1] = people[j];
                j--;
            }
			people[j + 1] = actual;
		}
	}

	public void sortByNameWithInsertion(Person[] people) {
		for (int i = 1; i < people.length; i++) {
			Person actual = people[i];
			int j = i - 1;
			while (j >= 0 && people[j].getName().compareTo(actual.getName()) > 0) {
                people[j + 1] = people[j];
                j--;
            }
			people[j + 1] = actual;
		}
	}

}
