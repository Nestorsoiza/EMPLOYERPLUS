package delivery;

public class Main {

	public static void main(String[] args) {
		Comercial C1 = new Comercial("Jose", 37, 1000, 300);
		Repartidor r1 = new Repartidor("juan", 22, 900, "3");

		C1.plus();
		r1.plus();

		System.out.println(C1);
		System.out.println(r1);
	}

}
