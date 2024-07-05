class Student{
int admo;
String name;
Student(int x,String y){
admo=x;
name=y;
}
void show(){
System.out.print(admo+" "+name);
}
}
class constructor1{
public static void main(String[] args){
Student s=new Student(101,"xyx");
s.show();
Student s1=new Student(102,"zzz");
s1.show();
}
}
