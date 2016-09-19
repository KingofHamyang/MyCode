
public class explorer {
	public static void main(String[] args) throws Exception{
	
		Runtime rt = Runtime.getRuntime();
		Process pro = rt.exec("explorer.exe http://www.naver.com");
		try{Thread.sleep(1000);}
		catch(Exception ee){}
		pro.destroy();
		
	}

}
