import java.util.Scanner;

/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class ArrayProject2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		double[] userNum = new double [10];
		int count = 0;
		double searchValue;
		
		System.out.println("Please enter 10 integer values: ");
		
		for(int i = 0; i < userNum.length; i++){
			System.out.print("Please enter a number: ");
			userNum[i] = userInput.nextDouble();
		}
		
		System.out.print("What value do you want to search: ");
		searchValue = userInput.nextDouble();
		
		
		for(int i = 0; i < userNum.length; i++){
			
			if(userNum[i] == searchValue){
				count ++;
			}
		}
		
		
		System.out.println(searchValue + " Was printed " + count + " times. ");
		
		userInput.close();
	}

}
