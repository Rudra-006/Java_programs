import java.util.*;
class kilometer
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter distance in centimeters.");
double m = sc.nextInt();
System.out.println("Distance in Kilometers is "+(m/(100*1000)));
}
}