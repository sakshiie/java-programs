class HollowTriangle3 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int j=0; j<n; j++){
		for(int i=0; i<=j; i++){
			if(i==1)
		System.out.print("* ");
			else
				System.out.print(" ");
		
		}
		System.out.println();
		}
		for(int j=0; j<n; j++){
		for(int i=0; i<=n-j; i++){
			System.out.print("* ");
		}
		System.out.println();
		}
		
	}
}
