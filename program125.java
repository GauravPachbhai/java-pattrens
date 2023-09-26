/*
55555
54444
54333
54322
54321
*/
class program125{
	public static void main(String args[]){
		int n=5;
		for (int i=5; i>=1; i--){
			for(int j=5; j>=1; j--){
				if(i<j)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
}