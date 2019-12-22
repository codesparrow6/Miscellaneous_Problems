
public class NonPolynomialProblems {

	//Find the combination in a given set whose sum is half of total sum.......................................................
	/*LOGIC - Generate the binary sequence based on the number of elements on a set.
	 * For example ,If we have 5 elements then generate 2^5 binary sequences starts from 00000 to 11111.
	 * Take each sequence ,multiply the respective bit with element in the set at that position, then find the sum 
	 * if it is equal then stop processing and return the subset/combination of numbers .
	 */
	
	
	boolean binSeq(int[] a,int n,int[] k) {
		
		if(n<=0) {
			int sum=0;
			int totalSum = 0;
			for(int i=0;i<a.length;i++) {
				sum = sum +(a[i]*k[i]);
				totalSum =totalSum+k[i];
			}
			if(sum == totalSum/2) {
				System.out.print("The Subset is :");
				for(int i=0;i<a.length;i++) {
					System.out.print((a[i]*k[i])+",");
				}
				return true;
			}
						
		}
		else {
			a[n-1]=0;
			boolean first = binSeq(a,n-1,k);
			if(first)
				return first;
			
			a[n-1]=1;
			boolean last =binSeq(a,n-1,k);
			return last;
		}
		return false;
	}
	
	
	
}
