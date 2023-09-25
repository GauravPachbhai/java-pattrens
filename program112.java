/*
afjm
bgkn
chl
di
e
		
1	6	10	13	15
2	7	11	14
3	8	12
4	9
5
*/		

class program112

{
	public static void main(String args[]){
		int n=5;
		int count =1;
		for(int i=1; i<=n; i++){
			//space
			for(int j=i; j>1;j--){
				System.out.print(" ");
			}
			//pattern
			int c=count;
			for(int j=n; j>=i;j--){
				System.out.print((char)(c+96));
				c+=j;
			}
			System.out.println();
			count++;
		}

	}
}