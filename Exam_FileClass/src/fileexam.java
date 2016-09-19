//file processing
import java.io.*;
public class fileexam {
	public static void main(String[] args){
		
		String str = File.pathSeparator;
		char b = File.pathSeparatorChar;
		String c =File.separator;
		char d = File.separatorChar;
		
		System.out.println(str+b+c+d);
		System.out.println();
		
		File f = new File("www"); //explorer.java
		
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		
		boolean boo =false;
		try{
			boo = f.createNewFile();
		
		}catch(Exception ee){
			
		}
		System.out.println(boo);
		File ff = new File(".");
		try{
			File f2 = File.createTempFile("temp", "hsj",ff);
			System.out.println(f2);
			f2.delete();
			System.out.println(f2.getAbsolutePath());
			System.out.println(f2.getCanonicalPath());
		}catch(Exception e){}
		f.delete();
		File fff = new File("aaa");
		fff.mkdir();
		

		
		
	}

}
