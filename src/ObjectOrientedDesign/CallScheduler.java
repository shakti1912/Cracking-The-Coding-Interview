package ObjectOrientedDesign;

import java.util.ArrayList;

public class CallScheduler
{
	private ArrayList<Call> calls;
	
	public CallScheduler()
	{
		calls = null;
	}
	
	public void scheduleCall(Call call)
	{
		calls.add(call);
		call.startCall();
	}

}
