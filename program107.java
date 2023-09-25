/*
11	7	4	2	1	
	12	8	5	3
		13	9	6
			14	10
				15								
*/

class program107

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
				c-=j-1;
			}
			System.out.println();
			count++;
		}

	}
}