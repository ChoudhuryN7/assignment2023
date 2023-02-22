//matrixrotat2

class Matrix2
{
		public static void main(String args[])
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Original Matrix:");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("Matrix after anti-clokwise rotation of 90 degree");
		
		int temp=a[0][0];
		a[0][0]=a[0][1];
		a[0][1]=a[0][2];
		a[0][2]=a[1][2];
		a[1][2]=a[2][2];
		a[2][2]=a[2][1];
		a[2][1]=a[2][0];
		a[2][0]=a[1][0];
		a[1][0]=temp;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}
}