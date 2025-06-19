/*1
 class Patterns
{
public static void main(String [] args)
{
int rows=6;
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=rows;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
output:
******
******
******
******
******
*/

/*2
 class Patterns
{
public static void main(String [] args)
{
int rows=5;
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=rows;j++)
{
System.out.print(i  +" ");
}
System.out.println();
}
}
}
output:
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
*/

/*3
 class Patterns
{
public static void main(String [] args)
{
int rows=5;
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(j +" ");
}
System.out.println();
}
}
}
output:
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/

/*4
 class Patterns
{
public static void main(String [] args)
{
int n=5;
int count=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(count +" ");
count++;
}
System.out.println();
}
}
}
output:
1   2    3   4  5
6   7    8   9  10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/

/*5
 class Patterns
{
public static void main(String [] args)
{
int n=1;
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print(n +"  ");
n++;
if(n>9)
{
n=1;
}
}
System.out.println();
}
} 
}
output:
1  2  3  4  5
6  7  8  9  1
2  3  4  5  6
7  8  9  1  2
3  4  5  6  7
*/

/*6
class Patterns
{
public static void main(String [] args)
{
int n=1;
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print(n +"  ");
n+=2;
}
System.out.println();
}
} 
}
output:
1  3  5  7  9
11  13  15  17  19
21  23  25  27  29
31  33  35  37  39
41  43  45  47  49
*/

/*7
class Patterns
{
public static void main(String [] args)
{
int n=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(j%2==1)
{
System.out.print("1");
}
else
{
System.out.print("0");
}
}
System.out.println();
}
}
}
output:
10101
10101
10101
10101
10101
*/

/*8
public class Pattern {
    public static void main(String[] args) 
    {
        String word = "INDIA";
        for (int i = 1; i <=5; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
output:
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
*/
/*
9.class Pattern1
{
public static void main(String []args)
{
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
int num=2;
for(int k=1;k<=i;k++)
{
System.out.print(num+" ");
num+=2;
}
System.out.println();
}
}
}output:
     2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10
*/
/*
10.public class Pattern1 {
    public static void main(String[] args) 
    {
        String word = "INDIA";
        for (int i = 1; i <=5; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
output:
I
I N
I N D
I N D I
I N D I A
*/
/*class Pattern1
{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
 {
 for(int j=1;j<=5-i;j++)
 {
System.out.print(" ");
 }
for(int k=1;k<=(2*i-1);k++)
{
System.out.print("*");
}
 System.out.println();
}
}
}
*/
/*
12.public class Pattern1 {
 public static void main(String[] args) 
 {
 int rows = 4; 
 for (int i = 1; i <= rows; i++) 
 {
for (int j = 1; j <= rows - i; j++) 
{
System.out.print("  ");
}
 for (int k = 1; k <= 2 * i - 1; k++) 
 {
 System.out.print("* ");
  }
System.out.println();
}
for (int i = rows - 1; i >= 1; i--) 
{
for (int j = 1; j <= rows - i; j++) 
 {
System.out.print("  ");
 }
for (int k = 1; k <= 2 * i - 1; k++) {
 System.out.print("* ");
   }
 System.out.println();
 }
 }
}
output:
       *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
*/
/*
14.public class Pattern1
{
  public static void main(String[] args) 
{
 int size = 5; 
 for (int i = 1; i <= size; i++) 
  {
  for (int j = 1; j <= size; j++) 
 {
  if (i == 1 || i == size || j == 1 || j == size) 
 {
  System.out.print("* ");
   } 
else 
{
System.out.print("  "); 
}
}
System.out.println();
}
}
}
output:
* * * * *
*          *
*          *
*          *
* * * * *
*/
/*
15.public class Pattern1 
{
    public static void main(String[] args) 
    {
        int n = 5; 

        int mid = n / 2 + 1; 

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
               
                if (i == mid || j == mid) 
                {
                    System.out.print("* ");
                } else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
output:
    *
    *
* * * * *
    *
    *
*/
/*
16.public class Pattern1 {
    public static void main(String[] args) 
    {
   int n = 5; 
 for (int i = 1; i <= n; i++) 
        {         
            for (int j = 1; j <= n; j++) 
            {      
                
                if (i == j || i + j == n + 1) 
                {
                    System.out.print("* ");
                } else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
output:
*       *
  *   *
    *
  *   *
*       *
*/
/*13. class Pattern1 {
 public static void main(String[] args) {
int n = 5; 
for (int i = 1; i <= n; i++) {
 for (int j = i; j < n; j++)
 System.out.print(" ");
for (int j = 1; j <= (2 * i - 1); j++) {
if (j == 1 || j == (2 * i - 1))
System.out.print("*");
else
 System.out.print(" ");
 }
 System.out.println();
  }
 for (int i = n - 1; i >= 1; i--) {
for (int j = n; j > i; j--)
System.out.print(" ");
for (int j = 1; j <= (2 * i - 1); j++) {
 if (j == 1 || j == (2 * i - 1))
  System.out.print("*");
else
 System.out.print(" ");
}
 System.out.println();
 }
}
}
output:
     *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/
/*
17.class Pattern1 {
 public static void main(String[] args) {
  int size = 7; 
 int mid = size / 2;
for (int i = 0; i < size; i++) {
 for (int j = 0; j < size; j++) {
if (i == 0 || i == size - 1 || j == 0 || j == size - 1)
 System.out.print("*");
else if (i == mid || j == mid)
 System.out.print("*");
else
 System.out.print(" ");
}
 System.out.println();
 }
 }
}
output:
*******
*    *    *
*    *    *
*******
*    *    *
*    *    *
*******
*/
/*
18.class Pattern1 {
 public static void main(String[] args) {
        int n = 7; 

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
               
                if (i == n || j == 1 || j == i)
                    System.out.print(" * ");
                else
                    System.out.print("  ");
            
}
            System.out.println();
        
    }
}
}
output:
*  *  *  *  *  *  *
 *            *
 *         *
 *       *
 *     *
 *   *
 *
*/
/*
19.class Pattern1 {
public static void main(String[] args) {
int n = 6; 
for (int i = 0; i < n; i++) {
 for (int j = 0; j < i; j++) {
System.out.print("*");
 }
 System.out.println(i);
}
}
}
output:
0
*1
**2
***3
****4
*****5
*/
//20.
class Pattern1 {
 public static void main(String[] args) {
        int n = 7; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               
                if (i==1 || j ==1  || j ==i)
                    System.out.print(" * ");
                else
                    System.out.print("  ");
            
}
            System.out.println();
        
    }
}
}
output:
 *  *  *  *  *  *  *
 *  *
 *    *
 *      *
 *        *
 *          *
 *            *
