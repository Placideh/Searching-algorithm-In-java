import java.util.Scanner;
public class BinarySearch{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int []arr={1,2,4,12,22,25};
		System.out.println("Please Enter a Number:");
		int num=scan.nextInt();
		int value=binary(num,0,arr.length-1,arr);
		if (value>0) {
			System.out.println("the Num is Found At index:"+value);
			
		}else{
			System.out.println("Not Found!:)");
		}


	}
	public static int binary(int num,int min,int max,int[]arr){
		int mid=(min+max)/2;
		
			
			if (num==arr[mid]) {
				return mid; 
				
			}
			else if (num<arr[mid]) {

				return binary(num,min,mid,arr);
				
			}
			else if(num>arr[mid]){
				return binary(num,mid,max,arr);

			}
			else{
				return -1;
			}
		
		/*so this is the binary search and the difference between this and the linear is that this uses
		OlogN time complecity but they have to be sorted.*/	
		
	}
}