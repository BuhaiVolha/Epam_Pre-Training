package by.epam_pre_training.task8.model;

public class Searcher<E extends Comparable<E>> {

    //linear search

    public int linearSearch(E element, E[] array) {
        for (int i = 0; i < array.length; i++) {

            if (array[i].compareTo(element) == 0) {
                return i;
            }
        }
        return -1;
    }


    public int linearSearchRecursive(E element, E[] array) {
        return linearSearchRecursive(element, array.length - 1, array);
    }


    private int linearSearchRecursive(E element, int index, E[] array) {
        if (index == 0) {
            return -1;
        }

        if (array[index].compareTo(element) == 0) {
            return index;
        }
        return linearSearchRecursive(element, index - 1, array);
    }


    // binary search

    public int binarySearch(E element, E[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle].compareTo(element) < 0) {
                left = middle + 1;
            } else if (array[middle].compareTo(element) > 0) {
                right = middle - 1;
            } else if (array[middle].compareTo(element) == 0) {
                return middle;
            }
        }
        return -1;
    }


    public int binarySearchRecursive(E element, E[] array) {
        return binarySearchRecursive(element, 0, array.length - 1, array);
    }


    private int binarySearchRecursive(E element, int left, int right, E[] array) {
        int middle = (left + right) / 2;

        if (right < left) {
            return -1;
        }

        if (array[middle].compareTo(element) == 0) {
            return middle;
        } else if (array[middle].compareTo(element) > 0) {
            return binarySearchRecursive(element, left, middle - 1, array);
        } else {
            return binarySearchRecursive(element, middle + 1, right, array);
        }
    }
}
