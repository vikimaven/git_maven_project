package git.org.Gitmaven;

public class Gitclass {
	
	public static void stameth()
	{
	System.out.println("static method");	
	}
	
	public void Demo()
	{
		System.out.println("demo default constructor");
		System.out.println("demo parameter constructor");
	}
	
	public void Demo3()
	{
		System.out.println("demo default constructor");
		System.out.println("demo parameter constructor");
	}
public static void main(String[] args) {
	Gitclass obj = new Gitclass();
	obj.Demo();
	obj.Demo3();
}
}
