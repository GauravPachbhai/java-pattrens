/*
OJFCA
NIEB
MHD
LG
K

15	10	6	3	1
14	9	5	2
13	8	4
12	7
11
*/		

class program115

{
	public static void main(String args[]){
		int n=5;
		int count =(n*(n+1))/2;
		for(int i=1; i<=n; i++){
			//pattern
			int c=count;
			for(int j=n; j>=i;j--){
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();
			count--;
		}

	}
}