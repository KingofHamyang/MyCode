
public class Marker {
	
	
	public int[][] mark(int[][] a, int[][] origin){
		
		int cnt =0;
		int[][] temp = new int[5][5];
		for(int i=0; i <5; i++){
			for(int j=0; j<5; j++){
				temp[i][j] = a[i][j];
			}
		}
		
		
		for(int i=0; i <5; i++){
			for(int j=0; j<5; j++){
				
				if(temp[i][j] ==1){
				
				//right side
				if(i-1>=0){
					if( temp[i-1][j] ==0 && origin[i-1][j] !=0){
						temp[i-1][j] = 2;
						cnt++;
					}
				}
				
				//left side
				if(i+1<=5){
					if( temp[i+1][j] ==0 && origin[i+1][j] !=0){
						temp[i+1][j] = 2;
						cnt++;
					}
				}
				
				//upper side
				if(j-1>=0){
					if( temp[i][j-1] ==0 && origin[i][j-1] !=0){
						temp[i][j-1] = 2;
						cnt++;
					}
				}
				
				//down side
				if(j+1<=5){
					if( temp[i][j+1] ==0 && origin[i][j+1] !=0){
						temp[i][j+1] = 2;
						cnt++;
					}
				}
				
				
			}
			}
		}
		int[][] y;
		if(cnt ==0){
			return temp;
		}
		else{
			Marker m = new Marker();
			for(int i=0; i <5; i++){
				for(int j=0; j<5; j++){
					if(temp[i][j]==2){
						temp[i][j] =1;
					}
				}
			}
			
			y= m.mark(temp, origin);
		}
		
		
		return y;
	}
	
	

}
