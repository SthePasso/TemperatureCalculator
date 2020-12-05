import java.util.Scanner;
class Main
{
	public static void main(String arg[])	{
	    double fahrenheit,c;
      Scanner f = new Scanner(System.in);	   	 
	    System.out.println("Enter  Fahrenheit temperature");
      fahrenheit = f.nextDouble();
	    
      //FahrenheittoCelsius fah=new FahrenheittoCelsius( );
	    
      double result = (fahrenheit-32)*5/9;	
	    System.out.println("Celsius temperature is = "+result);		  	  	     
	} 	
}
