class program19{
	public static void main(String args[]){
		int n=5;
		for(int i=n; i>=1; i++){
			for(int j=1,x=i; j<=i;j++,x--){
				System.out.print(x);
			}
			System.out.println();
		}
	}
}