/*
1	2	3	4	5
	6	7	8	9
		10	11	12
			13	14
				15								
*/

class program99
{
	public static void main(String args[]){
		int n=5;
		int count =1;
		for(int i=n; i>=1; i--){
			//space
			for(int j=n; j>i;j--){
				System.out.print("\t");
			}
			//pattern
			for(int j=i; j>=1;j--){
				System.out.print(count+"\t");
				count++;
			}
			
			
			System.out.println();
		}

	}
}