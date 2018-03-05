package by.epam_pre_training.task7.entity;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {

    private String name;
    private int age;
    private int mouseCaughtNumber;


    public Cat() {}

    public Cat(String name, int age, int mouseCaughtNumber) {
        this.name = name;
        this.age = age;
        this.mouseCaughtNumber = mouseCaughtNumber;
    }

    public Cat(Cat cat) {
        this(cat.getName(), cat.getAge(),cat.getMouseCaughtNumber());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMouseCaughtNumber() {
        return mouseCaughtNumber;
    }

    public void setMouseCaughtNumber(int mouseCaughtNumber) {
        this.mouseCaughtNumber = mouseCaughtNumber;
    }


    @Override
    public boolean equals(Object o) {
        if ((o == null)
                || (o.getClass() != this.getClass())) {
            return false;
        }

        if (this == o) {
            return true;
        }

        Cat cat = (Cat) o;

        return (getAge() == cat.getAge())
                &&(getMouseCaughtNumber() == cat.getMouseCaughtNumber())
                && (getName().equals(cat.getName()));
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + getMouseCaughtNumber();
        return result;
    }

    @Override
    public String toString() {
        return "Cat "
                + name
                + ", age "
                + age
                + ", has caught "
                + mouseCaughtNumber
                + " mouses.";
    }


    @Override
    public int compareTo(Cat c) {
        return Integer.compare(this.mouseCaughtNumber, c.getMouseCaughtNumber());
    }

    public static Comparator<Cat> CatNameComparator = new Comparator<Cat>() {
        @Override
        public int compare(Cat c1, Cat c2) {
            String name1 = c1.getName().toUpperCase();
            String name2 = c2.getName().toUpperCase();

            return name1.compareTo(name2);
        }
    };

    public static Comparator<Cat> CatAgeComparator = new Comparator<Cat>() {
        @Override
        public int compare(Cat c1, Cat c2) {
            int age1 = c1.getAge();
            int age2 = c2.getAge();

            return age1 - age2;
        }
    };

    public static Comparator<Cat> CatMouseCaughtNumberComparator = new Comparator<Cat>() {
        @Override
        public int compare(Cat c1, Cat c2) {
            int age1 = c1.getMouseCaughtNumber();
            int age2 = c2.getMouseCaughtNumber();

            return age1 - age2;
        }
    };
}
