
public class ArrayClassA1 {

	private int a[];
	private int size;
	
	public ArrayClassA1(int x[], int y) {
		size=y;
		a=new int[size];
		for(int i=0; i<size; i++)
			a[i]=x[i];
	}
	
	public void displayArray() {
		for(int i: a) 
			System.out.print(i+"    ");
	}
	
	public void reverseArr() {
		for (int i=0; i<a.length/2; i++) {
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
			
	}
	
	
}
