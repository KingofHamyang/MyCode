
public class testbox {
	
	public static void main(String[] args){
		
		int[][] array = new int[5][5];
		int[][] ori = new int[5][5];
		int[][] result = new int[5][5];
		
		for(int i=0; i <5; i++){
			for(int j=0; j<5; j++){
				ori[i][j] = Integer.parseInt(args[i*5 + j]);
			}
		}
		
		
		for(int i=0; i <5; i++){
			for(int j=0; j<5; j++){
				array[i][j] = 0;
			}
		}
		array[2][3] =1;

		for(int i=0; i <5; i++){
			for(int j=0; j<5; j++){
				System.out.print(array[i][j]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		Marker marks = new Marker();
		result=marks.mark(array, ori);
		
		for(int i=0; i <5; i++){
			for(int j=0; j<5; j++){
				System.out.print(result[i][j]);
			}
			System.out.print("\n");
		}

		
		
		
		

	}
	

}





