import java.util.Scanner;

public class ArrayDemoA1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayClassA1 obj;
		int a[],size;
		char ans;
		
		do {
		
			System.out.println("****** REVERSAL OF AN ARRAY ******");
			System.out.print("Enter the size of the Array(>0): ");
			size=s.nextInt();
			
			if(size<=0)
				System.out.println("Size of an Array can't be less than 1. Please Retry.");
			else {
				
				a=new int[size];
				for (int i=0; i<size; i++) {
					
					System.out.print("\tEnter Value a["+i+"]: ");
					a[i]=s.nextInt();
				}
				
				obj = new ArrayClassA1(a, size);
				
				System.out.print("Original Array: ");
				obj.displayArray();
				
				obj.reverseArr();
				System.out.print("\nReversed Array: ");
				obj.displayArray();			
				
			}
			
			System.out.print("\nDo you wish to retry? ");
			ans=s.next().toLowerCase().charAt(0);
			
		} while (ans=='y');
		s.close();
	}

}
