package basic;

public class Diagonal {

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
		
		System.out.println("Sum of Primary Diagonal : ");
		int sum_pri=0;
		
		for(int row=0;row<a.length;row++)
		{
			sum_pri+=a[row][row];	
		}
		
		System.out.println(sum_pri);	
		
		System.out.println("Sum of Secondary Diagonal : ");
		int sum_sec=0;
		
		for(int row=a.length-1;row>=0;row--)
		{
			sum_sec+=a[row][a.length - row -1];
				
		}
		System.out.println(sum_sec);
		
		
		

	}

}
