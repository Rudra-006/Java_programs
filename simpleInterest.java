import java.util.*;
class simpleInterest
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double p,r,t,si;
System.out.println("Enter Principal amount, rate, time respectively.");
p = sc.nextDouble();
r = sc.nextDouble();
t = sc.nextDouble();
si = (p*r*t)/100;
System.out.println("Simple Interest is "+si);
}
}

