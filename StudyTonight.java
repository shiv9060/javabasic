public class StudyTonight 
{ 
	public static void main(String[] args)   
	{ 
		String input = "1.4";           
		try 
		{ 
			Integer.parseInt(input); 
			System.out.println(input + " is a valid integer"); 
		}  
		catch (NumberFormatException e)  
		{ 
			System.out.println(input + " is not a valid integer"); 
		} 
	} 
} 