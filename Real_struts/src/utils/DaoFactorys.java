package utils;

import java.util.ArrayList;

public class DaoFactorys {
	private static ArrayList<TableIDao> tds=new ArrayList<TableIDao>();
	
	static 
	{
		
		TableIDao td[]=new TableIDao[] {
				new TableIDao("ProblemSet")
//				new TableIDao("Fertilizer"),
//				new TableIDao("Pesticides"),
//				new TableIDao("WholeFert"),
//				new TableIDao("WholePest"),
//				new TableIDao("OrderList"),
//				new TableIDao("Manager"),
//				new TableIDao("Message")
				};
		for(int i=0;i<td.length;i++)
		{
			tds.add(td[i]);
		}
	}
	public static TableIDao newInstance(String fna)
	{
		
		TableIDao ti=null;
		switch(fna)
		{
		case "pset":ti=new TableIDao("ProblemSet");break;//tds.get(0);break;
		case "prob":ti=new TableIDao("Problem");break;//tds.get(0);break;
//		case "user":ti=new TableIDao("User_");break;//tds.get(0);break;
//		case "fert":ti=new TableIDao("Fertilizer");break;//tds.get(1);break;
//		case "pest":ti=new TableIDao("Pesticides");break;//tds.get(2);break;
//		case "wfer":ti=new TableIDao("WholeFert");break;//tds.get(3);break;
//		case "wpes":ti=new TableIDao("WholePest");break;//tds.get(4);break;
//		case "order":ti=new TableIDao("OrderList");break;//tds.get(5);break;
//		case "mana":ti=new TableIDao("Manager");break;//tds.get(6);break;
//		case "mess":ti=new TableIDao("Message");break;//tds.get(7);break;
		}
		return ti;
	}
	
}
