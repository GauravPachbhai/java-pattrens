/*
5	4	3	2	1
9	8	7	6
12 	11	10
14	13
15	
	
*/

class program77
{
	public static void main(String args[]){
		int n=5;
		int count =n;
		for(int i=n; i>=1; i--){
			int c=count;
			for(int j=i; j>=1;j--){
				System.out.print(c+"\t");
				c--;
			}
			count+=i-1;
			
			System.out.println();
		}

	}
}