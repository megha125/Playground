import java.util.Scanner;
class Main{
	
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = greatest_of_2_numbers(n1, n2);// Function call
	    System.out.print(greatest_of_2_numbers(n1, n2));// Function call
	}
	// Function to find the gcd of 2 numbers
	public static int greatest_of_2_numbers(int num1, int num2)
	{
	    int max_element;
	    if(num1 > num2)
	    {
	        max_element = num1;
	    }
	    else{
	        max_element = num2;
	    }
      return max_element;
    }
}
	    