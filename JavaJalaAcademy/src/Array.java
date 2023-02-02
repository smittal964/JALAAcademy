import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) {

    }

    // Write a function to add integer values of an array
    public static void findSum(){
        int[] array = {10, 20, 30, 40, 50, 10};
        int sum = 0;

        //Advanced for loop
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
    }

    public static void findAverage(){
        int[] numArray = { 45, 67, 45, 20, 33, 45 };
        int sum = 0;

        for (int num:numArray) {
            sum += num;
        }
        int average = sum / numArray.length;
        System.out.println("The average is:" + average);
    }

    public static void findIndex(){
        int[] numbers = {4, 9, 7, 3, 2, 8};
        int element = 2;
        int index = -1;

        int i = 0;

        while(i < numbers.length) {
            if(numbers[i] == element) {
                index = i;
                break;
            }
            i++;
        }
        System.out.println("Index of "+element+" is : "+index);

    }


    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void removeElement(){
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Original Array : "+ Arrays.toString(my_array));

        // Remove the second element (index->1, value->14) of the array
        int removeIndex = 1;

        for(int i = removeIndex; i < my_array.length -1; i++){
            my_array[i] = my_array[i + 1];
        }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
        System.out.println("After removing the second element: "+Arrays.toString(my_array));
    }

    public static void copyArray(){
        int intArray[] = {12,15,17};

        //print original intArray
        System.out.println("Contents of intArray[] before assignment:");
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");

        // Create an array b[] of same size as a[]
        int copyArray[] = new int[intArray.length];

        // intArray is assigned to copyArray; so references point to same location
        copyArray = intArray;


        //print both arrays
        System.out.println("\nContents of intArray[]:");
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");

        System.out.println("\nContents of copyArray[]:");
        for (int i=0; i<copyArray.length; i++)
            System.out.println(copyArray[i] + " ");

    }

    // Function to insert x in arr at position pos
    public static int[] insertX(int n, int arr[],
                                int x, int pos)
    {
        int i;

        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }

    static int getMin(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }

    static int getMax(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.max(res, arr[i]);
        return res;
    }

    // function that reverses array and stores it
    // in another array
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    static int[] removeDuplicates(int[] array)
    {
        List<Integer> list = new ArrayList<Integer>();
        for(int i : array){
            list.add(i);
        }
        List<Integer> withoutDuplicates = list.stream().distinct().collect(Collectors.toList());
        int[] myArray = new int[withoutDuplicates.size()];
        for(int i = 0;i < myArray.length;i++)
            myArray[i] = withoutDuplicates.get(i);
        return myArray;
    }






}
