package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

@Before
public void beforetest()
{
	
System.out.println("this is before test");	
	
	
	
}
@After

public void aftertest()

{
	
	System.out.println("this is after test ");
	
	
	
}	
	
	
}
