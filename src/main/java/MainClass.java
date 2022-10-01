import Sorting.InsertionSort;
import Sorting.MergeSort;
import Sorting.QuickSort;
import Sorting.SelectionSort;
import Utility.ReadFileFromResources;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainClass {

    public static void main(final String[] args) throws IOException {

        /*
        * Read the data from the text file and store it in an ArrayList of String
        */
        ReadFileFromResources readFileFromResources = new ReadFileFromResources();

        String[] data = readFileFromResources.getInputStream();

        // Datasets
        // Creating the individual Data sets from the actual data

        // For n = 100
        int counter = 0;
        String[] dataSet100 = new String[100];
        for(int i = 0; i < 100; i++){
            dataSet100[counter++] = data[i];
        }

        // For n = 500
        counter = 0;
        String[] dataSet500 = new String[500];
        for(int i = 0; i < 500; i++){
            dataSet500[counter++] = data[i];
        }

        // For n = 1000
        counter = 0;
        String[] dataSet1000 = new String[1000];
        for(int i = 0; i < 1000; i++){
            dataSet1000[counter++] = data[i];
        }

        // For n = 5000
        counter = 0;
        String[] dataSet5000 = new String[5000];
        for(int i = 0; i < 5000; i++){
            dataSet5000[counter++] = data[i];
        }

        // For n = 10000
        counter = 0;
        String[] dataSet10000 = new String[10000];
        for(int i = 0; i < 10000; i++){
            dataSet10000[counter++] = data[i];
        }

        // For n = 50000
        counter = 0;
        String[] dataSet50000 = new String[50000];
        for(int i = 0; i < 50000; i++){
            dataSet50000[counter++] = data[i];
        }

        // For n = 100000
        counter = 0;
        String[] dataSet100000 = new String[100000];
        for(int i = 0; i < 100000; i++){
            dataSet100000[counter++] = data[i];
        }

        /*
        * Selection Sort,
        * Sorting the individual datasets using selection sort
        */
        System.out.println("----Selection Sort---- ");
        // Initializing the SelectionSort class
        SelectionSort selectionSort = new SelectionSort();

        // For 100
        long start = System.currentTimeMillis();

        String[] selectionSortResultFor100 = selectionSort.doSelectionSort(dataSet100, dataSet100.length);

        long end = System.currentTimeMillis();

        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");


//
//        // For 500
//        String[] selectionSortResultFor500 = selectionSort.doSelectionSort(dataSet500, dataSet500.length);
//
//        // For 1000
//        String[] selectionSortResultFor1000 = selectionSort.doSelectionSort(dataSet1000, dataSet1000.length);
//
//        // For 5000
//        String[] selectionSortResultFor5000 = selectionSort.doSelectionSort(dataSet5000, dataSet5000.length);
//
//        // For 10000
//        String[] selectionSortResultFor10000 = selectionSort.doSelectionSort(dataSet10000, dataSet10000.length);
//
//        // For 50000
//        String[] selectionSortResultFor50000 = selectionSort.doSelectionSort(dataSet50000, dataSet50000.length);
//
//        // For 100000
//        String[] selectionSortResultFor100000 = selectionSort.doSelectionSort(dataSet100000, dataSet100000.length);


        /*
         * Insertion Sort
         */
//        System.out.println("----Insertion Sort---- ");
//        InsertionSort insertionSort = new InsertionSort();
//
//        // For 100
//        String[] insertionSortResultFor100 = insertionSort.doInsertionSort(dataSet100, dataSet100.length);
//
//        // For 500
//        String[] insertionSortResultFor500 = insertionSort.doInsertionSort(dataSet500, dataSet500.length);
//
//        // For 1000
//        String[] insertionSortResultFor1000 = insertionSort.doInsertionSort(dataSet1000, dataSet1000.length);
//
//        // For 5000
//        String[] insertionSortResultFor5000 = insertionSort.doInsertionSort(dataSet5000, dataSet5000.length);
//
//        // For 10000
//        String[] insertionSortResultFor10000 = insertionSort.doInsertionSort(dataSet10000, dataSet10000.length);
//
//        // For 50000
//        String[] insertionSortResultFor50000 = insertionSort.doInsertionSort(dataSet50000, dataSet50000.length);
//
//        // For 100000
//        String[] insertionSortResultFor100000 = insertionSort.doInsertionSort(dataSet100000, dataSet100000.length);


        /*
         * Quick Sort
         */
//        System.out.println("----Quick Sort---- ");
//
//        QuickSort quickSort = new QuickSort();
//
//        // For 100
//        String[] quickSortResultFor100 = quickSort.doSorting(dataSet100);
//
//        // For 500
//        String[] quickSortResultFor500 = quickSort.doSorting(dataSet500);
//
//        // For 1000
//        String[] quickSortResultFor1000 = quickSort.doSorting(dataSet1000);
//
//        // For 5000
//        String[] quickSortResultFor5000 = quickSort.doSorting(dataSet5000);
//
//        // For 10000
//        String[] quickSortResultFor10000 = quickSort.doSorting(dataSet10000);
//
//        // For 50000
//        String[] quickSortResultFor50000 = quickSort.doSorting(dataSet50000);
//
//        // For 100000
//        String[] quickSortResultFor100000 = quickSort.doSorting(dataSet100000);

        /*
         * Merge Sort
         */
//        System.out.println("----Merge Sort---- ");
//
//        MergeSort mergeSort = new MergeSort();

//        long startTime = System.currentTimeMillis();
//
//        // For 100
//        String[] mergeSortResultFor100 = mergeSort.doMergeSort(dataSet100);
//
//        // For 500
//        String[] mergeSortResultFor500 = mergeSort.doMergeSort(dataSet500);
//
//        // For 1000
//        String[] mergeSortResultFor1000 = mergeSort.doMergeSort(dataSet1000);
//
//        // For 5000
//        String[] mergeSortResultFor5000 = mergeSort.doMergeSort(dataSet5000);
//
//        // For 10000
//        String[] mergeSortResultFor10000 = mergeSort.doMergeSort(dataSet10000);
//
//        // For 50000
//        String[] mergeSortResultFor50000 = mergeSort.doMergeSort(dataSet50000);
//
//        // For 100000
//        String[] mergeSortResultFor100000 = mergeSort.doMergeSort(dataSet100000);
//
//        long endTime = System.currentTimeMillis();
    }
}
