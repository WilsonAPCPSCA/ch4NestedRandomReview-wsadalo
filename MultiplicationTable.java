
public class MultiplicationTable {

	public static void main(String[] args) {
		int product;
		for (int i=1; i<=10; i++){
			for (int j=1;j<=10;j++){
				product = i*j;
				System.out.print(product+" ");
			}
			System.out.println();
		}

	}

}
