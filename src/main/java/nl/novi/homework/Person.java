package nl.novi.homework;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private String middleName;
    private final String lastName;
    private String sex;
    private int age;

    private Person mother;
    private Person father;

    private List<Pet> pets;
    private List<Person> children;
    private List<Person> siblings;

    public Person(String name, String lastName, int age, String sex){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, String sex){
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public void addParents(Person mother, Person father, Person child){
        child.setMother(mother);
        child.setFather(father);
    }

    public void addChild(Person child){
        if (!getChildren().contains(child)) {
            getChildren().add(child);
        }

        mother.setChildren(children);

    }

    public void addPet(Person person, Pet pet){
        List<Pet> pets = new ArrayList<>();
        if (person.getPets() != null){
            pets.addAll(person.getPets());
        }
        pets.add(pet);
        person.setPets(pets);
    }

    public void addSibling(Person person, Person sibling){

    }

//    getters
    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    //    setters
    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }
}
