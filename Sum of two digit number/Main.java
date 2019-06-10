import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int first = num/10;
      int second = num%10;
      int add = first+second;
      System.out.println(add);
      
	}
}