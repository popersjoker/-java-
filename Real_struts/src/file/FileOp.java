package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOp {

public static void save(String path,String str,boolean cont)
{
	try {
		BufferedWriter bw=new BufferedWriter(new FileWriter(new File(path),cont));
		bw.write(str);
		bw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static String get(String path)
{
	String out="";
	try {
		BufferedReader br=new BufferedReader(new FileReader(new File(path)));
		String res="";
		while((res=br.readLine())!=null)
		{
			out+=res;
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println(out);
	return out;
	
}
}
