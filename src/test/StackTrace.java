package test;

public class StackTrace {
	
	public static void main(String[] args) {
		
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		for(StackTraceElement e : ste) {
			 System.out.println("HV92495  @@ "+e.toString());
		}
		
	}
	
	

}
