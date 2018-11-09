package _02_More_Algorithms;


public class CodingCheck {

	public static void main(String[] args) {
		
		CodingCheck check = new CodingCheck();
		
		double[] test1 = {0.3, 5.1, 1.5, 3.1, 2.2, 1.1};
		
		int[] test2 = {1, 4, 6, 9, 10, 30};
		//System.out.println(dobs(test1));
		check.dobs(test1);
		check.in(test2, 3);
		check.in(test2, 6);
		
	}
	
	public double[] dobs(double[] dob) {
		for (int i = 0; i < dob.length; i++) {
			for (int j = 0; j < dob.length-1; j++) {
				double save1 = dob[j];
				double save2 = dob[j+1];
				
				if(save2< save1) {
					dob[j] = save2;
					dob[j+1] = save1;
				}
				
				
				
			}
		}
		
		for (int i = 0; i < dob.length; i++) {
			System.out.println(dob[i]);
		}
		return dob;
		
		
		
		
	}
	
	
	public boolean in(int[] ints, int c) {
		
		for (int i = 0; i < ints.length; i++) {
			if(ints[i] == c) {
				
				System.out.println("true");
				return true;
			}
		}
		
		System.out.println("False");
		return false;
		
	}
	
}
