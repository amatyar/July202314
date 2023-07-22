
public class July21 
{
     //Singleton
	public static void main(String[] args) 
	{
		Store ad = Store.getInstance();
		ad.getConnection();

	}

}
class Store {
	private static Store db;
	
	private Store()
	{
		//
	}
	public static Store getInstance() 
	{
		if(db == null)
		{
			db = new Store();
		}
		return db;
	}
	public void getConnection() 
	{
		System.out.println("connected to Database");
	}
}
