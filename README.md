
# nithish

I used Java program to read the entire data from the text file and store it in a String[] array object. 
I created int variables which has the data set sizes that are given in the problem statement. 
So now that I have different data sizes, I created a function that generated different arrays with individual sizes.
This way I was able to generate different dataSets with different sizes to perform the sorting operations. 

I used java inbuilt methods(from java.lang package) to log the start and end time and calculate the total execution time. 
To convert the time to seconds I used NumberFormatter class available in Java. 



# Teja
Implementation:

From the given data(.txt file) only the first column containing the names are separated aside 
and now the original data consists of 128113 rows of unsorted names. This data is stored in an array of Strings in Java.

From the array containing the unsorted names, different datasets are created for n ∈ {100, 500, 1000, 5000, 10000, 50000, 100000}
where n is the number of rows containing the names. For this I created separate functions to created individual array objects by passing in the different sizes. 
I have initialized the arrays with the sizes by hardcoding the values as the datasets are fixed. 

Separate arrays of String are created by passing the original data. So, now we are having different arrays with the above listed dataset sizes. 
These arrays are passed to our sorting algorithms to get individual execution times. 

For logging the execution time, I took the time before the algorithm start and after the algorithm end in milliseconds by using System.currentTimeMillis() in Java.
After taking the start and end time, to get the execution time in seconds the below operation is done: 

Final execution time = ((end - start)/1000d) seconds. 

After getting the individual execution times for each sorting algorithm, based on the final results graphs are generated. 


# common for both but paraphrase a little to not look alike

Below is the Time complexity analysis for Selection sort, Insertion sort, merge sort, Quick Sort: 

Insertion Sort:

Time complexity: 

Best case scenario : O(n), Linear-time
Worst case scenario : O(n2),  Quadratic-time

Space complexity : 0(1) as it is sorted in place.

Selection sort:

Time complexity: 
Worst case scenario : O(n2),  Quadratic-time

Merge sort:

It is done using divide and conquer algorithm, which divides the given array into left array and right array
and again merge them to form an ordered array. // paraphrase for nithish

Time complexity : O(nlogn)

Quick sort: 

Time complexity: 

Worst case scenario: O(n2)

Average case scenario: O(nlogn), when the pivot is picked randomly or when the input is uniformly distributed


References: 

https://stackoverflow.com/questions/17432738/insertion-sort-using-string-compareto
https://chortle.ccsu.edu/java5/Notes/chap92/ch92_5.html
https://www.cs.cmu.edu/~mrmiller/15-110/Handouts/sortAndSearch-4.pdf
https://www.efaculty.in/java-programs/selection-sort-in-string-program-in-java/
https://www.educba.com/merge-sort-in-java/
https://stackoverflow.com/questions/29294982/using-quicksort-on-a-string-array
https://gist.github.com/JosueDanielBust/24ea94310ea73c8ec255
