package Sorting;

public class InsertionSort implements Sorting {

    public String[] doInsertionSort(String[] arr, int arrSize) {
        String ele;
        int j;
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return arr;
        }

        //Traverse through 1 to size of the array
        for (int i = 1; i < arrSize; i++) {
            ele = arr[i]; // Element to be inserted
            j = i - 1;

            //shifts elements back to create space for the element to be inserted
            while (j >= 0 && ele.compareTo(arr[j])<0){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = ele;
        }
        return arr;
    }

    @Override
    public String[] doSorting(String[] data) {
        return doInsertionSort(data, data.length);
    }
}
