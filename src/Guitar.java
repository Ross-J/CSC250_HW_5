
public class Guitar 
{
	String guitar_type;
	String string_material;
	int number_of_strings;
	
	public Guitar(String guitar_type, String string_material, int number_of_strings)
	{
		this.guitar_type = guitar_type;
		this.string_material = string_material;
		this.number_of_strings = number_of_strings;
	}
	
	void display()
	{
		System.out.format("Guitar Type: %s \nString Material: %s \nNumber of Strings: %d \n\n", this.guitar_type, this.string_material, this.number_of_strings);
	}

}
