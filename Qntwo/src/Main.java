public class Main {
    public static void main(String[] args)
    {
        Employee emp1=new Employee();
        Manager m2=new Manager();
        emp1.name="Bala";
        emp1.age = 18;
        emp1.address = "chennai";
        emp1.phone_number = "6369755186";

        emp1.spec="DATA ANALYST";
        m2.department="cse";

        m2.name="Som";
        m2.age = 18;
        m2.address = "chennai";
        m2.phone_number = "9395928943";

        m2.department="ai-ds";
        emp1.spec="data scientist";

        System.out.println(emp1.name+"\n"+emp1.age+"\n"+emp1.phone_number+"\n"+emp1.address+"\n"+emp1.spec+"\n"+m2.department);
        emp1.salary(500000);
        System.out.println(m2.name+"\n"+m2.age+"\n"+m2.phone_number+"\n"+m2.address+"\n"+emp1.spec+"\n"+m2.department);
        m2.salary(700000);

    }
}