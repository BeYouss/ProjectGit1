import java.util.Scanner;
public class TestDriveBig3 {

	public static void main(String[] args) {
		Big3 myNumbers = new Big3();
		Scanner input = new Scanner(System.in);
		//program will exit when continu=-1
		int continu=0;
		//loop and ask the user for a new number
		do{
			System.out.println("Entrez un entier:");
			continu=input.nextInt();
			//call test method of my class to compare the number
			myNumbers.testBig3(continu);
			//print
			System.out.println(myNumbers);
		}while(continu!=-1);
		
		input.close();
	}

}
