package in.ashokit;

import in.ashokit.beans.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator c = new Calculator();
		Integer res = c.add(30,20);	
		System.out.println(res);
    }
}
