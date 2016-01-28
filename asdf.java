import java.util.ArrayList;

public class asdf{
	public static void main (String[] args){
		int i;
		Dog Mydog = new Dog();
		i=0;

		while(i!=10) {
			System.out.println("Hellow");
			System.out.println("My name is Ha Seog jun" + i);
			i = i+1;
		}
		Mydog.bark();
		Mydog.size = 12;
		Mydog.age = 15;
		System.out.println("size :"+Mydog.size);

		ArrayList<Integer> arra = new ArrayList<Integer>();
		

		for(i=0;i<5;i++){

			arra[i] = i;
		}		

		for(i=0;i<5;i++){

			System.out.println(arra[i]);
		}
		
		

	

	}

}