package tiida;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		NissanTiida car=new NissanTiida();
		System.out.print("Please enter a number:");
		int num;
		num=keyboard.nextInt();
		for(int n=0;n<num;n++)
			car.bigger();
		keyboard.close();
	}

}
