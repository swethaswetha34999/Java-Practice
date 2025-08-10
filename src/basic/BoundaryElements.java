package basic;

public class BoundaryElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[][] a= {{1,2,3,4,13},{5,6,7,8,14},{9,10,11,12,15}};
		int a[][]={{1,2},{3,4}};
		
		int c=a[0].length;
		int r=a.length;
		
		System.out.println("Original matric : ");
		
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(a[row][col]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Boundary Elements : ");
		
		int top=0;
		int right=a[0].length-1;
		int left=0;
		int bottom=a.length-1;
		
		
		if(r>1 && c>1)
		{
			
			for(int col=top;col<=right;col++)
			{
				System.out.print(a[top][col]+" ");
			}
			top++;
			
			for(int row=top;row<=bottom;row++)
			{
				System.out.print(a[row][right]+" ");
			}
			right--;
			
			for(int col=right;col>=left;col--)
			{
				System.out.print(a[bottom][col]+" ");
			}
			bottom--;
			
			for(int row=bottom;row>=top;row--)
			{
				System.out.print(a[row][left]+" ");
			}
			}
		
		else
		{
			for(int col=top;col<=right;col++)
			{
				System.out.print(a[top][col]+" ");
			}
			top++;
			
			for(int row=top;row<=bottom;row++)
			{
				System.out.print(a[row][right]+" ");
			}
			right--;
		}
		
		

	}

}
