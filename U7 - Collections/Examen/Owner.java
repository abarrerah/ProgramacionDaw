package Examen;

import java.io.Serializable;
import java.util.Objects;

public class Owner implements Serializable {
    private String Name;
    private String Surname;
    private int SocietyCode;
    private String Country;

    public Owner(String name, String surname, int societyCode, String country) {
        Name = name;
        Surname = surname;
        SocietyCode = societyCode;
        Country = country;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getSocietyCode() {
        return SocietyCode;
    }

    public void setSocietyCode(int societyCode) {
        SocietyCode = societyCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return getSocietyCode() == owner.getSocietyCode() &&
                Objects.equals(getName(), owner.getName()) &&
                Objects.equals(getSurname(), owner.getSurname()) &&
                Objects.equals(getCountry(), owner.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getSocietyCode(), getCountry());
    }

    @Override
    public String toString() {
        return "El dueño es " + getName()+ " "+getSurname() +
                " con el código " + getSocietyCode() +" y del país "+getCountry();
    }
}
