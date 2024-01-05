class Student{
int rollno;
String name;
Static String college="TTS";
Student(int r.String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+""+name+""+college);}
}
public class TestStaticVariable1{
ppublic static void main(String[] args){
Student s1=new Student(121,"adarsh");
Student s2=new Student(143,"prasad");
Sudent.college="S.Nawaz";
s1.display();
s2.display();
}
}