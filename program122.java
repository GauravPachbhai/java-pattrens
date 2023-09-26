/*
12345
12344
12333
12222
11111
*/
class program122{
	public static void main(String args[]){
		int n=5;
		for (int i=5; i>=1; i--){
			for(int j=1; j<=n; j++){
				if(i>j)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
}