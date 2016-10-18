import java.net.*;
import java.io.*;
import java.util.*;

public class ClientsComputer {
	
	public static void main(String[] args){
		InetAddress ia = null;

		
		try{
			ia = InetAddress.getByName("192.168.200.184");
		}catch(Exception ee){}

		
		Socket soc = null;
		for(int i =0 ; i <10 ; i++){
			try{
				soc = new Socket(ia, 12348);
				//printout to server

				OutputStreamWriter osw = new OutputStreamWriter(soc.getOutputStream());
				BufferedWriter bw = new BufferedWriter(osw, 512);
				PrintWriter pw = new PrintWriter(bw);
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();



				pw.println(str);
				pw.flush();
				
				//get ping from server
				InputStreamReader isr = new InputStreamReader(soc.getInputStream());
				BufferedReader br = new BufferedReader(isr, 512);
				String data = br.readLine();
				System.out.println("He :" + data);
		
				
			
			
			}catch(Exception ee){}
		}
	}


}
