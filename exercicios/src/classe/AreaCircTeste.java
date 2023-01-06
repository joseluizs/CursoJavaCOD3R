package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(10.0);
		//a.pi = 10.0;
		System.out.println(a.area());
		
		AreaCirc a1 = new AreaCirc(5.0);
		//a1.pi = 10.0;
		System.out.println(a1.area());

		//AreaCirc.pi = 3.1415;
		
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
	}

}
