
interface Resume{
    void biodata();
}
class Teacher implements Resume {
    String Qualification, Name, achievements;
    float experience;

    public void biodata() {
        Name = "Umar Allahu Khan";
        Qualification = "M.tech";
        achievements = "gold MEdal";
        experience = 14.3f;
        System.out.println("Name is" + Name);
        System.out.println("Qualification is" + Qualification);
        System.out.println("Achievements is" + achievements);
        System.out.println("Experience is" + experience);
    }
}
class Student implements Resume{
    String name, Discipline;
    float result;
    public void biodata()
    {
        name = "Abhijat";
        Discipline = "ISE";
        result = 70.3f;
        System.out.println("name is"+name);
        System.out.println("Discipline is"+Discipline);
        System.out.println("Result is"+result);
    }

}
public class InterfaceP
{
    public static void main(String[] args) {
        Teacher obj1 = new Teacher();
        obj1.biodata();

        Student obj2 = new Student();
        obj2.biodata();
    }
}
