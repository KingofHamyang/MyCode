import java.util.*;
import java.math.*;

public class MyThread implements Runnable{
	@Override
	public void run() {
		int i;
		for(i=0;i<10;i++){
			System.out.print("A");
			
		}
		System.out.println("\n");
		for(i=0;i<10;i++){
			System.out.print("B");
			
		}
		
	}
	

}
