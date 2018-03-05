package by.epam_pre_training.task8.controller;

import by.epam_pre_training.task7.entity.Cat;
import by.epam_pre_training.task8.logic.Searcher;
import by.epam_pre_training.task8.logic.Sorter;
import java.util.Comparator;
import static by.epam_pre_training.task8.view.View.*;

public class Task8Test {

    public static void main(String[] args) {

        // sorting Integers

        Sorter<Integer> sorter = new Sorter<>();

        Integer[] array = {7, 4, 9, 1, 2, 0, 5};
        print("The unsorted array is:");
        print(array);

        print("Sorting using bubble sort:");
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


        // sorting Cat objects from 7th task

        Comparator<Cat> byName = Cat.CatNameComparator;
        Comparator<Cat> byAge = Cat.CatAgeComparator;
        Comparator<Cat> byMouses = Cat.CatMouseCaughtNumberComparator;

        Sorter<Cat> catSorterByName = new Sorter<>(byName);
        Sorter<Cat> catSorterByAge = new Sorter<>(byAge);
        Sorter<Cat> catSorterByMouses = new Sorter<>(byMouses);

        Cat[] cats = {new Cat("Barsik", 6, 15),
                new Cat("Lapka", 8, 4),
                new Cat("Murzik", 3, 22),
                new Cat("Kruzis", 1, 7)};

        print("\nSorting cats by their name:");
        printObj(catSorterByName.mergeSortRecursive(cats));

        print("\nSorting cats by their age:");
        printObj(catSorterByAge.selectionSort(cats));

        print("\nSorting cats by mouses caught:");
        printObj(catSorterByMouses.insertionSort(cats));

        Searcher<Cat> catSearcher = new Searcher<>();
        Cat lostCat = new Cat("Murzik", 3, 22);
        print("\nSearching " + lostCat.getName() + "'s index:");
        
        print("\nUsing linear search:");
        print(catSearcher.linearSearchRecursive(lostCat, cats));
        
        print("Using binary search:");
        print(catSearcher.binarySearch(lostCat, cats));
    }
}
