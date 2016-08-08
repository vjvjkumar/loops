package Pack2;
//Declare the array in a single?
public class SinglelineArrayDeclare {
	public static void main(String[] args) {
		//size declaration + values declaration
		int a[]=new int[]{12,2,3,45,67,78};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[4]);
		System.out.println("Array size: "+a.length);
		System.out.println(a[5]);
		
		
		//String array:
		String s[] =new String[]{"Vijay", "UK", "QA Lead"};
		System.out.println("Employee Name: "+s[0]);
		System.out.println("Employee Location: "+s[1]);
		System.out.println("Designation: "+s[2]);
		
		
	}

}
