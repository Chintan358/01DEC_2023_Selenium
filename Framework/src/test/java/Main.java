
public class Main {
	public static void main(String[] args) {
		
		
		ExcellReader rd = new ExcellReader("C:\\Users\\pc\\Desktop\\Test\\mytest.xlsx","Reg");
		int row = rd.rowCount();
		System.out.println("rows : "+row);
		
		int col = rd.colCount();
		System.out.println("cols : "+col);
		
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getData(i,j);
				System.out.print(data);
			}
			System.out.println();
		}
		
		
	}
}
