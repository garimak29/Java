package bitManipulation;

public class AddBinary {

	public static String addBinary(String a, String b) {
		int c = 0;
		String sum = "";
		int lenA = a.length() - 1;
		int lenB = b.length() - 1;
		int i = 0, j = 0;
		int size = lenA > lenB ? lenA : lenB;
		while (lenA >= 0 || lenB >= 0) {
			int abc = 0;
			System.out.println(lenA + " - " + lenB);
			if (lenA > 0 && lenB > 0) {
				abc = c + Integer.parseInt(a, lenA) + Integer.parseInt(b, lenB);
				lenA--;
				lenB--;
			} else if (lenA > 0 && lenB <= 0) {
				abc = c + Integer.parseInt(a, lenA);
				lenA--;

			} else if (lenA < 0 && lenB >= 0) {
				abc = c + Integer.parseInt(b, lenB);
				lenB--;
			}
			if (abc == 2) {
				c = 1;
				sum += "1";

			} else if (abc == 1 || abc == 0) {
				c = 0;
				sum += "" + abc;
			}

		}

		if (c == 1) {
			sum += "1";
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("11", "1"));
	}

}
