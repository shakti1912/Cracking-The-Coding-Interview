package ObjectOrientedDesign;

public class Director implements Employee
{
	private String name;
	private boolean available;
	public Director(String name)
	{
		this.name = name;
		this.available = true;
	}
	@Override
	public String answer() {
		// TODO Auto-generated method stub
		if(available)
		{
			return "Director is responding.";
		}
		return "Not Available";
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean getAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setAvailable() {
		// TODO Auto-generated method stub
		
	}
	
	

}
