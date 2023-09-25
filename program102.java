/*
11	12	13	14	15
	7	8	9	10
		4	5	6
			2	3
				1								
*/

class program102
{
	public static void main(String args[]){
		int n=5;
		int count =(n*(n+1))/2-(n-1);
		for(int i=n; i>=1; i--){
			//space
			for(int j=i; j<n;j++){
				System.out.print("\t");
			}
			//pattern
			int c=count;
			for(int j=i; j>=1;j--){
				System.out.print(c+"\t");
				c++;
			}
			System.out.println();
			count-=i-1;
		}

	}
}