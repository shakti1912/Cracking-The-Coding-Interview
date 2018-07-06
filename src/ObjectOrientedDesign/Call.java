package ObjectOrientedDesign;

public class Call
{
	private String name;
	public Call(String caller)
	{
		name = caller;
	}
	
	public String startCall()
	{
		return "call started";
	}

	public String endCall()
	{
		return "call ended";
	}
	
	public String caller()
	{
		return name;
	}
}
