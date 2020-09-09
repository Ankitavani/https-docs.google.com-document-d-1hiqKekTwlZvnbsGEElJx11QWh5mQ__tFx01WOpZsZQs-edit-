
public class SwapProgramm {

	public static void main(String[] args) {
		
		String s1="java";
		String s2="python"; 
		
	   String input=s1+s2;
	   try 
	   {
	   s2=input.substring(0,(input.length()-s2.length()));
	   
	   }
	   catch(Exception e)
	   {
		 System.out.println("Exception at line 10"+ e.getMessage());  
	   }
	   s1=input.substring(s2.length());
	  
	   System.out.println(s1 +"  "+s2 );
	   
	   
	}

}
