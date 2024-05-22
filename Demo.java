
public class Demo {

	public void Test(int number) {
		for(int i=0;i<=number;i++) {
			if(number %2 ==0 && number/number==0) {
				System.out.println("not prime number");
			}else {
				System.out.println("printing those number"+number);
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("============");
		Demo demo=new Demo();
		demo.Test(10);
		
	}

}
