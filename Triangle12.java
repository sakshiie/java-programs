class Triangle12
{
	public static void main(String[] args) 
	{
		int n=5;
        int num=1;
		char ch='a';

		for(int j=0; j<n; j++){

			for(int i=1; i<=j; i++){
             if(j%2!=0)
				 {
				 System.out.print(num+" ");
				 num++;
               }

			   else{
				   System.out.print(ch+" ");
				   ch++;
			    
		}
		}
		System.out.println();
	}
	}
}
