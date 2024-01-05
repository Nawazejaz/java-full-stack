class Student{
int id;
String name;
}
class TestStudent2{
public static void main(String agrs[]){
Student s1=new Student();
Student s2=new Student();
s1.id=101;
s1.name="NAWAZ";
s2.id=102;
s2.name="Adrash";
 System.out.println(s1.id+""+s1.name);
}
}