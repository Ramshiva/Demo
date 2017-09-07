package test;

class TextInput {
	
	private String s="";
	
	public void add(char c)
	{
		s += new StringBuffer().append(c);
	}
	
	public String getValue()
	{
		return s;
	}
	
}

class NumericInput extends TextInput{
	
	private String s="";
	
	public void add(char c)
	{		
		if(Character.isDigit(c))
		{
			s += new StringBuffer().append(c);
		}
	}
	
	public String getValue()
	{
		return s;
	}
}

public class UserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		for(StackTraceElement e : ste) {
			 System.out.println("HV92495  @@ "+e.toString());
		}
    }
}