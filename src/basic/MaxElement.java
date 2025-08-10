package basic;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{-2,1,4,3,7},{2,8,5,6,-3,0}};
		int sum=0;
		
		int max=a[0][0]; //always assign the first element 
		
		for(int row=0;row<a.length;row++) 
		{
			for(int col=0;col<a[row].length;col++)
			{
				if(max<a[row][col])
				{
					max=a[row][col];
				}
			}
		}
		
		System.out.println("The maximum element is : "+max);

	}

}
