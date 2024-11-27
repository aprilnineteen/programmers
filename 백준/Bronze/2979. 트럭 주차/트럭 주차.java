import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] park = new int[3];
		for(int i = 0; i < park.length; i++) {
			park[i] += sc.nextInt();
		}
		
		int money = 0;
		int[][] time = new int[3][2];
		for(int i = 0; i < 3; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
			}
		
		int [] parkTime = new int [101];
		
		for(int i = 0; i < 3; i++) {
			for(int j = time[i][0]; j < time[i][1]; j++) {
				parkTime[j]++;
				// System.out.println(parkTime[j]);
			}
		}
		for(int i = 0; i < parkTime.length; i++) {
			if(parkTime[i]==1) {
				money += park[0] * parkTime[i];
			}else if(parkTime[i]==2) {
				money += park[1]*parkTime[i];
			}else {
				money += park[2]*parkTime[i];
			}

		}
		
		System.out.println(money);

	
    }
}