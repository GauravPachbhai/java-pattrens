class program15{
	public static void main (String args[]){
		int n=5;
		for(int i=1,x=n; i<=n; i++, x--){
			for(int j=i; j>=1;j--){
				System.out.print(x);
			}
			System.out.println();
		}
	}
}