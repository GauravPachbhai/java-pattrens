class program9{
	public static void main(String args[]){
		int n=5;
		int cha = 65;
		for(int i=1; i<=n; i++,cha++){
			for(int j=1; j<=n; j++){
				System.out.print((char)cha);
			}
			System.out.println();
		}
	}
}