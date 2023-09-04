class Program {
	public static void main(String args[]) {
		int i = 1;
		int a = 10;
		int b = 5;
		int x = 10;
		int mul = 0;

		while (i <= 10) {
			mul = a * i;
			System.out.print(a + " * " + i++ + " = " + mul);
			mul = b * x;
			System.out.print("\t" + b + " * " + x-- + " =  " + mul);
			System.out.println();

		}

	}
}