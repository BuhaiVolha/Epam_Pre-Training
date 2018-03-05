package by.epam_pre_training.task7.controller;

import by.epam_pre_training.task7.entity.Cat;
import by.epam_pre_training.task7.logic.AbstractTree;
import by.epam_pre_training.task7.logic.BinaryTree;
import static  by.epam_pre_training.task7.view.View.*;
import java.util.Comparator;

public class Task7Test {

    public static void main(String[] args) {

        // creating a binary tree of Cats based on mouse caught number

        Comparator<Cat> byMouses = Cat.CatMouseCaughtNumberComparator;

        AbstractTree<Cat> cats = new BinaryTree<>(byMouses);
        
        cats.add(new Cat("Barsik", 6, 15));
        cats.add(new Cat("Lapka", 8, 4));
        cats.add(new Cat("Murzik", 3, 22));
        cats.add(new Cat("Kruzis", 1, 7));

        print("There are " 
                + cats.size() 
                + " cats on the tree:\n" 
                + cats);

        try {
            Cat toBeDeletedCat = new Cat("Murzik", 3, 22);

            print("Getting "
                    + toBeDeletedCat.getName()
                    + " out of the tree...");
            cats.remove(toBeDeletedCat);

            print(toBeDeletedCat.getName()
                    + " is on the tree: "
                    + cats.contains(toBeDeletedCat));

        } catch (Exception e) {
            print(e.getMessage());
        }

        print("\nPrint cats in order:");
        print(cats.traverseInOrder());

        print("Print cats in post-order:");
        print(cats.traversePostOrder());

        print("Print cats in pre-order:");
        print(cats.traversePreOrder());

        print("Clearing the tree...");
        cats.clear();
        print("Cats on the tree: " + cats.size());

    }
}
