import java.util.Scanner;
public class apples {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double num2;
		
		System.out.println("Type a number to square root: ");
		num2 = input.nextInt();
		input.nextLine();
		
		sqrt sqrtObject = new sqrt(num2);
		sqrtObject.sqrtMethod();
	
		int grade;
		int total = 0;
		double average;
		int counter = 0;
		
		System.out.println("Now I will take 10 exam grades that you enter and find the average: ");
		
		while (counter < 10){
			grade = input.nextInt();
			
			total = grade + total;
			counter++;
			System.out.println(counter);
		}
		
		average = (double)total/10;
		
		System.out.println("The total is " + total + ". The average grade is " + average);
		input.close();
	}
}
