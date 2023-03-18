public class Main
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        System.out.println("Name\t\tyear of joining\t\t\tAddress\t\t\tSalary");
        e1.emp_det("Robert",1994," 64C- WallsStreat",50000);
        e2.emp_det("Sam  "   ,2000," 68D- WallsStreat",50000);
        e2.emp_det("John"  ,1999," 26B- WallsStreat",50000);
    }
}