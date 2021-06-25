package practice;

public class ControlFlowStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		while(counter < 5) {
			if(counter==3)
			{
				System.out.println("Breaking the for loop.");
				break;
			}
		    System.out.println("Inside the while loop, counting: " + counter);
		    counter++;
		}

	}

}
