package basic;

public class SearchForAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{-2,1,4,3,7},{2,8,5,6,-3,0}};
		
		int t=4;
		boolean isFound=false;
		
		SearchLoop:
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				if(t==a[row][col])
				{
					isFound=true;
					break SearchLoop;
				}
			}
		}
		
		if(isFound==true)
		{
			System.out.println("Found");
		}
		
		else
		{
			System.out.println("Not Found");
		}

	}

}
