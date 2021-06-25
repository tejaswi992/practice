package practice;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object to Integer Wrapper class
		Integer i = new Integer(10);
		//autoboxing
		int i1 = i;
		System.out.println("value of i wrapper class="+i);
		System.out.println("value of i1 primitive data= "+i1);
		//autoboxing to wrapper class
		Character ch = 'a';
		//unboxing to primitive type
		char abc = ch;
		System.out.println("value of ch = "+ch);
		System.out.println("value of abc ="+abc);
		int a =10;
		float r = 5.8f;
		System.out.println("float value"+r);
		double d = 56.89007776;
		System.out.println("double value"+d);
		
	}

}
