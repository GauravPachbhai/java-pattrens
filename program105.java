/*
5	9	12	14	15
	4	8	11	13
		3	7	10
			2	6
				1								
*/

class program105
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
				c+=j;
			}
			System.out.println();
			count++;
		}

	}
}