/*1. Add Integer Values of an Array
  import java.util.Scanner;
public class ArrayAddition
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int sum = 0;
         int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++)
        {
            numbers[i] = scanner.nextInt();
            sum = sum + numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}

*/

/*2. Calculate the Average Value of an Array of Integers
import java.util.Scanner;
public class AverageCalculator {
    public static double averageArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        double average = averageArray(numbers);
        System.out.println("Average value: " + average);
    }
}
*/

/*3. Find the Index of an Array Element
import java.util.Scanner;
public class FindIndex {
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to find its index: ");
        int value = scanner.nextInt();  
        int index = findIndex(numbers, value);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
*/

/*4. Test if Array Contains a Specific Value
public class ArrayContainsExample {
    public static boolean contains(int[] arr, int target) {
        for (int n : arr) {
            if (n == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = { 3, 5, 7, 2, 6, 10 };
        int key = 7;
        System.out.println(key + (contains(numbers, key) ? " found." : " not found."));
    }
}
*/

/*5. Remove a Specific Element from an Array
import java.util.Arrays;
public class RemoveElement {
    public static int[] remove(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) return arr;
        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 0, result, 0, index);
        System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 40};
        System.out.println("Before: " + Arrays.toString(numbers));
        numbers = remove(numbers, 20);
        System.out.println("After:  " + Arrays.toString(numbers));
    }
}
*/

/* 6.copy of an array into another
public class Array {

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};  
        int[] copy = new int[original.length];  

       
        for (int i = 0; i < original.length; i++)
        {
            copy[i] = original[i];
        }
        System.out.println("Copied array elements:");
        for (int i = 0; i < copy.length; i++)
        {
            System.out.print(copy[i] + " ");
        }
    }
}
*/

/* 7.insert element in the array
import java.util.Arrays;
public class InsertAtPosition {
    public static void main(String[] args) {
        int[] arr = {24, 14, 56, 15, 36, 56, 76, 18, 39, 49};
        int index = 2;    
        int newValue = 5; 
        System.out.println("Original: " + Arrays.toString(arr));
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = newValue; 
        System.out.println("After:    " + Arrays.toString(arr));
    }
}
*/

/* 8.max and min
public class Array
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 45, 32, 67, 29};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println( max);
        System.out.println( min);
    }
}
*/
     
/*9.reverse of an array
public class Array {
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
*/

/*10. to find the duplicate values of an array
import java.util.Arrays;
public class FindDuplicatesBrute {
    public static void main(String[] args) {
        int[] arr = {12, 11, 40, 5, 6, 5, 12, 11};
        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}

/*11.common elements of 2 arrays
public class Array {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {15, 20, 35, 40, 60};

        System.out.println("Common elements:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }
    }
}
*/

/* 12.remove duplicates in an array
public class Array {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 50, 30};
        int n = arr.length;

        int[] temp = new int[n];
        int newIndex = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < newIndex; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[newIndex] = arr[i];
                newIndex++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newIndex; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
*/

/*14.second largest elements in an array
       public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 20, 40};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("Second largest element: " + second);
    }
}
*/

/*15.method to find number of even number and odd number in the array
public class EvenOddCounter {
    public static void countEvenOdd(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
    public static void main(String[] args) {
        int[] sample = {5, 7, 2, 4, 9};
        System.out.print("Array: ");
        System.out.println(java.util.Arrays.toString(sample));
        countEvenOdd(sample);
    }
}
*/

/*16.difference of largest and smallest value
import java.util.Arrays;

public class MinMaxDifference {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Largest value: " + max);
        System.out.println("Smallest value: " + min);
        System.out.println("Difference (max - min): " + (max - min));
    }
}
*/

/*17.to verify if the array contains two specified elements and return the new array
import java.util.Arrays;
public class ArrayContainsTwo {
    public static int[] findTwo(int[] arr, int target1, int target2) {
        boolean found1 = false, found2 = false;
        int val1 = 0, val2 = 0;
        for (int num : arr) {
            if (!found1 && num == target1) {
                found1 = true;
                val1 = num;
            } else if (!found2 && num == target2) {
                found2 = true;
                val2 = num;
            }
            if (found1 && found2) {
                return new int[] { val1, val2 };
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        i nt[] data = { 10, 20, 30, 40, 50, 60 };
        int t1 = 30, t2 = 50;
        int[] result = findTwo(data, t1, t2);
        System.out.println("Original array: " + Arrays.toString(data));
        if (result.length == 2) {
            System.out.println("Found both: " + Arrays.toString(result));
        } else {
            System.out.println("One or both values not found");
}
        result = findTwo(data, 70, 20);
        System.out.println("Result for 70 & 20: " +
            (result.length == 0 ? "Not found" : Arrays.toString(result)));
    }
}
*/

/*18.to remove the duplicate elements and return the new array
import java.util.Arrays;
public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        for (int num : arr) {
            set.add(num); 
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] data = {2, 5, 4, 9, 2, 5, 9, 4, 7, 5};
        System.out.println("Original:          " + Arrays.toString(data));
        int[] unique = removeDuplicates(data);
        System.out.println("After removing duplicates: " + Arrays.toString(unique));
    }
}

/*19.find the missing number of sorted array of 1 to 100
public class MissingNumberFinder {
    public static int findMissing(int[] arr) {
        int n = 100;
        int expectedSum = n * (n + 1) / 2;  
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] data = new int[99];
        int missing = 42;  
        for (int i = 1, j = 0; i <= 100; i++) {
            if (i != missing) data[j++] = i;
        }
        System.out.println("Missing number: " + findMissing(data));
    }
}
