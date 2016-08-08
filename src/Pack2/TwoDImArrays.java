package Pack2;

public class TwoDImArrays {
	public static void main(String[] args) {
		//int two dim array:
		
//Syntax: int a[][] =new int[rows][cols];
   		  int a[][] =new int[3][3]; //size declaration
		
		//values declaration
		//row 1 declaration
		a[0][0] =12;
		a[0][1] =23;
		a[0][2]= 445;
		
		//row 2 declaration
		a[1][0] =34;
		a[1][1] =567;
		a[1][2]= 89;
		
		//row 3 declaration
		a[2][0] =55;
		a[2][1] =50;
		a[2][2]= 37;
		
		System.out.println(a[0][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][0]+a[2][2]);
		
	}

}
