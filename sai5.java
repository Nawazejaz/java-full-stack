/*input today d is output2*/
import java.util.Scanner;
class FrequencyChar{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str = sc.nextLine();
char ch=sc.next().charAt(0);
int count=0;
for(int i=0;i<=str.length()-1;i++);{
if(str.charAt(0)=ch){
count++;
}//if
}//for
//sSystem.out.println("Frequency of "+ch" is: "+count);
System.out.println(count);
}
}
