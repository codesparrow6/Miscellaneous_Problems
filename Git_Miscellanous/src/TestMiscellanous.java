
public class TestMiscellanous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,3,4,8,10};
		int[] b = {1,3,4,8,10};
		NonPolynomialProblems np = new NonPolynomialProblems();
		boolean match = np.binSeq(a, a.length, b);
		System.out.println();
		System.out.println("Is the subset Match ="+match);  
		
	}

}
