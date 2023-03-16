import java.util.Scanner;
public class Tipos_Triangulos
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce la medida del primer lado: ");
	        double lado1 = sc.nextDouble();
	        System.out.println("Introduce la medida del segundo lado: ");
	        double lado2 = sc.nextDouble();
	        System.out.println("Introduce la medida del tercer lado: ");
	        double lado3 = sc.nextDouble();
	        if (lado1 == lado2 && lado2 == lado3) {
	            System.out.println("El triángulo es equilátero.");
	        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	            System.out.println("El triángulo es isósceles.");
	        } else {
	            System.out.println("El triángulo es escaleno.");
	        }
	     
	}
}



