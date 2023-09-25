/*
Ee
Id      Di
Lc      Hh      Cl
Nb      Kg      Gk      Bn
Oa      Mf      Jj      Fm      Ao	

5	
9	4
12	8	3
14	11	7	2
15	13	10	6	1

5
4	9	
3	8	12
2	7	11	14
1	6	10	13	15
*/

class program119

{
	public static void main(String args[]){
		int n=5;
		int count1 =n;
		int count2 =n;
		for(int i=n; i>=1; i--){
			
			//pattern
			int c1=count1;
			int c2= count2;
			for(int j1=i,j2=n ;j1<=n|| j2>=i;j1++,j2--){
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96)+"\t");
				c1-=j1+1;
				c2+=j2;
				
			}
			System.out.println();
			count1+=i-1;
			count2--;
		}

	}
}