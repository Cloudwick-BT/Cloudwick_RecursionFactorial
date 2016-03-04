package factorial;
import java.util.*;


public class RecursiveFact {

	public static long factMethod(int num){
		if (num == 0){
			return 1;
		}
		else{
			return num*factMethod(num-1);
		}	
	}
	
	public static void main(String[] args){
		int num=20;
		
		for(int i = 1 ; i<=num ; i++){
			System.out.print(factMethod(i));
			if(i<20){
				System.out.print(", ");
			}
		}

	}
}
