class program10{
	public static void main(String args[]){
		int n=5;
		int cha =101;
		for(int i=n; i>=1; i--, cha--){
			for(int j=1; j<=n; j++){
				System.out.print((char)cha);
			}
			System.out.println();
		}
	}
}