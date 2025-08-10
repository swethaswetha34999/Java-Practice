package basic;

public class SpiralOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Original matric : ");
		
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(a[row][col]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Spiral order : ");
		
		// create 4 boundaries
		
		int top=0;
		int left=0;
		int right=a[0].length-1;
		int bottom=a.length-1;
		
		
		
		while(top<=bottom && left<=right)
		{
			//top left to top right
			for(int col=left;col<=right;col++)
			{
				System.out.print(a[top][col]+" ");
			}
			top++;
			
			//top right to bottom right
			for(int row=top;row<=bottom;row++)
			{
				System.out.print(a[row][right]+" ");
			}
			right--;
			
			//right to left
			if(top<=bottom)
			{
				for(int col=right; col>=left;col--)
				{
					System.out.print(a[bottom][col]+" ");
				}
				bottom--;
			}
			
			
			if(left<=right)
			{
				for(int row=bottom;row>=top;row--)
				{
					System.out.print(a[row][left]+" ");
				}
				left++;
			}
		
			
		}

	}

}
