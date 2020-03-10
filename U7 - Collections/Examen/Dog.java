package Examen;

import java.io.Serializable;
import java.util.Objects;

public class Dog implements Serializable {
    private String dogName;
    private int age;
    private float weight;
    protected enum race{PastorAleman,Collie,Boxer}
    protected static race race;
    private Owner owner;

    public Dog(String dogName, int age, float weight, Dog.race race, Owner owner) {
        this.dogName = dogName;
        this.age = age;
        this.weight = weight;
        this.race = race;
        this.owner = owner;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Dog.race getRace() {
        return race;
    }

    public void setRace(Dog.race race) {
        this.race = race;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return getAge() == dog.getAge() &&
                Float.compare(dog.getWeight(), getWeight()) == 0 &&
                Objects.equals(getDogName(), dog.getDogName()) &&
                Objects.equals(getRace(), dog.getRace()) &&
                Objects.equals(getOwner(), dog.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDogName(), getAge(), getWeight(), getRace(), getOwner());
    }

    @Override
    public String toString() {
        return "dogName='" + dogName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                ", owner=" + owner +
                '}';
    }
}
