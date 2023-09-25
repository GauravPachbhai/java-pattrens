/*
5	4	3	2	1
	9	8	7	6
		12	11	10
			14	13
				15								
*/

class program101
{
	public static void main(String args[]){
		int n=5;
		int count =n;
		for(int i=n; i>=1; i--){
			//space
			for(int j=i; j<n;j++){
				System.out.print("\t");
			}
			//pattern
			int c=count;
			for(int j=i; j>=1;j--){
				System.out.print(c+"\t");
				c--;
			}
			System.out.println();
			count+=i-1;
		}

	}
}