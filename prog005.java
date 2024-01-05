class Student{
private int id;
public void setId(int id){this.id=id;}
public int getId(){return id;}
private String name;
public void setName(String name){this.name=name;}
public String getName(){return name;}
}
class BCA{
public static void main(String args[]){
Student nawaz=new Student();
nawaz.setId(27704);
nawaz.setName("alan walker");
System.out.println("id:"+nawaz.getId());
System.out.println("name:"+nawaz.getName());
}
}