public class Sum {

    public int sum (int x, int y)
    {
        return(x+y);
    }

    public int sum(int x, int y, int z)
    {
        return(x+y+z);
    }
    public double sum(double x, double y)
    {
        return (x+y);
    }

    // Writing the driver code from here on now

    public static void main(String[] arg)
    {
        Sum s= new Sum();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(10.5, 20.5));

    }
}

/* class Student{
int id;
String name;

student()
{
sout("This is a default construtto")
}

student(int i, string nm)
{
id = i;
name=nm;
}

public static void main(String [] arg)
{
Student s[] = new Student;
sout("Default constructor);
sout("student name"+s.name+"Student id:"+s.id);

sout("Parametrized Value:")
Stduent stduent = new Student("david",10)
sout("Student id="+ s.id+ "student name:"+s.name);



 */
