public class Array
{
    public static void main(String[] args)
    {
        int[] numbers = {4, 7, 2, 9, 5};
        int sum = 0;

       
        for(int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
        }

       
        System.out.println("Sum of array elements: " + sum);
    }
}

//max and min
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

//array index
public class Array {

    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;    
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
//element contain or not in java
public class Array
{

    public static void main(String[] args)
    {
        int[] numbers = {5, 10, 15, 20, 25};
        int target = 15;

        boolean found = false;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == target)
            {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Array contains the value " + target);
        } else {
            System.out.println("Array does not contain the value " + target);
        }
    }
}
//remove element
public class Array {

    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};
        int removeElement = 30;

        int count = 0;

       
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] != removeElement)
            {
                count++;
            }
        }

       
        int[] newArray = new int[count];
        int j = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != removeElement)
            {
                newArray[j] = numbers[i];
                j++;
            }
        }

       
        System.out.println(removeElement );
        for (int i = 0; i < newArray.length; i++)
        {
            System.out.print(newArray[i] + " ");
        }
    }
}
//copy of an array into another
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

//reverse of an array
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
//common elements of 2 arrays
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


//remove duplicates in an array
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




//second largest elements in an array
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
