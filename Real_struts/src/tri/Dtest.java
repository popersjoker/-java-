package tri;

import java.sql.SQLException;

import valication.CorretRate;

public class Dtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		SampleManager sm=new SampleManager();
		sm.Build("C:\\Users\\lenovo\\Desktop\\test","Main.java");
		sm.results("1 2 3 ");
//		CorretRate cr=new CorretRate();
//		try {
//			
//			System.out.println(cr.Rate("c:\\Main.java", 0));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
