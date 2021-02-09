
public class Calculate {
	
	int num1;
	int num2;
	int result;
	
	public Calculate() {
		num1 = 7;
		num2 = 1;
	
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		Calculate obj =new Calculate();
	
		System.out.println(obj.num1);
	}

}
