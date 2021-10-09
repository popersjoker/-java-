package valication;

import java.io.ByteArrayInputStream;
import java.sql.SQLException;
import java.util.ArrayList;

import table.ProblemSet;
import table.TableI;
import tri.SampleManager;
import utils.DaoFactorys;
import utils.TableIDao;

public class CorretRate {
public  String Rate(String classname,int no) throws SQLException
{
	TableIDao td=DaoFactorys.newInstance("pset");
	ProblemSet ti=(ProblemSet) td.getTi();
	ti.setPno(no);
	ArrayList<TableI>set=td.QuerySelSet();
	int cs=0,tm=0;
	SampleManager sm=new SampleManager();
	String build=sm.Build(classname,"Main.java");
	System.err.println(build);
	if(sm.getComp()==1)return build; 
	for(TableI t:set)
	{
		ProblemSet ps=(ProblemSet) t;
		String rt=sm.results(ps.getData());
		if(rt.trim().equals(ps.getAns().trim()))
		{
			cs++;
		}
	}
	sm.recur();
	return "Corret Rate:"+cs+"/"+set.size();
}
}
