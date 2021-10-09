package tri;

import java.io.ByteArrayInputStream;
import java.sql.SQLException;

import table.ProblemSet;
import utils.DaoFactorys;
import utils.TableIDao;

public class InsertSQL {

public static void main(String args[]) throws SQLException
{
	TableIDao td=DaoFactorys.newInstance("pset");
	ProblemSet ps=(ProblemSet) td.getTi();
	td.clearAll();
	SampleManager Sm=new SampleManager();
	for(int i=0;i<100;i++)
	{
		double a,b,c;
		String data="";
		data+=(a=((long)((Math.random()*100)*1000))*1.0/1000)+" ";
		data+=(b=((long)((Math.random()*100)*1000))*1.0/1000)+" ";
		data+=(c=((long)((Math.random()*100)*1000))*1.0/1000)+" ";
		if(a+b>c&&a+c>b&&b+c>a){
		System.out.println(data);
		Sm.Build("C:\\Users\\lenovo\\eclipse-workspace\\Real_struts\\src\\tri","Main.java");
		String ans= Sm.results(data);
		ps.setPno(0);
		ps.setAns(ans);
		ps.setData(data);
		td.Insert();
		}
		else {
			i--;
			continue;
		}
	}
}
}
