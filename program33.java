class program33
{
	public static void main(String args[]){
		int n=5;
		for(int i=n; i>=1;i--){
			for(int j=1; j<=i; j++){
				System.out.print((char)(70-i));
			}
			System.out.println();
		}
	}
}