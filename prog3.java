class Student{
private int id;
public void setId(int id){this.id=id;}
public int getId(){return id;}
}
class BCS{
public static void main(String args[]){

Student nawaz=new Student();
nawaz.setId(27704);
System.out.println("id:"+nawaz.getId());
}
}