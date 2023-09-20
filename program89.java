/*
				1
			3	2
		6	5	4
	10	9	8	7
11	12	13	14	15				
*/

class program89
{
	public static void main(String args[]){
		int n=5;
		int count =1;
		for(int i=1; i<=n; i++){
			for(int j=i; j<n; j++){
				System.out.print("\t");
			}

			int c=count;
			for(int j=i; j>=1;j--){
				System.out.print(c+"\t");
				c--;
			}
			count +=i+1;
			
			
			System.out.println();
		}

	}
}