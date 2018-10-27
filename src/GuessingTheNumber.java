import java.util.Scanner;

public class GuessingTheNumber {

	public static void main(String[] args) {
		int initialRange;
		int finalRange;
		String hint;
		int count = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Program jak najszybciej zgadnie wymyœlon¹ przez Ciebie liczbê, ¿eby mu pomóc wpisz\n \"up\" jeœli poda³ za nisk¹"
						+ " liczbê,\n \"down\" jeœli za wysok¹,\n \"ok\" je¿eli uda³o mu siê zgadn¹æ :)\n");

		System.out.print("Podaj pocz¹tkow¹ wartoœæ zakresu: ");
		initialRange = sc.nextInt();

		System.out.print("Podaj koñcow¹ wartoœæ zakresu: ");
		finalRange = sc.nextInt() + 1;

		System.out.println("Czy wymyœlona liczba to: " + middleShot(initialRange, finalRange));

		do {
			hint = sc.next();

			if (hint.equals("up")) {
				initialRange = middleShot(initialRange, finalRange);
				System.out.println("Czy wymyœlona liczba to: " + middleShot(initialRange, finalRange));
				count++;
			}

			else if (hint.equals("down")) {
				finalRange = middleShot(initialRange, finalRange);
				System.out.println("Czy wymyœlona liczba to: " + middleShot(initialRange, finalRange));
				count++;
			}

			else if (!hint.equals("ok")) {
				System.out.println("Podano z³¹ wartoœæ, u¿yj \"up\", \"down\" lub \"ok\"");
			}

		} while (!hint.equals("ok"));

		sc.close();
		System.out.println("Odgad³em twoj¹ liczbê: " + middleShot(initialRange, finalRange) + " za " + count + " razem");

	}

	static int middleShot(int initialRange, int finalRange) {
		return ((finalRange + initialRange) / 2);
	}

}
