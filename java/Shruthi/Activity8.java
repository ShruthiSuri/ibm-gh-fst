package ibm;

class  CustomException extends Exception {
	private String message=null;
	
	public CustomException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
	    return message;
	}
	
}
public class Activity8 
{
	public static String exceptionTest(String message) throws CustomException {
		if (message==null)
			throw new CustomException("Please enter the Value");
		return message;
		}

	public static void main(String[] args) {	
		 try {
			  System.out.println(exceptionTest("Shruthi"));
	          
	            System.out.println("========================");
	            System.err.println(exceptionTest(null));
	        } catch (CustomException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
		
		}
}
