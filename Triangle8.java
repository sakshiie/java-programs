class Triangle8
{
	public static void main(String[] args) 
	{
		int n=5;

		for(int j=0; j<n; j++){

			for(int i=1; i<=j; i++){
				if((i+j)%2==0)
               System.out.print(1+" ");
				else
					System.out.print("0 ");
			
		}
		
		System.out.println();
	}
	}
}
