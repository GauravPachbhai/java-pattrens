/*
15	13	10	6	1
	14	11	7	2
		12	8	3
			9	4
				5					
*/

class program110

{
	public static void main(String args[]){
		int n=5;
		int count =(n*(n+1))/2;
		for(int i=1; i<=n; i++){
			//space
			for(int j=i; j>1;j--){
				System.out.print("\t");
			}
			//pattern
			int c=count;
			for(int j=i; j<=n;j++){
				System.out.print(c+"\t");
				c-=j+1;
			}
			System.out.println();
			count-=i;
		}

	}
}