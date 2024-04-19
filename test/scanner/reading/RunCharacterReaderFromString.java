package scanner.reading;

public class RunCharacterReaderFromString {

	public static void main(String[] args) {
		String input = """
				Das ist eine Eingabe,
				die über mehrere Zeilen geht.
				Und hier zu Ende ist.""";
		
		CharacterReader s = new CharacterReader(new StringInputStream(input));
		char c;
		do {
			c = s.nextChar();
			System.out.println((int)c + " " + c);
		} while(c != 0);

	}

}
