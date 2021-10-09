package ser;

import java.sql.SQLException;

import table.Problem;
import utils.DaoFactorys;
import utils.TableIDao;

public class GetQue extends com.opensymphony.xwork2.ActionSupport{
public GetQue() {}
public GetQue(int pno) {
	this.pno=pno;
}
private int pno;
private Problem prob;
public String getProblem()
{
	TableIDao td=DaoFactorys.newInstance("prob");
	//int pno=this.pno;
	try {
		Problem prob=(Problem) td.getTi();
		prob.setPno(pno);
		this.prob=(Problem) td.QuerySel();
		//request.setAttribute("prob", prob);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "SS";
}
public int getPno() {
	return pno;
}
public void setPno(int pno) {
	this.pno = pno;
}
public Problem getProb() {
	return prob;
}
public void setProb(Problem prob) {
	this.prob = prob;
}
}
