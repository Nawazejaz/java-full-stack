import java.util.*;
class Program201{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n = sc.nextInt();
if(n%2==0)
{
System.out.print("Even\n");
System.out.print(n+ "Even\n");
}
else
{
System.out.print("Odd\n");
System.out.print(n+"Odd\n");
}
}
}