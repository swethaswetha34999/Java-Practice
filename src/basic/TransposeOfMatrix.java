package basic;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{1,2,3},{4,5}};
		int max_col=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(max_col < a[i].length)
			{
				max_col=a[i].length;
			}
		}
		
		int b[][]=new int[max_col][a.length];
		
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				b[col][row] = a[row][col];
			}
		}
		
		for(int row=0;row<b.length;row++)
		{
			for(int col=0;col<b[row].length;col++)
			{
				System.out.print(b[row][col]+" ");
			}
			System.out.println("");
		}
		

	}

}
