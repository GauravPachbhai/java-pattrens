/*
				Ao
			Bj	Fn
		Cf	Gi	Jm
	Dc	He	Kh	Ml
Ea	Ib	Ld	Ng	Ok

				1
			2	6
		3	7	10
	4	8	11	13
5	9	12	14	15

				15
			10	14
		6	9	13
	3	5	8	12
1	2	4	7	11
*/		

class program117

{
	public static void main(String args[]){
		int n=5;
		int count1 =1;
		int count2 =(n*(n+1))/2;
		for(int i=n; i>=1; i--){
			//space
			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			//pattern
			int c1=count1;
			int c2= count2;
			for(int j1=n, j2=i; j1>=i || j2<=n ;j1--,j2++){
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96)+"\t");
				c1+=j1-1;
				c2+=j2;
				
			}
			System.out.println();
			count1++;
			count2-=i;
		}

	}
}