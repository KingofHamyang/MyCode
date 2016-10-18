import java.net.*;
import java.io.*;

public class ServeredSocket {
	public static void main(String[] args){
		ServerSocket ss = null;
		for(int i=1 ;i<65535;i++){
			try{
				ss = new ServerSocket(i);
				
			}catch(Exception ee){
				System.out.println(i + " Port is used");
			}
		}
		
	}

}
