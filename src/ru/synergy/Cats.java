package ru.synergy;

import java.util.Objects;

public class Cats  implements  Comparable<Cats>{
   //-----------------------
     private String name;
   //-----------------------

    public Cats(String name) {
        this.name = name;
    }
    //------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                '}';
    }
    // Метод сравнивающий ссылки
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(name, cats.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Cats o) {
        return this.name.compareTo(o.name);
    }
    //-------------------------------------
}
