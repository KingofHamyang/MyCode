import java.util.*;
import java.text.*;

class AAA extends Thread{
	
	public void run(){
		while(true){
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm::ss");
			Date d =new Date();
			String str = format.format(d);
			System.out.println("현재시간 :" + str);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			
		}
	}
}
public class timer {
	public static void main(String[] args){
		System.out.println("Main Start!");
		AAA ap = new AAA();
		ap.setDaemon(false);
		ap.start();
		try{Thread.sleep(4000);}
		catch(Exception e){
			
		}
		System.out.println("Main End!");
		
	}

}
