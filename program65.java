/*
1
3	2
6	5	4
10	9	8	7
15	14	13	12	11
*/

class program65
{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++){
			int count = (i*(i+1))/2;
			for(int j=i; j>=1;j--){
				System.out.print(count+"\t");
				count--;
			}
			System.out.println();
		}
	}
}