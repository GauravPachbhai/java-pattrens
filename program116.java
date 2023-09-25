/*
Oa	Nb	Ld	Ig	Ek
Mc	Ke	Hh	Dl
Jf	Gi	Cm
Fj	Bn
Ao

15 1	14 2	12 4	9 7	5 11
13 3	11 5	8 8	4 12
10 6	7 9	31 13
6 10	2 14
1 14
*/		

class program116

{
	public static void main(String args[]){
		int n=5;
		int count =(n*(n+1))/2;
		int count2 =1;
		for(int i=1; i<=n; i++){
			//pattern
			int c=count;
			int c2= count2;
			for(int j=i; j<=n;j++){
				System.out.print((char)(c+64));
				System.out.print((char)(c2+96)+"\t");
				c-=j;
				c2+=j;
			}
			System.out.println();
			count-=i+1;
			count2 += i+1;
		}

	}
}