package javacoding.section1;

public class Mychar {
	private char ch;

	public Mychar(char ch) {
		this.ch = ch;
	}

	public boolean isvowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			return true;

		return false;

	}

	public boolean isnumber() {
		if (ch >= 48 && ch <= 57)
			return true;

		return false;

	}

	public boolean isalphabet() {
		if (ch >= 97 && ch <= 122)// between a and z
			return true;
		if (ch >= 65 && ch <= 90)// between A and Z
			return true;

		return false;
	}

	public boolean isconsonent() {
		// it should be alphabet and not vowel
		if (isalphabet() && !isvowel())
			return true;

		return false;
	}
}
