class Student5{
int id;
String name;
Student5(int i,String n){
id=i;
name=n;
}
void display(){
System.out.println(id+" "+name);}
public static void main(String args[]){
Student5 s1=new Student5(1111,"adarsh");
Student5 s2=new Student5(999,"Prasad");
s1.display();
s2.display();
}
}