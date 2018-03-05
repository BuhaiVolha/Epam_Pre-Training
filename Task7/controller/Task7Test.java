package by.epam_pre_training.task7.controller;

import by.epam_pre_training.task7.entity.Cat;
import by.epam_pre_training.task7.model.AbstractTree;
import by.epam_pre_training.task7.model.BinaryTree;
import static by.epam_pre_training.task7.view.View.*;
import java.util.Comparator;

public class Task7Test {

    public static void main(String[] args) {

        Comparator<Cat> byName = Cat.CatNameComparator;
        Comparator<Cat> byAge = Cat.CatAgeComparator;
        Comparator<Cat> byMouses = Cat.CatMouseCaughtNumberComparator;

        AbstractTree<Cat> cats = new BinaryTree<>(byMouses);
        cats.add(new Cat("Barsik", 6, 15));
        cats.add(new Cat("Lapka", 8, 4));
        cats.add(new Cat("Murzik", 3, 22));
        cats.add(new Cat("Kruzis", 1, 7));

        try {
            cats.remove(new Cat("Murzik", 3, 22));
            print(cats.contains(new Cat("Murzik", 3, 22)));
        } catch (Exception e) {
            print(e.getMessage());
        }

        print(cats.traverseInOrder());


        AbstractTree<Integer> integers = new BinaryTree<>();
        integers.add(19);
        integers.add(3);
        integers.add(13);
        integers.add(33);
        integers.add(73);

        try {
            integers.remove(19);
            print(integers.contains(19));
        } catch (Exception e) {
            print(e.getMessage());
        }

        print(integers.traverseInOrder());
        integers.clear();
    }
}
