/*
1.print"Bright IT Career"ten times
public class BrightCareer {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println("Bright IT Career");
        }
    }
}
output:
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
*/


/* 2.print 1 to 20 numbers using the while loop
public class OneToTwenty {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 20) {
            System.out.println(i);
            i++;
        }
    }
}
*/

/* 3.program to equal operator and not equal
public class EqualityCheck {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
    }

}
output:
a == b: false
a != b: true
*/

/* 4.print the odd and even numbers
public class OddEven {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }
    }
}
output:
1 is odd
2 is even
3 is odd
4 is even
5 is odd
6 is even
7 is odd
8 is even
9 is odd
10 is even
11 is odd
12 is even
13 is odd
14 is even
15 is odd
16 is even
17 is odd
18 is even
19 is odd
20 is even
*/

/* 5.print largest number among three numbers
public class LargestNumber {
    public static void main(String[] args) {
        int a = 12, b = 20, c = 15;
        int largest = a;

        if(b > largest)
            largest = b;
        if(c > largest)
            largest = c;

        System.out.println("Largest number is: " + largest);
    }
}
output:Largest number is: 20
*/

/* 6.print even number between 10 and 100 using while
public class EvenNumbers {
    public static void main(String[] args) {
        int i = 10;
        while(i <= 100) {
            if(i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }
}
*/

/* 7.print 1 to 10 using the do-while loop
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= 10);
    }
}
*/

/* 8.program for Armstrong number or not
import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
*/

/* 9.program to find the prime or not
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
*/

/* 10.program to palindrome or not
import java.util.Scanner;

public class PalindromeString {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();

        if (isPalindrome(s)) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }
    }
}
*/

/* 11.check whether number is even or odd using switch
import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        switch(num % 2) {
            case 0:
                System.out.println(num + " is even.");
                break;
            case 1:
                System.out.println(num + " is odd.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
*/

/* 12.print gender program according to given M\F using switch
import java.util.Scanner;

public class GenderSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);

        switch(Character.toUpperCase(gender)) {
            case 'M':
                System.out.println("Gender: Male");
                break;
            case 'F':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
*/

/* 13.Program for multiple if else statement(largest number in 10,20 and 30)
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if(a >= b && a >= c)
            System.out.println("Largest number is: " + a);
        else if(b >= a && b >= c)
            System.out.println("Largest number is: " + b);
        else
            System.out.println("Largest number is: " + c);
    }
}
*/
