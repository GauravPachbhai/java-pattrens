/*
oE	nI	lL	iN	eO
	mD	kH	hK	dM
		jC	gG	cJ
			fB	bF
				aA	

15	14	12	9	5			
	13	11	8	4	
		10	7	3
			6	2
				1
	
5	9	12	14	15
	4	8	11	13
		3	7	10
			2	6
				1
*/

class program120

{
	public static void main(String args[]){
		int n=5;
		int count1 =(n*(n+1))/2;
		int count2 =n;
		for(int i=1; i<=n; i++){
			
			//pattern
			int c1=count1;
			int c2= count2;
			for(int j1=i,j2=n ;j1<=n|| j2>=i;j1++,j2--){
				System.out.print((char)(c1+96));
				System.out.print((char)(c2+64)+"\t");
				c1-=j1;
				c2+=j2-1;
				
			}
			System.out.println();
			count1-=i+1;
			count2--;
		}

	}
}