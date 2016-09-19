import java.io.*;

public class getter {
	public static void main(String[] args) throws IOException{
		File f = new File("ddd.txt");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis, 1024);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = new Object();
		try{
			obj = ois.readObject();
		}catch(ClassNotFoundException ee){}
		
		A ap = new A();
		ap = (A)obj;
		
		System.out.println(ap.x + " " +ap.y + " " + ap.z);
		
		ois.close();
		
		
		
	}

}
