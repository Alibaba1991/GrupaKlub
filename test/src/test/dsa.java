package test;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dsa {

	private String name = "";
	
	public dsa(String name)
	{
		this.name = name;
	}
	
	public static dsa FromName(String name)
	{
		return new dsa(name);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));  
		
		Map<Integer, String> elo = new HashMap<Integer, String>(); 
		
		String s = bR.readLine();
		String s1 = "Kuba";
		double t = 25.996;
		
		System.out.println((int)t);
		
		System.out.println( 1 > 5 ? "te" : "test1" );
		
		
		System.out.println(s.equals(s1) ? "test" + '\n' + s.hashCode() : "dupa");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your nationality: ");
		String nationality = scanner.nextLine();
		 
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();*/
		
		boolean tricky = (5 <= 5) == true;
		System.out.println(tricky);
		
		dsa test = dsa.FromName("Elo");
		dsa test1 = dsa.FromName("Elo1");
		System.out.println(test.name + " " + test1.name + " benc!");
	}

}
