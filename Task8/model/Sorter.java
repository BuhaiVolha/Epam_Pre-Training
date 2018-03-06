package by.epam_pre_training.task8.model;

import java.util.Comparator;

public class Sorter<E extends Comparable<E>> {

    private Comparator<E> comparator;

    public Sorter() {}

    public Sorter(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    // bubble sort

    public E[] bubbleSort(E... array) {
        int lastSwapIndex = array.length - 1;
        int top = array.length;
        boolean swapped;

        for (int i = 1; i < top; i++) {
            int currentSwapIndex = -1;
            swapped = false;

            for (int j = 0; j < lastSwapIndex; j++) {
                if (getComparator().compare(array[j], array[j + 1]) > 0) {
                    swap(j, j + 1, array);
                    swapped = true;
                    currentSwapIndex = j;
                }
            }
            if (!swapped) {
                break;
            }
            lastSwapIndex = currentSwapIndex;
        }
        return array;
    }


    public E[] bubbleSortRecursive(E... array) {
        return bubbleSortRecursive(array, array.length);
    }


    private E[] bubbleSortRecursive(E[] array, int size) {
        if (size == 1) {
            return array;
        }
        for (int i = 0; i < size - 1; i++) {
            if (getComparator().compare(array[i], array[i + 1]) > 0) {
                swap(i, i + 1, array);
            }
        }
        return bubbleSortRecursive(array, size - 1);
    }


    // insertion sort

    // works with Integers, but somehow causes an infinite loop with Cat Obj

//    public E[] insertionSort(E... array) {
//        int top = array.length;
//
//        for (int i = 1; i < top; i++) {
//            E temp = array[i];
//            int j;
//
//            for (j = i; (j > 0) && (getComparator().compare(array[j - 1], temp) > 0); i--) {
//                array[j] = array[j - 1];
//            }
//            array[j] = temp;
//        }
//        return array;
//    }


    public E[] insertionSort(E... array) {

        for(int i = 1; i < array.length; i++) {
            for(int j = i; (j > 0) && (getComparator().compare(array[j-1], array[j]) > 0); j--) {
                swap(j, j - 1, array);
            }
        }
        return array;
    }


    public E[] insertionSortRecursive(E... array) {
        return insertionSortRecursive(array, array.length);
    }


    private E[] insertionSortRecursive(E[] array, int size) {
        if (size <= 1) {
            return array;
        }
        insertionSortRecursive(array, size - 1);
        E lastElement = array[size - 1];
        int j = size - 2;

        while ((j >= 0) && (getComparator().compare(array[j], lastElement) > 0)) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = lastElement;

        return array;
    }


    // selection sort

    public E[] selectionSort(E... array) {
        int top = array.length;

        for (int i = 0; i < top - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < top; j++) {
  
                if (getComparator().compare(array[minIndex], array[j]) > 0) {
                    minIndex = j;
                }
            }
            swap(minIndex, i, array);
        }
        return array;
    }


    public E[] selectionSortRecursive(E... array) {
        return selectionSortRecursive(array.length, 0, array);
    }


    private E[] selectionSortRecursive(int size, int index, E[] array) {
        if (index == size) {
            return array;
        }
        int minIndex = findMinIndex(index, size - 1, array);
        
        if (minIndex != index) {
            swap(minIndex, index, array);
        }
        return selectionSortRecursive(size, index + 1, array);
    }


    private int findMinIndex(int i, int j, E[] array) {
    
        if (i == j) {
            return i;
        }
        int minIndex = findMinIndex(i + 1, j, array);

        return (getComparator().compare(array[i], array[minIndex]) < 0) ? i : minIndex;
    }


    // merge sort

    public E[] mergeSort(E... array) {
    
        if (array.length > 1) {
            int middle = array.length / 2;

            E[] leftPart = (E[]) new Comparable[middle];
            System.arraycopy(array, 0, leftPart, 0, middle);

            E[] rightPart = (E[]) new Comparable[array.length - middle];
            System.arraycopy(array, middle, rightPart, 0, array.length - middle);

            mergeSort(leftPart);
            mergeSort(rightPart);

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < leftPart.length && j < rightPart.length) {

                if (getComparator().compare(leftPart[i], rightPart[j]) < 0) {
                    array[k] = leftPart[i];
                    i++;
                } else {
                    array[k] = rightPart[j];
                    j++;
                }
                k++;
            }
            while (i < leftPart.length) {
                array[k] = leftPart[i];
                i++;
                k++;
            }
            while (j < rightPart.length) {
                array[k] = rightPart[j];
                j++;
                k++;
            }
        }
        return array;
    }


    public E[] mergeSortRecursive(E... array) {
        return mergeSortRecursive(0, array.length - 1, array);
    }


    private E[] mergeSortRecursive(int lowIndex, int highIndex, E[] array) {

        if (lowIndex < highIndex) {
            int middle = lowIndex + (highIndex - lowIndex) / 2;

            mergeSortRecursive(lowIndex, middle, array);
            mergeSortRecursive(middle + 1, highIndex, array);
            mergeParts(lowIndex, middle, highIndex, array);
        }
        return array;
    }


    @SuppressWarnings("unchecked")
    private void mergeParts(int lowerIndex, int middle, int higherIndex, E[] array) {
        E[] mergedArray = (E[]) new Comparable[array.length];
        System.arraycopy(array, 0, mergedArray, 0, array.length);


        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {

            if (getComparator().compare(mergedArray[i], mergedArray[j]) <= 0) {
                mergedArray[k] = mergedArray[i];
                i++;
            } else {
                mergedArray[k] = mergedArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            mergedArray[k] = mergedArray[i];
            k++;
            i++;
        }
    }


    // quick sort

    public E[] quickSort(E... array) {
        return quickSort(0, array.length - 1, array);
    }


    private E[] quickSort(int low, int high, E[] array) {
        int lowWorkingVal = low;
        int highWorkingVal = high;
        E pivot = array[low + (high - low) / 2];

        while (lowWorkingVal <= highWorkingVal) {
            while (getComparator().compare(array[lowWorkingVal], pivot) < 0) {
                lowWorkingVal++;
            }

            while (getComparator().compare(array[highWorkingVal], pivot) > 0) {
                highWorkingVal--;
            }

            if (lowWorkingVal <= highWorkingVal) {
                swap(lowWorkingVal, highWorkingVal, array);
                lowWorkingVal++;
                highWorkingVal--;
            }
        }
        if (low < highWorkingVal) {
            quickSort(low, highWorkingVal, array);
        }
        if (lowWorkingVal < high) {
            quickSort(lowWorkingVal, high, array);
        }
        return array;
    }


    private void swap(int firstIndex, int secondIndex, E[] array) {
        E temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }


    private Comparator<? super E> getComparator() {
        if (comparator != null) {
            return comparator;
        }
        else {
            return new Comparator<E>() {
                public int compare(E el, E e12) {
                    return el.compareTo(e12);
                }
            };
        }
    }
}
