package table;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ProblemSet extends TableI {
	private String data,ans;
	private int pno;
	//private java.util.Date time;
	public ProblemSet()
	{
		super("problemSet", "(pno varchar(10),data varchar(40),ans varchar(40))");

	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public ProblemSet(int pno, String data, String ans) {
		super("problemSet", "(pno varchar(10),data varchar(40),ans varchar(40))");
		this.pno=pno;
		this.data = data;
		this.ans = ans;
		//this.time = time;
	}

	@Override
	public ArrayList<String> getInitArr_(int ch, boolean eq) {
		// TODO Auto-generated method stub
		 ArrayList<String> arr = new ArrayList<String>();
		    String str = "";
		    if ((ch & 0x1) == 1) { if (eq) str = String.valueOf((String)this.outlook.get(0)) + "=";  arr.add(String.valueOf(str) + this.pno); }
		    if ((ch & 0x2) != 0) { if (eq) str = String.valueOf((String)this.outlook.get(1)) + "=";  arr.add(String.valueOf(str) + FS(this.data)); }
		    if ((ch & 0x4) != 0) { if (eq) str = String.valueOf((String)this.outlook.get(2)) + "=";  arr.add(String.valueOf(str) + FS(this.ans)); }
		    
		  return arr;
	}

	@Override
	public String tr(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TableI Maker(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return new ProblemSet(rs.getInt("pno"),rs.getString("data"),rs.getString("ans"));
	}
	
	@Override
	public String head() {
return null;
	}

	@Override
	public String QuerySel() {
		// TODO Auto-generated method stub
		return SQL.quy(super.getColStr(15), this.tableName, this.getWhereStr_(1));
	}

	@Override
	public String DeleteSel() {
		// TODO Auto-generated method stub
		return SQL.rev(tableName, super.getWhereStr_(1));
	}

	@Override
	public String InsertNew() {
		// TODO Auto-generated method stub
		return SQL.add(tableName, super.getInitStr_(), super.getParamSet(15));
	}

	@Override
	public String UpdateNew() {
		// TODO Auto-generated method stub
		return SQL.upt(tableName, super.getSetStr_(15), super.getWhereStr_(1));
	}

}
