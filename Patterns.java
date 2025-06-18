//*1.
//public Pattern1
public class Patterns
{
public static void main(String[]args)
{
System.out.println("*");
}
}*/


//*2.
//public Pattern1
public class Patterns
{
public static void main(String[]args)
{
for(int i=0;i<5;i++)
{
System.out.println("*");
}
}
}


/*3.
//public Pattern1
public class Patterns
{
public static void main(String[]args)
{
for(int i=0;i<5;i++)
{
System.out.print("*");
}
}
}

/*3.
//public Pattern1
public class Patterns
{
public static void main(String[]args)
{
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print("*");
}
System.out.println("");
}
}
}*/

/*square number patterns
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5*/
public class Patterns
{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(i);
}
System.out.println("");
}
}
}
//*4.
//public Pattern1

1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5*/
public class Patterns
{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(j);
}
System.out.println("");
}
}
}*/

/*5.
//public Pattern1
1       2       3       4       5
6       7       8       9       10
11      12      13      14      15
16      17      18      19      20
21      22      23      24      25*/
public class Patterns
{
    public static void main(String[]args)
    {
        int rows=5;
        int col=5;
        int number=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print(number+"\t");
                number++;
            }
            System.out.println();
        }
    }
}*//6
/* square patterns with 1 to 9 numbers
1       2       3       4       5 
6       7       8       9       1 
2       3       4       5       6 
7       8       9       1       2 
3       4       5       6       7*/
public class Patterns
{
    public static void main(String[]args)
    {
        int rows=5;
        int col=5;
        int number=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print(number+"\t");
                number++;
                if(number>9)
                {
                    number=1;
                }
            }
            System.out.println();

        }
    }
}

/*7
//public Pattern1
1       3       5       7       9
11      13      15      17      19
21      23      25      27      29
31      33      35      37      39
41      43      45      47      49*/
public class Patterns
{
    public static void main(String[]args)
    {
        int rows=5;
        int col=5;
        int number=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print(number+"\t");
                number+=2;
            }
            System.out.println();

        }
    }
}*/

//*8
//public Pattern1
0 1 0 1
0 1 0 1
0 1 0 1
0 1 0 1
0 1 0 1*/
public class Patterns
{
    public static void main(String[]args)
    {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=3;j++)
            {
                System.out.print(j%2 +"\t");
            }
            System.out.println("");
        }
    }
}*/


/*
    *
   ***
  *****
 *******
*********
/*9
//public Pattern1

class Patterns1
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


/*
     2 
   2 4 
  2 4 6 
 2 4 6 8 
2 4 6 8 10

*/
//*10.
//public Pattern1
class Patterns1
{
    public static void main(String[]args)
    {
    
    
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k*2+" ");
                
            }
            System.out.println();
        }
    }
}


/*
     
