package ser;

import file.FileOp;
import valication.CorretRate;

public class WhileSubVal extends com.opensymphony.xwork2.ActionSupport{
private String infor="";
private String code=null;
private int no; 
public String getInfor() {
	return infor;
}
public void setInfor(String infor) {
	this.infor = infor;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String  getRes()
{
	String filepath="C:\\Users\\lenovo\\Desktop\\test";
	FileOp.save(filepath+"\\Main.java", code, false);
	CorretRate cr=new CorretRate();
	try {
		infor=cr.Rate(filepath, no);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	return "success";
}
}
