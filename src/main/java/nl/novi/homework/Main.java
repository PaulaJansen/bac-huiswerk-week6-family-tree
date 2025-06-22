package nl.novi.homework;

public class Main {
    public static void main (String[] args){

        Person person = new Person("Henkie", "de Vries", 55, "male");
        Person mother = new Person("Gerda", "Hartman", 61, "female");
        Person father = new Person("Koos", "Hartman", 62, "male");
        Person child = new Person("Junior", "Hartman", 9, "male");

        child.addParents(mother, father);
        System.out.println(child.getMother().getName());
        System.out.println(child.getFather().getName());



    }
}
