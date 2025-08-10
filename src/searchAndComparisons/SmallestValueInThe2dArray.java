package searchAndComparisons;

public class SmallestValueInThe2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a= {{1,2,3},{4,-5,6},{7,0,9}};
		
		System.out.println("Original matric : ");
		
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(a[row][col]+" ");
			}
			System.out.println("");
		}
		int min=a[0][0];
		
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				if(min>a[row][col])
				{
					min=a[row][col];
				}
			}
		}
		
		System.out.println("Smallest element in the 2d array : "+min);

	}

}
