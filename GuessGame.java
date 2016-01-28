import java.util.Scanner;

class GuessGame{
	
	public void startgame() {

		int targetnum;
		targetnum = (int) (Math.random()*10);

		Scanner sc = new Scanner(System.in);
		int yournum;
		System.out.println("Start the GG! Can you Guess the number?");
		int i;
		i=0;
		while(i==0){
			yournum = sc.nextInt();
			if(yournum == targetnum){
				System.out.println("Correct You are lucky!!!!");
				i=1;


			}
			else{
				System.out.println("No! Try again!");
			}


		}

		





	}





}
