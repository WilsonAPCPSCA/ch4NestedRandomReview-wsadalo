import java.util.Scanner;
public class SumOfDice {

	public static void main(String[] args) {
		System.out.println("This program will simulate tossing a pair of dice.");
		System.out.print("How many times would you like the dice to be tossed? ");
		Scanner in=new Scanner(System.in);
		int times=in.nextInt();
		System.out.println("Here is the sequence of sum, one for each toss:");
		int dice1;
		int dice2;
		int sum;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=0;
		int num7=0;
		int num8=0;
		int num9=0;
		int num10=0;
		int num11=0;
		int num12=0;
		for (int i=0; i<times; i++){
			dice1=(int)(Math.random()*5+1);
			dice2=(int)(Math.random()*5+1);
			sum=dice1+dice2;
			System.out.print(sum+" ");
			if (sum == 2)
				num2++;
			if (sum == 3)
				num3++;
			if (sum == 4)
				num4++;
			if (sum == 5)
				num5++;
			if (sum == 6)
				num6++;
			if (sum == 7)
				num7++;
			if (sum == 8)
				num8++;
			if (sum == 9)
				num9++;
			if (sum == 10)
				num10++;
			if (sum == 11)
				num11++;
			if (sum == 12)
				num12++;		
		}
		System.out.print("\n2: ");
		for(int i = num2; i>0; i--)
			System.out.print("*");
		System.out.print("\n3: ");
		for(int i = num3; i>0; i--)
			System.out.print("*");
		System.out.print("\n4: ");
		for(int i = num4; i>0; i--)
			System.out.print("*");
		System.out.print("\n5: ");
		for(int i = num5; i>0; i--)
			System.out.print("*");
		System.out.print("\n6: ");
		for(int i = num6; i>0; i--)
			System.out.print("*");
		System.out.print("\n7: ");
		for(int i = num7; i>0; i--)
			System.out.print("*");
		System.out.print("\n8: ");
		for(int i = num8; i>0; i--)
			System.out.print("*");
		System.out.print("\n9: ");
		for(int i = num9; i>0; i--)
			System.out.print("*");
		System.out.print("\n10: ");
		for(int i = num10; i>0; i--)
			System.out.print("*");
		System.out.print("\n11: ");
		for(int i = num11; i>0; i--)
			System.out.print("*");
		System.out.print("\n12: ");
		for(int i = num12; i>0; i--)
			System.out.print("*");
		
	}

}
