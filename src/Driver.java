
public class Driver 
{
	public static void main(String[] args)
	{
		Guitar guitar1 = new Guitar("Acoustic Guitar", "Steel", 6);
		Guitar guitar2 = new Guitar("Electric Guitar", "Steel", 6);
		Guitar guitar3 = new Guitar("Classical Acoustic Guitar", "Nylon", 6);
		Guitar guitar4 = new Guitar("12-stringed Guitar", "Steel", 12);
		Guitar guitar5 = new Guitar("Bass Guitar", "Steel", 4);
		Guitar guitar6 = new Guitar("Electric Bass Guitar", "Steel", 4);
		
		guitar1.display();
		guitar2.display();
		guitar3.display();
		guitar4.display();
		guitar5.display();
		guitar6.display();
	}
}
