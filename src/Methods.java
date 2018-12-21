import java.util.Scanner;

public class Methods {
	//powersOfTwo examples 
	static void powersOfTwo() {
		int result = 2;
		
		for (int i = 1; i<=10; i++ ) {
			System.out.println(result);
		result = result *2;
		}
	}
	
 public static void main (String[] args) {
	 powersOfTwo();
	 
 Scanner input = new Scanner(System.in);
 System.out.println("How many times would you like to print Alarm?");
 int num = input.nextInt();
 alarm(num);
//print for sum of Range
	System.out.println("Enter first number: ") ;
	int numba= input.nextInt();
	System.out.println("Enter second number: ") ;
	int numbb = input.nextInt();
	int sum = sumOfRange(numba, numbb);
	System.out.println("The sum is " + sum);
 }


//Doing Alarm problem now
 public static void alarm(int numOfTimes) {
		for (int i =1; i<= numOfTimes; i++) {
			System.out.println("Alarm!"); 
		
		}
 }

// Sum of range that accepts two integer parameters
static int sumOfRange(int numba,int numbb) {
	int sum = 0;
	int inc = numba;
	while(inc <= numbb) {
	sum = sum + inc;
	inc++;
	}
	return sum; 	
	}
}

