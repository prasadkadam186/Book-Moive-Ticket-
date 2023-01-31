package pattern;

public class first {

	public static void main(String[] args) {
		int line=4;
		int star=4;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(i==0 || j==0 || i==line-1 || j==line-1 || i+j==line-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
