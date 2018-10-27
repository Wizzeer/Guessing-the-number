import java.util.Scanner;

public class GuessingTheNumber {

	public static void main(String[] args) {
		int initialRange;
		int finalRange;
		String hint;
		int count = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Program jak najszybciej zgadnie wymy�lon� przez Ciebie liczb�, �eby mu pom�c wpisz\n \"up\" je�li poda� za nisk�"
						+ " liczb�,\n \"down\" je�li za wysok�,\n \"ok\" je�eli uda�o mu si� zgadn�� :)\n");

		System.out.print("Podaj pocz�tkow� warto�� zakresu: ");
		initialRange = sc.nextInt();

		System.out.print("Podaj ko�cow� warto�� zakresu: ");
		finalRange = sc.nextInt() + 1;

		System.out.println("Czy wymy�lona liczba to: " + middleShot(initialRange, finalRange));

		do {
			hint = sc.next();

			if (hint.equals("up")) {
				initialRange = middleShot(initialRange, finalRange);
				System.out.println("Czy wymy�lona liczba to: " + middleShot(initialRange, finalRange));
				count++;
			}

			else if (hint.equals("down")) {
				finalRange = middleShot(initialRange, finalRange);
				System.out.println("Czy wymy�lona liczba to: " + middleShot(initialRange, finalRange));
				count++;
			}

			else if (!hint.equals("ok")) {
				System.out.println("Podano z�� warto��, u�yj \"up\", \"down\" lub \"ok\"");
			}

		} while (!hint.equals("ok"));

		sc.close();
		System.out.println("Odgad�em twoj� liczb�: " + middleShot(initialRange, finalRange) + " za " + count + " razem");

	}

	static int middleShot(int initialRange, int finalRange) {
		return ((finalRange + initialRange) / 2);
	}

}
