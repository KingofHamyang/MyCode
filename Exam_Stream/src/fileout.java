import java.io.*;
import java.util.*;
public class fileout {
	
	public static void main(String[] args)throws IOException {
		FileOutputStream fos1 = new FileOutputStream(FileDescriptor.out);
		File f = new File("asdf.txt");
		FileOutputStream fos2 = new FileOutputStream(f,true);
		
		byte[] by = new byte[]{'h', 'e', 'w','q','y','b'};
		
		fos1.write(by,2,4);
		fos2.write(by);
		
		fos1.write(65);
		
		fos1.close();
		fos2.close();
		
		
	}
}
