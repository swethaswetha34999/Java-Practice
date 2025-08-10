package sumAndCount;

public class CountOfEvenAndOdd {

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
		
		int evenCount=0;
		int oddCount=0;
		
		for(int row=0;row<=a.length-1;row++)
		{
			for(int col=0;col<=a[row].length-1;col++)
			{
				if(a[row][col] %2==0)
				{
					evenCount++;
				}
				else
				{
					oddCount++;
				}
			}
		}
		
		System.out.println("Count of Odd number in the 2d array : "+oddCount);
		System.out.println("Count of Even number in the 2d array : "+evenCount);

	}

}
