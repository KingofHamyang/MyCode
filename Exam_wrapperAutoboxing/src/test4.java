
class k extends Thread{
	private int x = 100;
	public void setX(int x){
		this.x += x;
	}
	
	public int getX(){
		return x;
	}
	
	public void run(){
		setX(200);
		System.out.println("x=" + getX());
	}
}



public class test4 {
	
	public static void main(String[] args){
		k kp = new k();
		kp.start();

		
	}

}
