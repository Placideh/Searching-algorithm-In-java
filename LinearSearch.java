import java.util.Scanner;
public class LinearSearch{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your Number:");
		int num=scan.nextInt();
		int[]arr={3,4,6,20,12};
		int result=myArr(num,arr);
		if (result>0) {
			System.out.println("The Number:"+num+" Existed At Index:"+result);
			
		}else{
			System.out.println("The Number:"+num+" Not Found:)");
		}
	}
	public static int myArr(int num,int[]arr){
		for (int i=0;i<arr.length ;i++ ) {
			
		if (num==arr[i]) {

		return i;				
		}
		}
		return -1;
	}
}