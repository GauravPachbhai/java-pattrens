class program11{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=1,cha=65; j<=n; j++,cha++){
				System.out.print((char)cha);
			}
			System.out.println();
		}
	}
}