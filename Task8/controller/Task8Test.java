package by.epam_pre_training.task8.controller;

import by.epam_pre_training.task5.container.MyList;
import by.epam_pre_training.task5.entity.MagicItem;
import by.epam_pre_training.task5.generator.MagicItemCreator;
import by.epam_pre_training.task8.exceptions.LogicTask8Exception;
import by.epam_pre_training.task8.utils.Validator;
import by.epam_pre_training.task7.entity.Cat;
import by.epam_pre_training.task8.model.Searcher;
import by.epam_pre_training.task8.model.Sorter;
import java.util.Comparator;
import static by.epam_pre_training.task8.view.View.*;

public class Task8Test {

    public static void main(String[] args) {

        // sorting Integers

        Sorter<Integer> sorter = new Sorter<>();

        Integer[] array = {7, 4, 9, 1, 2, 0, 5};

        try {
            Validator.validateArray(array);

            print("The unsorted array is:");
            print(array);

            print("\nSorting using bubble sort:");
            print(sorter.bubbleSort(array));
            print(sorter.bubbleSortRecursive(array));

            print("Sorting using insertion sort:");
            print(sorter.insertionSort(array));
            print(sorter.insertionSortRecursive(array));

            print("Sorting using selection sort:");
            print(sorter.selectionSort(array));
            print(sorter.selectionSortRecursive(array));

            print("Sorting using merge sort:");
            print(sorter.mergeSort(array));
            print(sorter.mergeSortRecursive(array));

            print("Sorting using quick sort:");
            print(sorter.quickSort(array));

            // search

            Searcher<Integer> searcher = new Searcher<>();

            Integer numberToFind = 5;
            print("\nSearching the index of " + numberToFind + " using linear search:");
            print(searcher.linearSearch(numberToFind, array));
            print(searcher.linearSearchRecursive(numberToFind, array));

            print("Searching the index of " + numberToFind + " using binary search:");
            print(searcher.binarySearch(numberToFind, array));
            print(searcher.binarySearchRecursive(numberToFind, array));

        } catch (LogicTask8Exception e) {
            print(e.getMessage());
        }


        // sorting Cat objects from 7th task

        Cat[] cats = {new Cat("Barsik", 6, 15),
                new Cat("Lapka", 8, 4),
                new Cat("Murzik", 3, 22),
                new Cat("Kruzis", 1, 7)};

        try {
            Validator.validateArray(cats);

            Comparator<Cat> byName = Cat.CatNameComparator;
            Comparator<Cat> byAge = Cat.CatAgeComparator;
            Comparator<Cat> byMouses = Cat.CatMouseCaughtNumberComparator;

            Sorter<Cat> catSorterByName = new Sorter<>(byName);
            Sorter<Cat> catSorterByAge = new Sorter<>(byAge);
            Sorter<Cat> catSorterByMouses = new Sorter<>(byMouses);

            print("\nSorting cats by their name:");
            printEntityArray(catSorterByName.mergeSortRecursive(cats));

            print("\nSorting cats by their age:");
            printEntityArray(catSorterByAge.selectionSort(cats));

            print("\nSorting cats by mouses caught:");
            printEntityArray(catSorterByMouses.insertionSort(cats));

            Searcher<Cat> catSearcher = new Searcher<>();
            Cat lostCat = new Cat("Murzik", 3, 22);
            print("\nSearching " + lostCat.getName() + "'s index:");

            print("\nUsing linear search:");
            print(catSearcher.linearSearchRecursive(lostCat, cats));

            print("Using binary search:");
            print(catSearcher.binarySearch(lostCat, cats));

        } catch (LogicTask8Exception e) {
            print(e.getMessage());
        }


        // sorting Magic Items from 5th task
        // creating a list of Magic Items

        MagicItemCreator creator = MagicItemCreator.getInstance();
        MyList<MagicItem> magicItemsList = creator.createMagicItemList(6);
        MagicItem[] magicItemsArray = new MagicItem[magicItemsList.size()];
        magicItemsArray = magicItemsList.toArray(magicItemsArray);

        print("The unsorted list:");
        printEntityArray(magicItemsArray);
        print("\nSorting by magic power:");
        Sorter<MagicItem> magicSorter = new Sorter<>();
        printEntityArray(magicSorter.mergeSort(magicItemsArray));

        print("\nSorting by name:");
        Comparator<MagicItem> byName = MagicItem.MagicItemNameComparator;
        Sorter<MagicItem> sorterByName = new Sorter<>(byName);
        printEntityArray(sorterByName.insertionSort(magicItemsArray));
    }
}
