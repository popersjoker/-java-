package action;

import com.opensymphony.xwork2.ModelDriven;


//import ActionSupport;
import ser.GetQue;

public class AQG extends com.opensymphony.xwork2.ActionSupport implements ModelDriven<GetQue> {

	@Override
	public GetQue getModel() {
		// TODO Auto-generated method stub
		return new GetQue();
	}
	@Override
	public String execute()throws Exception{
		return "success";
		
	}

}
