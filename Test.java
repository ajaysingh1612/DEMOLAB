
package corejavaassignment;
import java.lang.*;
public class Q1 {

	public static void main(String[] args) {
	
	        String ex="Ajay"; 
	        ex = null; 
	        System.gc(); 
	        System.out.println("Error is resolved");
	    }
	    
	    @Override
	    protected void finalize()
	    {
	        System.out.println("Inside finalize method");
	        System.out.println("Performing clean-up before destroying the object.");
	        System.out.println("Release and close connections.");
	    }
} 
