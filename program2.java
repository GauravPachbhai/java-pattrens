class program2{
	public static void main(String args[]){
		int a=10;
		int b =5;
		int mul = 0;
		for (int i=1,x=10; i<=10;i++,x--){
			mul= a*i;
			System.out.print(a+ " * "+ i+" = "+mul);
			mul= b*x;
			System.out.print("\t"+b+ " * "+ x+" = "+mul);
			System.out.println();
		}
	}
}