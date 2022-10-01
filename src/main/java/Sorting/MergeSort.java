package Sorting;

public class MergeSort implements Sorting {

    static String[] mergeSortV2(String[] Arr, int low, int high) {
        if (low == high) {
            String[] A = { Arr[low] };
            return A;
        }
        int mid = low + (high - low) / 2;
        String[] leftArr = mergeSortV2(Arr, low, mid);
        String[] rightArr = mergeSortV2(Arr, mid + 1, high);

        String[] sortedArr = merge(leftArr, rightArr);
        return sortedArr;
    }

    static String[] merge(String[] Arr1, String[] Arr2)
    {
        int m = Arr1.length;
        int n = Arr2.length;
        String[] Arr3 = new String[m + n];

        int idx = 0;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(Arr1[i], Arr2[j])) {
                Arr3[idx] = Arr1[i];
                i++;
            }
            else {
                Arr3[idx] = Arr2[j];
                j++;
            }
            idx++;
        }
        while (i < m) {
            Arr3[idx] = Arr1[i];
            i++;
            idx++;
        }
        while (j < n) {
            Arr3[idx] = Arr2[j];
            j++;
            idx++;
        }
        return Arr3;
    }

    // Return true if str1 appears before
    // str2 in alphabetical order
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        return str1.compareTo(str2) < 0;
    }






    //--------------------------------------------------------

    public String[] doMergeSort(String[] list) {
        String [] sorted;
        if (list == null || list.length == 0 || list.length == 1) {
            sorted = list;
        } else {
            int mid = list.length/2;
            String[] left = null;
            String[] right = null;
            if ((list.length % 2) == 0) {
                left = new String[list.length/2];
                right = new String[list.length/2];
            } else {
                left = new String[list.length/2];
                right = new String[(list.length/2)+1];
            }
            int x, y;
            for (x = 0 ; x < mid; x++) {
                left[x] = list[x];
            }
            for (y = 0; x < list.length; x++) {
                right[y++] = list[x];
            }
            left = doMergeSort(left);
            right = doMergeSort(right);
            sorted = mergeArray(left,right);
        }

        return sorted;
    }

    public String[] mergeArray(String[] left, String[] right) {
        String[] merged = new String[left.length+right.length];
        int lIndex = 0;
        int rIndex = 0;
        int mIndex = 0;
        int comp = 0;
        while (lIndex < left.length || rIndex < right.length) {
            if (lIndex == left.length) {
                merged[mIndex++] = right[rIndex++];
            } else if (rIndex == right.length) {
                merged[mIndex++] = left[lIndex++];
            } else {
                comp = left[lIndex].compareTo(right[rIndex]);
                if (comp > 0) {
                    merged[mIndex++] = right[rIndex++];
                } else if (comp < 0) {
                    merged[mIndex++] = left[lIndex++];
                } else {
                    merged[mIndex++] = left[lIndex++];
                }
            }
        }
        return merged;
    }

    @Override
    public String[] doSorting(String[] data) {

        String[] res = mergeSortV2(data, 0, 100);
        return res;
    }
}
