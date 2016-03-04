package factorial;
import java.util.*;


public class RecursiveFact {

	public static int factMethod(int num){
		if (num == 0){
			return 1;
		}
		else{
			return num*factMethod(num-1);
		}	
	}
	
	public static void main(String[] args){
		int num=0;
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Enter the number to be checked : ");
		try{
			num = inputScan.nextInt();
			if (num < 0 ){
				System.out.print("Input need to be positive");
				inputScan.close();
				return;
			}
		}
		catch (InputMismatchException e){
			System.out.print("Number must be an integer");
			inputScan.close();
			return;
		}
		finally{
			inputScan.close();
		}
		
		System.out.print(factMethod(num));

	}
}
