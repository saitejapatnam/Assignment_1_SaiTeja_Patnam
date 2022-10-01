import Sorting.InsertionSort;
import Sorting.MergeSort;
import Sorting.QuickSort;
import Sorting.SelectionSort;
import Utility.ReadFileFromResources;

import java.io.*;
import java.util.Arrays;

public class MainClass {

    public static void main(final String[] args) throws IOException {

        /*
        * Read the data from the text file and store it in an ArrayList of String
        */
        ReadFileFromResources readFileFromResources = new ReadFileFromResources();

        String[] data = readFileFromResources.getInputStream();

//        System.out.println(data.length);

        //test data

//        {"Evelyn", "Abigail", "Harper", "Emily" , "Elizabeth" , "Avery"}

        String[] testData = new String[]{"Evelyn", "Abigail", "Harper", "Emily" , "Elizabeth" , "Avery"};

        System.out.println("----Unsorted Data---- ");
        Arrays.stream(testData).forEach(System.out::println);


        // Datasets

        Integer dataSet100 = 100;
        Integer dataSet500 = 500;
        Integer dataSet1000 = 1000;
        Integer dataSet5000 = 5000;
        Integer dataSet10000 = 10000;
        Integer dataSet50000 = 50000;
        Integer dataSet100000 = 100000;

        /*
        * Selection Sort
        */

        System.out.println("----Selection Sort---- ");

        SelectionSort selectionSort = new SelectionSort();

        //For 100
//        System.out.println("----Selection Sort for 100---- ");
//
//        String[] data100 = new String[100];
//        int counter = 0;
//        for(int i = 0; i < dataSet100; i++){
//            data100[counter++] = data[i];
//        }
//        String[] res = selectionSort.doSelectionSort(data100, data100.length);
//        Arrays.stream(res).forEach(System.out::println);


//        //For 500
//        System.out.println("----Selection Sort for 500---- ");
//
//        String[] data500 = new String[500];
//        int counter = 0;
//        for(int i = 0; i < dataSet500; i++){
//            data500[counter++] = data[i];
//        }
//        String[] res = selectionSort.doSelectionSort(data500, data500.length);
//        Arrays.stream(res).forEach(System.out::println);



        //        //For 1000
        //        String[] res = selectionSort.doSelectionSort(data, dataSet1000);

        System.out.println("----Sorted Data---- ");

//        Arrays.stream(res).forEach(System.out::println);

        /*
         * Insertion Sort
         */
        System.out.println("----Insertion Sort---- ");

        //For 100
//        System.out.println("----Insertion Sort for 100---- ");
//
//        String[] data100 = new String[100];
//        int counter = 0;
//        for(int i = 0; i < dataSet100; i++) {
//            data100[counter++] = data[i];
//        }
//
//        InsertionSort insertionSort = new InsertionSort();
//
//        String[] insertRes = insertionSort.doSorting(data100);
//
//        Arrays.stream(insertRes).forEach(System.out::println);


        /*
         * Quick Sort
         */
//        System.out.println("----Quick Sort---- ");
//
//        System.out.println("----Quick Sort for 100---- ");
//
//        String[] data100 = new String[100];
//        int counter = 0;
//        for(int i = 0; i < dataSet100; i++) {
//            data100[counter++] = data[i];
//        }
//
//        QuickSort quickSort = new QuickSort();
//        String[] quickRes = quickSort.doSorting(data100);
//
//        Arrays.stream(quickRes).forEach(System.out::println);

        /*
         * Merge Sort
         */
        System.out.println("----Merge Sort---- ");

        System.out.println("----Merge Sort for 500---- ");

        String[] data500 = new String[500];
        int counter = 0;
        for(int i = 0; i < dataSet500; i++) {
            data500[counter++] = data[i];
        }
        MergeSort mergeSort = new MergeSort();

        String[] mergeRes = mergeSort.mergeSort(data500);

        Arrays.stream(mergeRes).forEach(System.out::println);
    }
}
