import java.util.Scanner;
public class año_bisiesto
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

	      System.out.print("Ingrese un año: ");
	      int año = input.nextInt();

	      if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
	         System.out.println(año + " es un año bisiesto.");
	      } else {
	         System.out.println(año + " no es un año bisiesto.");
	      }
	   }
	}