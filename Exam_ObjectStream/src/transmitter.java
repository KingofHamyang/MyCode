import java.io.*;


public class transmitter {
	public static void main(String[] args) throws IOException{
		A a = new A();
		
		File f = new File("ddd.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(a);
		oos.close();
		
		System.out.println("finish");
	}

}
