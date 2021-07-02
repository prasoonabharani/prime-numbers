import java.util.*;
class Primenum
{
public static void main(String ars[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter min num");
int min=sc.nextInt();
System.out.println("Enter max num");
int max=sc.nextInt();
int count=0;
for(int i=min;i<=max;i++)
{ 
int temp=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
temp++;
}}
if(temp==0)
count++;
}
System.out.println("Number of prime no's in a given range is "+count);
}}