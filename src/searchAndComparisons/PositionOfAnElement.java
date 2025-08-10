package searchAndComparisons;

public class PositionOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[][] a= {{1,2,3},{4,-5,6},{7,0,9}};

int target=6;
int position=0;
		
		System.out.println("Original matric : ");
		
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(a[row][col]+" ");
			}
			System.out.println("");
		}
		
		
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				if(a[row][col]==target)
				{
					System.out.println("["+(row+1)+","+(col+1)+"]");
				}
			}
		}
		
		

	}

}
