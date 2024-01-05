%check whether it is char is not%

import java.util.Scanner;
class Test{

public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);

if((c>='a' && c<='Z')||(c>='a' && c<='z'))System.out.println("YES");
else System.out.println("ON");
}}