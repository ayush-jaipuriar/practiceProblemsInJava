import java.io.*;
class staticInstanceConcept
{
static String staticVariable;
String instanceVariable;
static String staticMethod()
{
staticVariable="Static Variable";	 
return "Static Method" ;  }
String instanceMethod()
{ 
this.instanceVariable="Instance Variable";
return "Instance Method"; }
public static void main(String[] args) {
	System.out.println(staticVariable);
	System.out.println(staticInstanceConcept.staticMethod());
	System.out.println(staticVariable);// static variable being a class/global variable had a change reflect on it)
	System.out.println(new staticInstanceConcept().instanceVariable);
	System.out.println(new staticInstanceConcept().instanceMethod());
	System.out.println(new staticInstanceConcept().instanceVariable); //Any changes made to the instanceVariable did not reflect anywhere out of the instanceMethod
	
	
	
	
	
	
	
	
	System.exit(0);
}
}
