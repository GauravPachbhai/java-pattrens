/*
55555
44445
33345
22345
12345
*/
class program127{
	public static void main(String args[]){
		int n=5;
		for (int i=5; i>=1; i--){
			for(int j=1; j<=n; j++){
				if(i<j)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
}