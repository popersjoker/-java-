package table;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Problem extends TableI {
	private String title,intro,sample;
	private int pno;
	//private java.util.Date time;
	public Problem()
	{
		super("problem", "(pno varchar(10),title varchar(40),intro varchar(800),sample varchar(400))");

	}
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}




	public String getIntro() {
		return intro;
	}


	public void setIntro(String intro) {
		this.intro = intro;
	}


	

	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public Problem(int pno, String data, String ans,String sample) {
		super("problem", "(pno varchar(10),title varchar(40),intro varchar(800),sample varchar(400))");
		this.pno=pno;
		this.title = data;
		this.intro=ans;
		this.sample=sample;
		//this.time = time;
	}

	@Override
	public ArrayList<String> getInitArr_(int ch, boolean eq) {
		// TODO Auto-generated method stub
		 ArrayList<String> arr = new ArrayList<String>();
		    String str = "";
		    if ((ch & 0x1) == 1) { if (eq) str = String.valueOf((String)this.outlook.get(0)) + "=";  arr.add(String.valueOf(str) + this.pno); }
		    if ((ch & 0x2) != 0) { if (eq) str = String.valueOf((String)this.outlook.get(1)) + "=";  arr.add(String.valueOf(str) + FS(this.title)); }
		    if ((ch & 0x4) != 0) { if (eq) str = String.valueOf((String)this.outlook.get(2)) + "=";  arr.add(String.valueOf(str) + FS(this.intro));}
		    if ((ch & 0x8) != 0) { if (eq) str = String.valueOf((String)this.outlook.get(2)) + "=";  arr.add(String.valueOf(str) + FS(this.sample));}
		    
		  return arr;
	}

	public String getSample() {
		return sample;
	}


	public void setSample(String sample) {
		this.sample = sample;
	}


	@Override
	public String tr(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TableI Maker(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return new Problem(rs.getInt("pno"),rs.getString("title"),rs.getString("intro"),rs.getString("sample"));
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
