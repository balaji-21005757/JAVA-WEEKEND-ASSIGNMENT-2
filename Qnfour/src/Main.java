import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int basevalue,powervalue;
        System.out.println("Enter base value");
        basevalue = sc.nextInt();
        System.out.println("Enter power value");
        powervalue = sc.nextInt();
        int result = power(basevalue,powervalue);
        System.out.println(basevalue +"^"+ powervalue +"="+ result);
    }

    public  static int power(int base,int powerraised)
    {
        if(powerraised !=0)
        {
            return (base*power(base,powerraised-1));
        }
        else {
            return 1;
        }
    }
}