class Student {
    String name;
    int id;
    
    // Default constructor
    Student() {
        name = "Unknown";
        id = 0;
    }
    
    // Parameterized constructor
    Student(String n, int i) {
        name = n;
        id = i;
    }
    public void printStud(){
        System.out.println(id + ": " + name);
    }
}
public class cons{
    public static void main(String args[])
    {
        Student stud = new Student("Farid",2);
        stud.printStud();
    }
}