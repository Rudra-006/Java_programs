import java.util.*;
class swap
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any Two numbers.");
int a = sc.nextInt();
int b = sc.nextInt();
int t;
t = a;
a = b;
b = t;
System.out.println("Number after swapping :");
System.out.println("A = "+a+" "+"B = "+b);
}
}