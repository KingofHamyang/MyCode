import java.io.*;

public class publicmethod {
		public static void main(String[] args) throws IOException {
			//write in console
			FileOutputStream fos1 = new FileOutputStream(FileDescriptor.out);
			BufferedOutputStream bos1 = new BufferedOutputStream(fos1, 2048);
			DataOutputStream dos1 = new DataOutputStream(bos1);
			
			//write in file     flush -> buffer explode
			File f = new File("vsdvs.txt");
			FileOutputStream fos2 = new FileOutputStream(f);
			BufferedOutputStream bos2 = new BufferedOutputStream(fos2, 1024);
			DataOutputStream dos2 = new DataOutputStream(bos2);
			
			dos1.writeInt(20); //->4byte∑Œ ±˙¡¸
			dos1.writeDouble(12.34); //-> 8byte∑Œ ±˙¡¸ -> input stream¿ª πﬁæ∆µÈ¿Ã∏È ¡¶¥Î∑Œµ .
			dos1.flush();
			dos1.writeChar('A');
			dos1.writeByte('V');
			dos1.close();
			
			dos2.writeInt(20); //->4byte∑Œ ±˙¡¸
			dos2.writeDouble(12.34); //-> 8byte∑Œ ±˙¡¸ -> input stream¿ª πﬁæ∆µÈ¿Ã∏È ¡¶¥Î∑Œµ .
			dos2.flush();
			dos2.writeChar('A');
			dos2.writeByte('V');
			dos2.close();
			
			
		}

}
