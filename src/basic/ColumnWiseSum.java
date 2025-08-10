package basic;

public class ColumnWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{1,2,3},{4,5}};
		
		//need to find number of maximum num of colns to iterate through colns
		
		int max=0;
		
		for(int i=0;i<a.length;i++){
			if(max<a[i].length)
			{
				max=a[i].length;
			}
		}
		
		//now find the sum of coln
		
		for(int col=0;col<max;col++)
		{
			int sum=0;
			for(int row=0;row<a.length;row++)
			{
				if(col<a[row].length)
				{
					sum=sum+a[row][col];
				}
			}
			System.out.println(sum);
		}

	}

}
