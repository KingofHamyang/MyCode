import java.io.*;
public class inputexam {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream(FileDescriptor.in);
		FileInputStream fis2 = new FileInputStream(new File("vsdvs.txt"));
		
		System.out.println("����");
		char ch = (char)fis1.read();
		System.in.read();
		System.out.println("���ڿ�");
		byte[] by = new byte[1024];
		fis1.read(by);
		
		System.out.println();
		System.out.println(ch);
		System.out.println(new String(by).trim());
		
		
	}

}
