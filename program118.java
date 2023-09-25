/*
Ea	Db	Cd	Bg	Ak
	Ic	He	Gh	Fl
		Lf	Ki	Jm
			Nj	Mn
				Oo				

5	4	3	2	1
	9	8	7	6
		12	11	10
			14	13
				15

1	2	4	7	11
	3	5	8	12
		6	9	13
			10	14
				15
*/

class program118

{
	public static void main(String args[]){
		int n=5;
		int count1 =n;
		int count2 =1;
		for(int i=n,i2=1; i>=1 || i2<=n; i--,i2++){
			//space
			for(int j=i; j<n;j++){
				System.out.print("\t");
			}
			//pattern
			int c1=count1;
			int c2= count2;
			for(int j1=i,j2=i2; j1>=1||j2<=n;j1--,j2++){
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96)+"\t");
				c1--;
				c2+=j2;
				
			}
			System.out.println();
			count1+=i-1;
			count2 +=i2+1;
		}

	}
}