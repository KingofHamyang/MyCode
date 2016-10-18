import java.net.*;
import java.io.*;
import java.util.*;

public class ServerComputer {
	
	public static void main(String[] args){

		ServerSocket ss = null;
		try{
			ss = new ServerSocket(12348);
			System.out.println("Sever is ready");
			while(true){
				Socket s = ss.accept();

			//clients
				InputStreamReader isr = new InputStreamReader(s.getInputStream());
				BufferedReader br = new BufferedReader(isr, 512);
				String data = br.readLine();
				System.out.println("He :" + data);
			
			//data transfer
				OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
				BufferedWriter bw = new BufferedWriter(osw, 512);
				PrintWriter pw = new PrintWriter(bw);
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();
				pw.println(str);
				pw.flush();
			}
			
			
		}catch(Exception ee){
			System.out.println("Can't open the Server");
		}
	}
}
