public class Area_Shapes{
		
		void area(int l,int b)
		{
			int area = l*b;
			System.out.println("The area of rectangle is "+area);

		}
		void area(int r)
		{
			float area = 3.14f*r*r;
			System.out.println("The area of Circle is "+area);

		}
	public static void main(String args[])
		{
			Area_Shapes s = new Area_Shapes();
			s.area(4,5);
			s.area(4);		
		}


}