import java.util.*;
public class test1 {
	
	public static void main(String[] args){
		/*int[] array = {30, 10 ,20 ,14};
		int[] array2 = Arrays.copyOf(array, array.length);
		
		int i;
		for(i=0; i< array.length ; i++){
			
			System.out.println(array2[i]);
			
		}
		Arrays.sort(array);
		int num = Arrays.binarySearch(array, 30);
		
		System.out.println(num); */
		
		Thread thread1 = new Thread(new MyThread());

		
		Thread thread2 = new Thread(){
			@Override
			public void run(){
				int i;
				for(i=0;i<10;i++){
					System.out.print("C");
					
				}
				System.out.println("\n");
				for(i=0;i<10;i++){
					System.out.print("D");
					
				}
				
			}
		};
		
		thread1.start();
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		thread2.start(); //Thread 호출 후 스택에 올라감
		//단순 run을 호출하면 method호출과 동일
		
		
		
		
		
		
	}

}
