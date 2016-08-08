package Pack2;

public class Arrays {
	public static void main(String[] args) {
		
		//declare int array:
		int a[] =new int[5]; //size declaration
		
		//values declaration
		a[0]=12;
		a[1]=34;
		a[2]=13452;
		a[3]=123;
		a[4]=678;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]+a[3]);
		System.out.println(a[0]+a[4]);
		
		//Strig array:
		String s[]= new String[3]; //size declaration
		s[0]="Govardhan";
		s[1]="Karnati";
		s[2]="QA Lead";
		System.out.println("First Name: "+s[0]);
		System.out.println("Full Name: "+s[0]+" "+s[1]);
		System.out.println("Designation: "+s[2]);
		
	}

}

