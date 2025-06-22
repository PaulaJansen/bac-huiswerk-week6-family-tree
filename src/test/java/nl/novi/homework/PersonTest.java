package nl.novi.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    public void testParents() {
        Person mother = new Person("Gerda", "Hartman", 61, "female");
        Person father = new Person("Koos", "Hartman", 62, "male");
        Person child = new Person("Junior", "Hartman", 9, "male");
        child.addParents(mother, father);
        assertEquals(child.getMother(), mother);
        assertEquals(child.getFather(), father);
    }

    @Test
    public void testChild() {
        Person child = new Person("Junior", "Hartman", 9, "male");
        Person parent = new Person("Henkie", "de Vries", 55, "male");
        parent.addChild(child);
        assertTrue(parent.getChildren().contains(child));
        assertEquals(1, parent.getChildren().size());
    }

    @Test
    public void testPet() {
        Pet pet1 = new Pet("Bruno", 2, "dog");
        Pet pet2 = new Pet("Mirabel", 8, "cat");
        Person person = new Person("Henkie", "de Vries", 55, "male");
        person.addPet(pet1);
        person.addPet(pet2);
        assertTrue(person.getPets().contains(pet1));
        assertTrue(person.getPets().contains(pet2));
        assertEquals(2, person.getPets().size());
    }

    @Test
    public void testSibling() {
        Person sister = new Person("Karen", "Hola", 34, "female");
        Person brother = new Person("Jantje", "Hola", 36, "male");
        Person person = new Person("Karel", "Hola", 40, "male");
        person.addSibling(sister);
        person.addSibling(brother);
        assertTrue(person.getSiblings().contains(sister));
        assertTrue(person.getSiblings().contains(brother));
        assertEquals(2, person.getSiblings().size());
    }

    @Test
    public void testGrandChildren() {
        Person person = new Person("Karel", "Hola", 40, "male");
        Person child = new Person("Junior", "Hartman", 9, "male");
        Person grandChild1 = new Person("Benjamin", "Hartman", 2, "male");
        Person grandChild2 = new Person("Benjamina", "Hartman", 1, "female");
        person.addChild(child);
        child.addChild(grandChild1);
        child.addChild(grandChild2);
        assertTrue(person.getGrandChildren(person).contains(grandChild1));
        assertTrue(person.getGrandChildren(person).contains(grandChild2));
        assertEquals(2, person.getGrandChildren(person).size());
    }

}
