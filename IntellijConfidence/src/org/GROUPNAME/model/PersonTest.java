package org.GROUPNAME.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void totalValue() {
        Person Alessio = new Person("Alessio", 20);
        Item spada = new Item("Spada", 10);
        Item scudo = new Item("Scudo", 15);
        Alessio.addItem(spada);
        Alessio.addItem(scudo);

        assertEquals(Alessio.totalValue(), 24);
    }
}