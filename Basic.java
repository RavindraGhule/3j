
public class Basic {
	public static int factorial(int a) {
		for(int i=1;i<=a;i++) {
			if(i%2==0 && i%i==0) {
				System.out.println("not prime");
			}else {
			System.out.println(i);}
		}
		return 0;
	}

	public static void main(String[] args) {
		Basic.factorial(20);

	}
}
