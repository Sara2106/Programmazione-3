package org.GROUPNAME.io;
import org.GROUPNAME.model.Item;
import org.GROUPNAME.model.Person;

import java.util.ArrayList;

public class PrettyPrinter {
    public static void main(String[] args) {

        printPeople();

    }

    private static ArrayList<Person> printPeople( ) {

        ArrayList<Person> persone = new ArrayList<>();

        Person Alessio = new Person("Alessio", 20);
        Item spada = new Item("Spada", 10);
        Item scudo = new Item("Scudo", 15);
        Alessio.addItem(spada);
        Alessio.addItem(scudo);
        persone.add(Alessio);

        Person Andrea = new Person("Andrea", 23);
        Item martello = new Item("Martello", 11);
        Item lancia = new Item("Lancia", 17);
        Andrea.addItem(martello);
        Andrea.addItem(lancia);
        persone.add(Andrea);

        for (Person p : persone) {
            Person.printPersone(p);
        }
        return null;
    }
}
