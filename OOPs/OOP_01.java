/**
 * The class OOP_01 contains a nested class Student with attributes name and age, along with a display
 * method to print the student's details.
 */
public class OOP_01

{
    static class Student{
        String name;
        int age;

        public void display(){
            System.out.println("the name :"+name);
            System.out.println("the age :"+age);
        
        }
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Prakant sharma";
        s1.age=20;
        s1.display();

        
    }
}