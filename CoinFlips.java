import java.util.Scanner;
public class CoinFlips {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("This program will simulate flipping a fair coin.");
		System.out.print("How many times would you like the coin to be flipped? ");
		int times =in.nextInt();
		System.out.println("Here is the sequence of coin flips:");
		int coin;
		int heads=0;
		int tails=0;
		for (int i=0; i<times;i++){
			coin = (int)(Math.random()*2);
			if(coin == 0){
				System.out.print("H");
				heads++;
			}
			if(coin == 1){
				System.out.print("T");
				tails++;
			}
		}
		System.out.println();
		System.out.println("There were "+heads+" heads and "+tails+" tails.");
	}

}
