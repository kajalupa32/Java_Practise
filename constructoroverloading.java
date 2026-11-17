
public class constructoroverloading {
	
	int length,breadth;
		
	constructoroverloading()
	{
			
	}
	constructoroverloading(int l,int b)
	{
		length=l;
		breadth=b;
	}
	void display() 
	{
			System.out.println("Rectangle="+(length*breadth));
	}
	public static void main(String[] args) 
	{
			constructoroverloading r1=new constructoroverloading();
			constructoroverloading r2=new constructoroverloading(2,4);
			
			r1.display();
			r2.display();
	}
		
	}
	

	
		