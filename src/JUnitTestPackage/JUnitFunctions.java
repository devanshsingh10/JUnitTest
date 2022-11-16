package JUnitTestPackage;
import java.util.*;

class num{
    int add_num(int a,int b){
        return a + b;
    }

    String add_str(String c, String d){
        return c + d;
    }
}

public class JUnitFunctions {
	public static void main(String args[])   
	{  
		Scanner sc = new Scanner(System.in);
        num obj = new num();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(obj.add_num(a,b));
        String first = sc.next();
        String second = sc.next();
        System.out.println(obj.add_str(first,second));
	}  

}

