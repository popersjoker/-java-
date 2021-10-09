package tri;

import java.io.ByteArrayInputStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

//import com.sun.org.apache.bcel.internal.generic.NEW;

public class SampleManager {
	private int comp=1;//是否成功编译
	private JavaCompiler compiler;
	private InputStream sysis=System.in;
	private PrintStream syserr=System.err;
	private PrintStream sysout=System.out;
	private Class dd=null;
	private int maxcache=1024;
	private Method mt=null;
	private ByteArrayOutputStream ins=null;
	private URLClassLoader uc=null;
	public SampleManager() {
		compiler=ToolProvider.getSystemJavaCompiler();
	}
	public void reset(String classname)
	{
		comp=0;
	}
	//编译
	//类名必须为Main 必须包含静态函数 Main(String args[]);
	public String Build(String classpath,String classname)
	{
		String inf="成功编译\n";
		ins=new ByteArrayOutputStream();//替换系统输入
		//System.setErr(new );
		//System.setErr(pb);
		if(comp!=0) {
			classpath=classpath.replaceAll("\\\\","/")+"/";
			comp=compiler.run(null, null, ins, classpath+classname);//"C:\\Users\\lenovo\\eclipse-workspace\\Real_struts\\src\\tri\\"+classname+".java");
			if(comp!=0) {
				inf=new String(ins.toByteArray());
				this.recur();
				return inf;
			}
			try {
				uc=new URLClassLoader(new URL[]{new File(classpath).toURL()},Thread.currentThread().getContextClassLoader());
				uc.loadClass("Main");
			} catch (Exception e) {
				System.err.println("编译失败");
				// TODO Auto-generated catch block
				e.printStackTrace();
				comp=1;
				inf=e.getMessage();
				inf+=new String(ins.toByteArray());
				this.recur();
			}
		}
		return inf;
	}
	public int getComp() {
		return comp;
	}
	public void setComp(int comp) {
		this.comp = comp;
	}
	//运行
	public String results(String iss)//通过包名动态编译
	{
		
		String end="";
		if(comp==0) {
		try {
		dd=uc.loadClass("Main");//固定形式
		mt=dd.getDeclaredMethod("main",String[].class);
		System.setIn(new ByteArrayInputStream(iss.getBytes()));				
		ByteArrayOutputStream bs=new ByteArrayOutputStream(this.maxcache);
		PrintStream pb=new PrintStream(bs);
		System.setOut(pb);
		//System.err.println("函数执行中");
		mt.invoke(null,new Object[]{new String[]{"abc","efg"}});
		//System.err.println("函数执行完毕");
		end=new String(bs.toByteArray());
		
    	    	
		} catch (Exception e) {
				e.printStackTrace();	
				end+=e.getMessage();
				String debug=new String(ins.toByteArray());
		    	end=debug;

			}
			}
		return end;
    	}

	public void recur()
	{
		System.setIn(sysis);;
		System.setOut(sysout);;
		System.setErr(sysout);
	}
}
