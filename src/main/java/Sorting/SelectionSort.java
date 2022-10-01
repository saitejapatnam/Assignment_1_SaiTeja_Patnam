package Sorting;

public class SelectionSort implements Sorting {

    public String[] doSelectionSort(String[] array, int size )
    {
        if (array == null || array.length == 0 || array.length == 1) {
            return array;
        }

        // Find the string reference that should go in each cell of
        // the array, from cell 0 to the end
        for ( int j=0; j < size-1; j++ )
        {
            // Find min: the index of the string reference that should go into cell j.
            // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
            int min = j;
            for ( int k=j+1; k < size; k++ )
                if ( array[k].compareTo( array[min] ) < 0 )
                    min = k;

            // Swap the reference at j with the reference at min
            String temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
        return array;
    }

    @Override
    public String[] doSorting(String[] data) {
        return doSelectionSort(data, data.length);
    }
}
