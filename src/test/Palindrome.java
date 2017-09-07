package test;


	public class Palindrome {
	    public static boolean isPalindrome(String word) {
	    	
	        throw new UnsupportedOperationException("Waiting to be implemented.");
	    }
	    
	    public static void main(String[] args) {
	    	StackTraceElement[] ste = Thread.currentThread().getStackTrace();
			for(StackTraceElement e : ste) {
				 System.out.println("HV92495  @@ "+e.toString());
			}
	    	
	        System.out.println(Palindrome.isPalindrome("Deleveled"));
	    }
	}



