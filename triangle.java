import java.util.*;
class triangle //calculating area using semi perimeter formula
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double a,b,c,s,area;
System.out.println("Enter the three sides of the Triangle!");
a = sc.nextDouble();
b = sc.nextDouble();
c = sc.nextDouble();
if((a+b)>=c && (a+c)>=b && (b+c)>=a)
	{
		s = (a+b+c)/2;
		area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		System.out.println("Area of the Triangle is "+area);
	}
else
	System.out.println("The Triangle is not possible!");//because triangle should fulfill some of the conditions aforementinoed.
}
}